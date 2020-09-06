package HomeWork2;

import java.util.Scanner;

public class Zadacha1 {
    public static void main (String[] args){
        System.out.println("Введите целое число");
                Scanner scanner =new Scanner(System.in);
        int x;
        x = scanner.nextInt();
        int y;
        y = x%10;
        System.out.println(y);
          }
}
