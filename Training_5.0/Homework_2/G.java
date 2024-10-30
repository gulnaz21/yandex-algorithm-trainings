package Homework2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class G {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++){
            int n = Integer.parseInt(br.readLine());
            String[] str = br.readLine().split(" ");
            int[] array = func(str, n);
            func2(array, n);
        }
    }
    private static int[] func(String[] str, int n){
        int[] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = Integer.parseInt(str[i]);
        }
        return array;
    }
    private static void func2(int[] array, int n){
        int min = 0;
        int k = 0;
        int count = 0;
        StringBuilder sb = new StringBuilder(n + (n - 1));
        for (int i = 0; i < n; i++){
            k++;
            if (min == 0 || min > array[i]) {
                min = array[i];
            }
            if (min < k){
                sb.append(k - 1).append(" ");
                count++;
                k = 1;
            }
            if (min == k || i + 1 == n){
                sb.append(k);
                if (i + 1 != n)
                    sb.append(" ");
                count++;
                k = 0;
                min = 0;
            }
        }
        System.out.println(count);
        System.out.println(sb);
    }
}
