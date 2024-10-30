package Homework4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        long n = Long.parseLong(br.readLine());
        long result = searchMax(n);
        System.out.println(result);
    }

    private static long searchMax(long n) {
        long l = 1;
        long r = n;
        long max= 0;
        while (l <= r) {
            long mid = l + (r - l) / 2;
            if (checkK(n, mid)) {
                max = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return max;
    }

    private static boolean checkK(long n, long k) {
        long sum=-1;
        long count =1;
        for (int i=0;k-i>0;i++){
            sum+=count*(k-i);
            sum+=count;
            count++;
            if(sum>n)
                break;
        }
        return sum <= n;
    }
}
