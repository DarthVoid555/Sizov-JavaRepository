public class Human implements Comparable<Human> {
    private String firstName;
    private String lastName;
    private int age;

    public Human(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Геттеры
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }

    // Comparable - сравниваем по имени и фамилии
    public int compareTo(Human other) {
        int result = this.firstName.compareTo(other.firstName);
        if (result == 0) {
            result = this.lastName.compareTo(other.lastName);
        }
        return result;
    }

    // equals и hashCode для HashSet
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Human human = (Human) obj;
        return age == human.age &&
                firstName.equals(human.firstName) &&
                lastName.equals(human.lastName);
    }

    public int hashCode() {
        return firstName.hashCode() + lastName.hashCode() + age;
    }

    public String toString() {
        return firstName + " " + lastName + " (" + age + ")";
    }
}