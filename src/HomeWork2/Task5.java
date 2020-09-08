package HomeWork2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Введите 3 целых числа:");
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        int z;
        x = scanner.nextInt();
        y = scanner.nextInt();
        z = scanner.nextInt();
        {
            if ((x <= y) & (x <= z)) System.out.println(x);
            if ((y <= x) & (y <= z)) System.out.println(y);
            if ((z <= y) & (z <= x)) System.out.println(z);
        }
    }
}
