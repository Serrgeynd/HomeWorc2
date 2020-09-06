package HomeWork2;

import java.util.Scanner;

public class Zadacha2 {
    public static void main (String[] args){
        System.out.println("Введите трехзначное число:");
        Scanner scanner = new Scanner(System.in);
        int x;
        x = scanner.nextInt();
        int a;
        a= x/100;
        int b;
        b = (x-a*100)/10;
        int c;
        c = x%10;
        if (x>999) System.out.println("Введите значение от 100 до 999");
        if (x<100) System.out.println("Введите значение от 100 до 999");
        if ((x>99)& (x<1000)) System.out.println(a+b+c);


    }

}
