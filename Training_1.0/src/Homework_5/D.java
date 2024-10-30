package Homework_5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class D {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String[] str1 = br.readLine().split(" ");
        int n = Integer.parseInt(str1[0]);
        int r = Integer.parseInt(str1[1]);
        String[] str2 = br.readLine().split(" ");

        int[] distance = new int[n];
        for (int i = 0; i < n; i++){
            distance[i] = Integer.parseInt(str2[i]);
        }

        int i = 0;
        int j = 1;
        long sum = 0;
        while (j < n){
            if (distance[j] - distance[i] <= r)
                j++;
            else {
                sum += n - j;
                i++;
            }
        }
        System.out.println(sum);
    }
}
