package Homework_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class G {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String[] str = br.readLine().split(" ");
        details(Integer.parseInt(str[0]), Integer.parseInt(str[1]), Integer.parseInt(str[2]));
    }

    private static void details(int N, int K, int M) {
        int result = 0;
        if (N < K || K < M) {
            System.out.println(0);
            return;
        }
        while (N >= K) {
            int count_K = N / K;
            N = N % K;
            for (int i = 0; i < count_K; i++) {
                result += K / M;
                N += K % M;
            }
        }
        System.out.println(result);
    }
}

