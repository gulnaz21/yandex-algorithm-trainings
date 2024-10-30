package Homework_6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class C {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String[] str = br.readLine().split(" ");
        int w = Integer.parseInt(str[0]);
        int h = Integer.parseInt(str[1]);
        int n = Integer.parseInt(str[2]);
        long left = 1;
        long right =  (long) n * Math.max(w, h);
        while (left < right){
            long middle = (left + right) / 2;
            long countDiplomas = (middle / w) * (middle / h);
            if (countDiplomas >= n){
                right = middle;
            }
            else
                left = middle + 1;
        }
            System.out.println(left);
    }
}
