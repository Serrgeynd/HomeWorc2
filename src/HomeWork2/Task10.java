package HomeWork2;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        int[] mask = {15, 10, 0, -6, -5, 3, 0, 32, 56, 0, 24, -52};
        int j = 0;
        {
            for (int i = 0; i < mask.length; i++)
                if (mask[i] != 0) {
                    int temp = mask[j];
                    mask[j] = mask[i];
                    mask[i] = temp;
                    j++;
                    System.out.println(Arrays.toString(mask));
                }
        }
    }
}