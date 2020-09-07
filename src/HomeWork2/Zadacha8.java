package HomeWork2;

import java.util.Arrays;

import static sun.swing.MenuItemLayoutHelper.max;

public class Zadacha8 {
    public static void main(String[] args) {
        int[] mask = {1, -10, 5, 6, 45, -34, 0, 32, 56, -1, 2, -2};
        int max = max(mask);
        System.out.println("Максимальное значение:" + max);

        int summch = 0;
        for (int i = 0; i < mask.length; i++) if ((mask[i] < 0) & (mask[i] % 2 == 0)) summch += mask[i];
        System.out.println("Cумма отрицательных четных элементов:" + summch);

        int sump = 0;
        for (int i = 0; i < mask.length; i++) if (mask[i] > 0) sump += mask[i];
        System.out.println("Cумма положительных элементов:" + sump);

        int plus = 0;

        for (int i = 0; i < mask.length; i++)
            if (mask[i] > 0) { plus++;

                    }
                    System.out.println("Количество положительных элементов:" + plus);

        int minus = 0;
        int middlem = 0;
        for (int i = 0; i < mask.length; i++)
            if (mask[i] < 0) {
                minus++;
                if (mask[i] < 0) middlem += mask[i];}

        System.out.println("Среднее арифметическое отрицательных чисел:" + middlem / minus);
                }

            }










