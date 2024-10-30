package Homework_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class F {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int[] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = Integer.parseInt(str[i]);
        }
        func(array, n);
    }
    private static void func(int[] array, int n){
        int i = 0;
        int j = n - 1;
        StringBuilder result = new StringBuilder(n);
        StringBuilder temp = new StringBuilder(n);
        while (i < n && i != j){
            if (array[i] != array[j]){
                result.append(" ");
                if (!temp.toString().isEmpty()){
                    result.append(temp);
                    temp.delete(0, temp.length());
                    j = n - 1;
                }
                result.append(array[i]);
            }
            else {
                temp.append(array[i]);
                temp.append(" ");
                j--;
            }
            i++;
        }
        System.out.println(result.length() / 2);
        System.out.println(result.reverse());
    }
}
