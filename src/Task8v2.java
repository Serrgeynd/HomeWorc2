import static sun.swing.MenuItemLayoutHelper.max;

public class Task8v2 {
    public static void main(String[] args) {
        int[] mask = {1, -10, 5, 6, 45, -34, 0, 32, 56, -1, 2, -2};
        int max = max(mask);
        int pluselementSum = 0;
        for (int i = 0; i < mask.length; i++) if (mask[i] > 0) pluselementSum += mask[i];
        int minuselementSum = 0;
        for (int i = 0; i < mask.length; i++) if ((mask[i] < 0) & (mask[i] % 2 == 0)) minuselementSum += mask[i];
        int plus = 0;
        for (int i = 0; i < mask.length; i++)
            if (mask[i] > 0) {
                plus++;
            }
        int minus = 0;
        int minuselementAverage = 0;
        for (int i = 0; i < mask.length; i++)
            if (mask[i] < 0) {
                minus++;
                if (mask[i] < 0) minuselementAverage += mask[i];
            }
        System.out.println("Максимальное значение:" + max);
        System.out.println("Cумма положительных элементов:" + pluselementSum);
        System.out.println("Cумма отрицательных четных элементов:" + minuselementSum);
        System.out.println("Количество  положительных элементов:" + plus);
        System.out.println("Среднее арифметическое отрицательных чисел:" + minuselementAverage / minus);
    }

}


