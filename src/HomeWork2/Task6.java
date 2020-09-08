package HomeWork2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Введите целое число:");
        Scanner scanner = new Scanner(System.in);
        int x;
        x = scanner.nextInt();
        int y;
        y = x % 2;
        int z;
        {
            if (x == (0)) {
                System.out.println("Нулевое число");
            } else if ((x > 0) & (y == 0)) {
                System.out.println("Положительное четное число");
            } else if ((x > 0) & (y != 0)) {
                System.out.println("Положительное нечетное число");
            } else if ((x < 0) & (y != 0)) {
                System.out.println("Отрицательное нечетное число");
            } else if ((x < 0) & (y == 0)) {
                System.out.println("Отрицательное четное число");
            }
        }


    }
}
