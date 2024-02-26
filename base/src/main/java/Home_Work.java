public class Home_Work {
    public static void main(String[] args)
    {
        System.out.println("first_task");
        Sequence();
        System.out.println();

        System.out.println("second_task");
        Find_max_mean_Array(6);
        System.out.println();

        System.out.println("third_task");
        Prime_Numbers(2,100);
        System.out.println();

        System.out.println("fourth_task");
        Star_Output();
    }

    private static void Sequence()
    {
        for (int i = 1; i <= 14; i++)
        {
            System.out.print(i * 7 + " ");
        }
        System.out.println();
    }

    private static void Find_max_mean_Array(int n)
    {

        double[] numbers = new double[n];

        // Заполнение массива случайными числами
        for (int i = 0; i < n; i++) {
            numbers[i] = Math.random();
        }

        //System.out.println(Arrays.toString(numbers));

        double max = numbers[0];
        for (int i = 1; i < n; i++)
        {
            if (numbers[i] > max)
            {
                max = numbers[i];
            }
        }

        double sum = 0;
        for (int i = 0; i < n; i++)
        {
            sum += numbers[i];
        }
        double average = sum / n;

        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее значение: " + average);
    }


    private static void Prime_Numbers(int a, int b){
        String s = "";
        while (a < b){
            int del = 1;
            for(int i = 2; i <= a; i++)
                if (a % i == 0){
                    del += 1;
                }
            if (del == 2){
                s = s + a + " ";
                //System.out.println(n + " ");
            }
            a += 1;
        }
        System.out.println(s);
    }

    private static void Star_Output()
    {
        int n = 1;
        while (n <= 3)
        {
            for (int i = 1; i <= 5; i++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
            n += 1;
        }
    }
}

