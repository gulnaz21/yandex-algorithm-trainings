package Homework_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class G {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String[] str = br.readLine().split(" ");
        int[] array = new int[str.length];
        for (int i = 0; i < str.length; i++){
            array[i] = Integer.parseInt(str[i]);
        }
        func(array);
    }
    private static void func(int[] array){
        int positiveMax_1 = Math.max(array[0], array[1]);
        int positiveMax_2 = Math.min(array[0], array[1]);
        int negativeMax_1 = positiveMax_2;
        int negativeMax_2 = positiveMax_1;
        for (int i = 2; i < array.length; i++){
            if (array[i] < 0){
                if (negativeMax_1 >= array[i]){
                    negativeMax_2 = negativeMax_1;
                    negativeMax_1 = array[i];
                } else if (negativeMax_2 > array[i]) {
                    negativeMax_2 = array[i];
                }
            }
            else {
                if (positiveMax_1 <= array[i]){
                    positiveMax_2 = positiveMax_1;
                    positiveMax_1 = array[i];
                }
                else if (positiveMax_2 < array[i])
                    positiveMax_2 = array[i];
            }
        }
        long result_1 = (long) positiveMax_1 * positiveMax_2;
        long result_2 = (long) negativeMax_1 * negativeMax_2;
        if (result_1 >= result_2){
            System.out.println(positiveMax_2 + " " + positiveMax_1);
            return;
        }
        System.out.println(negativeMax_1 + " " + negativeMax_2);
    }
}
