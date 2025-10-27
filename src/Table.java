public class Table {
    private int[][] data;
    private int rows;
    private int cols;

    public Table(int rows, int cols) {
        if (rows <= 0 || cols <= 0) {
            throw new IllegalArgumentException("Размеры таблицы должны быть положительными");
        }

        this.rows = rows;
        this.cols = cols;
        this.data = new int[rows][cols];

    }

    public int getValue(int row, int col) {
        checkBounds(row, col);
        return data[row][col];
    }

    public void setValue(int row, int col, int value) {
        checkBounds(row, col);
        data[row][col] = value;
    }

    public int rows() {
        return rows;
    }

    public int cols() {
        return cols;
    }

    public double average() {
        if (rows == 0 || cols == 0) {
            return 0.0;
        }

        long sum = 0;
        int count = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += data[i][j];
                count++;
            }
        }

        return (double) sum / count;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sb.append(data[i][j]);
                if (j < cols - 1) {
                    sb.append("\t");
                }
            }
            if (i < rows - 1) {
                sb.append("\n");
            }
        }

        return sb.toString();
    }

    private void checkBounds(int row, int col) {
        if (row < 0 || row >= rows || col < 0 || col >= cols) {
            throw new IndexOutOfBoundsException(
                    String.format("Индекс [%d,%d] выходит за границы таблицы [%d,%d]",
                            row, col, rows, cols)
            );
        }
    }

    public void fillWithValue(int value) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                data[i][j] = value;
            }
        }
    }

    public long sum() {
        long total = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                total += data[i][j];
            }
        }
        return total;
    }

    public int min() {
        if (rows == 0 || cols == 0) return 0;
        int minValue = data[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (data[i][j] < minValue) {
                    minValue = data[i][j];
                }
            }
        }
        return minValue;
    }

    public int max() {
        if (rows == 0 || cols == 0) return 0;
        int maxValue = data[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (data[i][j] > maxValue) {
                    maxValue = data[i][j];
                }
            }
        }
        return maxValue;
    }
}