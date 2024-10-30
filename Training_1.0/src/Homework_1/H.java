package Homework_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class H {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        func(a, b, n, m);
    }
    private static void func(int a, int b, int n, int m){
        int min1 = n + (n - 1) * a;
        int min2 = m + (m - 1) * b;

        if (min1 + 2 * a < min2 || min2 + 2 * b < min1) {
            System.out.println(-1);
            return;
        }
        int max1 = n + (n + 1) * a;
        int max2 = m + (m + 1) * b;
        System.out.print(Math.max(min1, min2) + " ");
        System.out.println(Math.min(max1, max2));
    }
}
