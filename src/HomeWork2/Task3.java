package HomeWork2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите целое цисло:");
        Scanner scanner = new Scanner(System.in);
        int x;
        x = scanner.nextInt();
        if (x > 0) {
            System.out.println(x + 1);
        } else {
            System.out.println(x);
        }
    }
}


