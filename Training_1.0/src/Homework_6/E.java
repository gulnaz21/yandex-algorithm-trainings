package Homework_6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class E {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        long a = Long.parseLong(br.readLine());
        long b = Long.parseLong(br.readLine());
        long c = Long.parseLong(br.readLine());
        long left = 0;
        long right = (a + b + c);
        long sum = a * 2 + b * 3 + c * 4;
        long sum_2 = a + b + c;
        while (left < right){
            long middle = (left + right) / 2;
            if ((sum + 5 * middle) * 2 >= 7 * (a + b + c + middle))
                right = middle;
            else
                left = middle + 1;
        }
        System.out.println(left);
    }
}
