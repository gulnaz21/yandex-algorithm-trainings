package Homework1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str1 = br.readLine().split(" ");
        int P = Integer.parseInt(str1[0]);
        int V = Integer.parseInt(str1[1]);
        String[] str2 = br.readLine().split(" ");
        int Q = Integer.parseInt(str2[0]);
        int M = Integer.parseInt(str2[1]);
        int mid = Math.abs(Q - P);
        int sum = 1;
        if (mid <= V || mid <= M || mid <= M + V) {
            sum += mid;
            if (Math.abs(M - mid) > V)
                sum += Math.abs(M - mid);
            else
                sum += V;
            if (Math.abs(V - mid) > M)
                sum += Math.abs(V - mid);
            else
                sum += M;
        }
        else
            sum += 2 * V + 2 * M + 1;
        System.out.println(sum);
    }
}
