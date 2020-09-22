package HomeWork2;

import java.util.Scanner;

public class Task7v2 {
    public  static  void  main (String[]args){
        System.out.println("Ведите код города :");
        Scanner scanner = new Scanner(System.in);
        int kod;
        kod = scanner.nextInt();
    System.out.println("Введите время разговора");

    int time;
    time = scanner.nextInt();
    double cost;


        switch(kod) {
            case 800:
                cost = 5.0 ;

                System.out.println("Киров.");
                break;
            case 905:
                cost = 4.15 ;

                System.out.println("Москва.");
                break;
            case 194:
                cost = 1.98 ;

                System.out.println("Киров.");
                break;
            case 491:
                cost = 2.69 ;

                System.out.println("Краснодар.");
                break;

                default:
                    System.out.println("Неверный код");
                    return;
        }

        System.out.println("Стоимость разговора:  "+cost*time+ "  руб");
    }}
        
        
        


    


