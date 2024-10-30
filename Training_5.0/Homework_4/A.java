package Homework4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        int N = Integer.parseInt(br.readLine());
        String[] str1 = br.readLine().split(" ");
        int[] allNumbers = new int[N];
        for (int i = 0; i < N; i++){
            allNumbers[i] = Integer.parseInt(str1[i]);
        }
        Arrays.sort(allNumbers);
        int K = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < K; i++){
            String[] str = br.readLine().split(" ");
            int L = Integer.parseInt(str[0]);
            int R = Integer.parseInt(str[1]);
            if (N == 1){
                if (allNumbers[0] >= L && allNumbers[0] <= R)
                    sb.append(1);
                else
                    sb.append(0);
            }
            else {
                int left_border = binarySearchLeft(allNumbers, 0, N - 1, L);
                int right_border = binarySearchRight(allNumbers, 0, N - 1, R);
                if (right_border - left_border < 0) {
                    sb.append(0);
                }
                else
                    sb.append(right_border - left_border + 1);
            }
            sb.append(" ");
        }
        System.out.println(sb);
    }
    private static int binarySearchLeft(int[] allNumbers, int left_border, int right_border, int L){
        while (left_border < right_border){
            int middle = (left_border + right_border) / 2;
            if (allNumbers[middle] >= L)
                right_border = middle;
            else
                left_border = middle + 1;
        }
        return left_border;
    }
    private static int binarySearchRight(int[] allNumbers, int left_border, int right_border, int R){
        while (left_border < right_border){
            int middle = (left_border + right_border + 1) / 2;
            if (allNumbers[middle] <= R)
                left_border = middle;
            else
                right_border = middle - 1;
        }
        if (allNumbers[right_border] <= R)
            return right_border;
        else
            return right_border - 1;
    }
}
