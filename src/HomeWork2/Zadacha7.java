package HomeWork2;

import java.util.Scanner;

public class Zadacha7 {
    public static void main (String[] args) {
        System.out.println("Введите код города");
        Scanner scanner = new Scanner(System.in);
        int kod;
        kod = scanner.nextInt();
        if (kod == 905) System.out.println(" Москва. Стоимость разговора: 41.5 руб");
        if (kod == 194) System.out.println(" Ростов. Стоимость разговора: 19.8 руб");
        if (kod == 491) System.out.println(" Краснодар. Стоимость разговора: 26,9 руб");
        if (kod == 800) System.out.println(" Киров. Стоимость разговора 50.0 руб");
        else if ((kod!=905) & (kod!=194) & (kod!=491) & (kod!=800))System.out.println("неверный код");
    }

}
