package Homework_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class H {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String[] str = br.readLine().split(" ");
        int[] array = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            array[i] = Integer.parseInt(str[i]);
        }
        func(array);
    }
    private static void func(int[] array) {
        int[] sortArray = new int[3];
        for (int i = 0; i < 3; i++)
            sortArray[i] = array[i];
        Arrays.sort(sortArray);
        int positiveMax_1 = sortArray[2];
        int positiveMax_2 = sortArray[1];
        int positiveMax_3 = sortArray[0];
        int negativeMax_1 = sortArray[0];
        int negativeMax_2 = sortArray[1];
        for (int i = 3; i < array.length; i++) {
                if (array[i] < negativeMax_1) {
                    negativeMax_2 = negativeMax_1;
                    negativeMax_1 = array[i];
                } else if (array[i] < negativeMax_2)
                    negativeMax_2 = array[i];
                if (array[i] > positiveMax_1) {
                    positiveMax_3 = positiveMax_2;
                    positiveMax_2 = positiveMax_1;
                    positiveMax_1 = array[i];
                } else if (array[i] > positiveMax_2) {
                    positiveMax_3 = positiveMax_2;
                    positiveMax_2 = array[i];
                } else if (array[i] > positiveMax_3) {
                    positiveMax_3 = array[i];
                }
        }
        long result_1 = (long) positiveMax_1 * positiveMax_2 * positiveMax_3;
        long result_2 = (long) positiveMax_1 * negativeMax_1 * negativeMax_2;
        if (result_1 > result_2)
            System.out.println(positiveMax_1 + " " + positiveMax_2 + " " + positiveMax_3);
        else
            System.out.println(negativeMax_1 + " " + negativeMax_2 + " " + positiveMax_1);
    }
}
