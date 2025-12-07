import java.util.*;

public class Main {
    public static void main(String[] args) {
        int N =15;
        System.out.println("1 Массив из " + N + " чисел от 0 до 100:");
        int[] array = new int[N];
        Random random = new Random();
        for (int i=0; i<N; i++){
            array[i]=random.nextInt(101);
        }
        System.out.println(Arrays.toString(array));

        System.out.println("\n2 Список на его основе:");
        List<Integer> list = new ArrayList<>();
        for (int num : array){
            list.add(num);
        }
        System.out.println(list);

        System.out.println("\n3 Сортировка по возрастанию:");
        Collections.sort(list);
        System.out.println(list);

        System.out.println("\n4 Сортировка в обратном порядке:");
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        System.out.println("\n5 Перемешивание:");
        Collections.shuffle(list);
        System.out.println(list);

        System.out.println("\n6 Циклический сдвиг на 1:");
        Collections.rotate(list,1);
        System.out.println(list);

        System.out.println("\n7 Только уникальные элементы:");
        Set<Integer> uniqueSet=new LinkedHashSet<>(list);
        List<Integer> uniqueList = new ArrayList<>(uniqueSet);
        System.out.println(uniqueList);

        System.out.println("\n8 Только дублирующиеся элементы:");
        List<Integer> duplicates=new ArrayList<>(list);
        Set<Integer> tempSet = new HashSet<>();
        Set<Integer> duplicateSet = new HashSet<>();

        for (Integer num : list){
            if (!tempSet.add(num)){
                duplicateSet.add(num);
            }
        }
        List<Integer> duplicateList=new ArrayList<>(duplicateSet);
        System.out.println(duplicateList);

        System.out.println("\n9 Массив из списка:");
        Integer[] newArray = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(newArray));

        System.out.println("\n10 Количество вхождений чисел:");
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (Integer num : list){
            frequencyMap.put(num, frequencyMap.getOrDefault(num,0)+1);
        }

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()){
            System.out.println("Число "+entry.getKey()+ " встречается " + entry.getValue()+ " раз");
        }
    }
}