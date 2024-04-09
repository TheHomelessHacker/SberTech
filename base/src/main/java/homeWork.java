public class homeWork {
    public static void main(String[] args) {
        System.out.println("first_task");
        sequence();
        System.out.println();

        System.out.println("second_task");
        findMaxMeanArray(6);
        System.out.println();

        System.out.println("third_task");
        primeNumbers(2, 100);
        System.out.println();

        System.out.println("fourth_task");
        starOutput();
    }

    private static void sequence() {
        for (int i = 1; i <= 14; i++) {
            System.out.print(i * 7 + " ");
        }
        System.out.println();
    }

    private static void findMaxMeanArray(int n) {

        double[] numbers = new double[n];

        // Заполнение массива случайными числами
        for (int position = 0; position < n; position++) {
            numbers[position] = Math.random();
        }

        //System.out.println(Arrays.toString(numbers));

        double max = numbers[0];
        for (int position = 1; position < n; position++) {
            if (numbers[position] > max) {
                max = numbers[position];
            }
        }

        double sum = 0;
        for (int position = 0; position < n; position++) {
            sum += numbers[position];
        }
        double average = sum / n;

        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее значение: " + average);
    }


    private static void primeNumbers(int leftBorder, int rightBorder) {
        String answer = "";
        while (leftBorder < rightBorder) {
            int del = 1;
            for (int numbers = 2; numbers <= leftBorder; numbers++)
                if (leftBorder % numbers == 0) {
                    del += 1;
                }
            if (del == 2) {
                answer = answer + leftBorder + " ";
                //System.out.println(n + " ");
            }
            leftBorder += 1;
        }
        System.out.println(answer);
    }

    private static void starOutput() {
        int rowCount = 1;
        while (rowCount <= 3) {
            for (int star = 1; star <= 5; star++) {
                System.out.print("*" + " ");
            }
            System.out.println();
            rowCount += 1;
        }
    }
}