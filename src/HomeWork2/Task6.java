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
        {
            if (x == 0) {

                System.out.println("нулевое число");
                return;
            }
        }
        {
            if (x > 0) {
                System.out.println("положительное ");
            } else {
                System.out.println("отрицательное ");
            }
            {
                if (y == 0) {
                    System.out.println("четное ");
                } else {
                    System.out.println("нечетное ");

                }
                System.out.println("число");
            }
        }
    }
}




