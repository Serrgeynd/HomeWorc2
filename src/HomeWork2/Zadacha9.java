package HomeWork2;

import java.util.Arrays;

public class Zadacha9 {
    public static void main(String[] args) {
        int[] mask = {15, 10, 51, -6, -5, -34, 0, 32, 56, -12, 24, -52};
        int size =mask.length;
        for (int i=0;i<mask.length/2;i++ ){
            int temp =mask[i];
            mask[i]=mask[size -1-i];
            mask[size  - 1 - i] = temp;
              }
              System.out.println(Arrays.toString(mask));

    }
}
