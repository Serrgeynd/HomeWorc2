import java.util.Scanner;

public class Task6v2 {
    public static void main(String[] args) {
        System.out.println("Введите целое число:");
        Scanner scanner = new Scanner(System.in);
        int x;
        x = scanner.nextInt();
        int y;
        y = x % 2;
        int z;


            if (x > 0) {
                System.out.println("Положительное  число");
            }if  (x < 0)  {
                System.out.println("Отрицательное число");
            }if ((x != 0) & (y != 0)) {
                System.out.println("Нечетное число");
            }if ((x != 0) & (y == 0)) {
                System.out.println("Четное число");
            }if (x==0){
            System.out.println("Нулевое число");
        }


    }
}
