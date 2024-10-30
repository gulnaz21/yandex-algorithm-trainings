package Homework_5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);
        String[] str2 = br.readLine().split(" ");
        int[] car = new int[N];
        for (int i = 0; i < N; i++){
            car[i] = Integer.parseInt(str2[i]);
        }

        int i = 0;
        int j = 0;
        int count = 0;
        int sum = 0;
        while (i < N){
            if (sum >= K){
                if (sum == K)
                    count++;
                sum -= car[i];
                i++;
            }
            else if (j != N){
                sum += car[j];
                j++;
            }
            else {
                sum = car[i];
                i++;
            }
        }
        System.out.println(count);
    }
}
