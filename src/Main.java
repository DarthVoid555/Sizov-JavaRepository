public class Main {
    public static void main(String[] args) {
        Table table = new Table(3, 4);

        table.setValue(0, 0, 1);
        table.setValue(0, 1, 2);
        table.setValue(0, 2, 3);
        table.setValue(0, 3, 4);
        table.setValue(1, 0, 5);
        table.setValue(1, 1, 6);
        table.setValue(1, 2, 7);
        table.setValue(1, 3, 8);
        table.setValue(2, 0, 9);
        table.setValue(2, 1, 10);
        table.setValue(2, 2, 11);
        table.setValue(2, 3, 12);

        System.out.println("Таблица:");
        System.out.println(table.toString());

        System.out.println("Количество строк: " + table.rows());
        System.out.println("Количество столбцов: " + table.cols());

        System.out.println("Значение в [1,2]: " + table.getValue(1, 2));

        System.out.println("Среднее арифметическое: " + table.average());


        Table emptyTable = new Table(2, 2);
        System.out.println("Пустая таблица:");
        System.out.println(emptyTable.toString());
        System.out.println("Среднее пустой таблицы: " + emptyTable.average()); // 0.0
    }
}