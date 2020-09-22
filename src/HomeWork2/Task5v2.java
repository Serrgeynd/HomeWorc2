package HomeWork2;


import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

import static java.util.Collections.min;
import static sun.swing.MenuItemLayoutHelper.max;


public class Task5v2 {
    public static void main(String[] args) {
        System.out.println("Введите 3 целых числа:");
        Scanner scanner = new Scanner(System.in);
        int[] free = new int[3];
        for (int i = 0; i < free.length; i++)
            free[i] = scanner.nextInt();
        Arrays.sort(free);
        System.out.println(free[0]);

    }
}



