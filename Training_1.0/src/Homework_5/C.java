package Homework_5;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class C {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new FileReader("input.txt"));
        int N = sc.nextInt();
        int[] left = new int[N + 1];
        int[] right = new int[N + 1];
        int prev_y = 0;
        int j = 1;
        for (int i = 0; i < N; i++){
            int x  = sc.nextInt();
            int y = sc.nextInt();
            if (i != 0) {
                if (y >= prev_y) {
                    left[j] = left[j - 1] + (y - prev_y);
                    right[j] = right[j - 1];
                } else {
                    left[j] = left[j - 1];
                    right[j] = right[j - 1] + (prev_y - y);
                }
            }
            prev_y = y;
            j++;
        }

        int M = sc.nextInt();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < M; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum;
            if (a < b){
                sum = left[b] - left[a];
            }
            else
                sum = right[a] - right[b];
            result.append(sum).append("\n");
        }
        System.out.println(result);
    }
}
