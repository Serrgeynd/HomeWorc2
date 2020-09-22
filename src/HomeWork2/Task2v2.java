package HomeWork2;

import java.util.Scanner;

public class Task2v2 {
    public static void main(String[] args) {
        System.out.println("Введите трехзначное число:");
        Scanner scanner = new Scanner(System.in);
        int x;
        x = scanner.nextInt();

        int sum = 0;
        while (x > 0) {
            sum = sum + x % 10;
            x = x / 10;
        }
        {
            System.out.println(sum);
        }
    }
}




