package HomeWork2;

import java.util.Scanner;

public class Zadacha4 {
    public static void main(String[] args){
        System.out.println("Введите целое число");
        Scanner scanner = new Scanner(System.in);
        int x;
        x = scanner.nextInt();
        if (x>(0)) System.out.println(x+1);
        if (x<(0)) System.out.println(x-2);
        if (x==(0)) System.out.println(10);
}
}
