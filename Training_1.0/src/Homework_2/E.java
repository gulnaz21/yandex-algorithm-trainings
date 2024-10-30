package Homework_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class E {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int[] throwRange = new int[n];
        for (int i = 0; i < n; i++){
            throwRange[i] = Integer.parseInt(str[i]);
        }
        func(throwRange, n);
    }
    private static void func(int[] array, int count){
        int result = 0;
        int max = 0;
        int temp = 0;
        for (int i = 1; i < count - 1; i++){
            if (array[max] < array[i]){
                max = i;
                temp = 0;
            }
            else if (array[i] % 10 == 5 && array[i + 1] < array[i]){
                if (temp == 0 || array[result] < array[i]){
                    result = i;
                    temp++;
                }
            }
        }
        if (max < result){
            int k = 1;
            for (int i = 0; i < array.length; i++){
                if (array[i] > array[result])
                    k++;
            }
            System.out.println(k);
        }
        else
            System.out.println(0);
    }
}
