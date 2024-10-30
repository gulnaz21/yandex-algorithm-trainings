package Homework2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        String[][] str = new String[K][2];
        int[][] arr = new int[K][2];
        for (int i = 0; i < K; i++){
            str[i] = br.readLine().split(" ");
            for (int j = 0; j < 2; j++){
                arr[i][j] = Integer.parseInt(str[i][j]);
            }
        }
        int[] min = new int[2];
        min[0] = arr[0][0];
        min[1] = arr[0][1];
        int[] max = new int[2];
        max[0] = arr[0][0];
        max[1] = arr[0][1];
        for (int i = 1; i < K; i++){
            if (min[0] > arr[i][0])
                min[0] = arr[i][0];
            if (min[1] > arr[i][1])
                min[1] = arr[i][1];
            if (max[0] < arr[i][0])
                max[0] = arr[i][0];
            if (max[1] < arr[i][1])
                max[1] = arr[i][1];
        }
        System.out.println(min[0] + " " + min[1] + " " + max[0] + " " + max[1]);
    }
}
