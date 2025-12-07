import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Human> humans = Arrays.asList(
                new Human("Александр", "Петров", 25),
                new Human("Данила", "Козловский", 30),
                new Human("Пётр", "Александров", 20),
                new Human("Анна", "Петрова", 25),
                new Human("Иван", "Сидоров", 35)
        );

        System.out.println("Исходный список:");
        printCollection(humans);

        Set<Human> hashSet = new HashSet<>(humans);
        System.out.println("\n1 HashSet (порядок непредсказуем):");
        printCollection(hashSet);

        Set<Human> linkedHashSet = new LinkedHashSet<>(humans);
        System.out.println("\n2 LinkedHashSet (порядок вставки):");
        printCollection(linkedHashSet);

        Set<Human> treeSet = new TreeSet<>(humans);
        System.out.println("\n3 TreeSet (естественный порядок по имени/фамилии):");
        printCollection(treeSet);

        Set<Human> treeSetByLastName = new TreeSet<>(new HumanComparatorByLastName());
        treeSetByLastName.addAll(humans);
        System.out.println("\n4 TreeSet с компаратором по фамилии:");
        printCollection(treeSetByLastName);

        Set<Human> treeSetByAge = new TreeSet<>(new Comparator<Human>() {
            public int compare(Human h1, Human h2) {
                return Integer.compare(h1.getAge(), h2.getAge());
            }
        });
        treeSetByAge.addAll(humans);
        System.out.println("\n5 TreeSet с компаратором по возрасту:");
        printCollection(treeSetByAge);
    }

    private static void printCollection(Collection<Human> collection) {
        for (Human human : collection) {
            System.out.println(human);
        }
    }
}