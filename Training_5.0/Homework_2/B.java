package Homework2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str1 = br.readLine().split(" ");
        String[] str2 = br.readLine().split(" ");
        int N = Integer.parseInt(str1[0]);
        int K = Integer.parseInt(str1[1]);
        int[] arr = new int[N];
        for (int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(str2[i]);
        }
        int result = 0;
        for (int i = 0; i < N; i++){
            int temp = 0;
            for (int j = 1; j <= K && j + i < N; j++){
                if (arr[i + j] - arr[i] > temp){
                    temp = arr[i + j] - arr[i];
                }
            }
            if (temp > result)
                result = temp;
        }
        System.out.println(result);
    }
}
