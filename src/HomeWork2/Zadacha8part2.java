package HomeWork2;

public class Zadacha8part2 {

    public static void main(String[] args) {
        int[] mask = {1, -10, 5, 6, 45, -34, 0, 32, 56, -1, 2, -2};

            int minus = 0;
        int middlem = 0;
            for (int i = 0; i < mask.length; i++) if (mask[i] < 0) { minus++;

             if (mask[i] < 0) middlem += mask[i];

                System.out.println("Среднее арифметическое отрицательных чисел:"+middlem/minus);
            }



    }

    }



