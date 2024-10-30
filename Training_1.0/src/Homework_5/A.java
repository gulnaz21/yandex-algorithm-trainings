package Homework_5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));

        int N = Integer.parseInt(br.readLine());
        String[] firstLine = br.readLine().split(" ");
        int[] t_shirt = new int[N];
        for (int i = 0; i < N; i++){
            t_shirt[i] = Integer.parseInt(firstLine[i]);
        }

        int M = Integer.parseInt(br.readLine());
        String[] secondLine = br.readLine().split(" ");
        int[] trousers = new int[M];
        for (int i = 0; i < M; i++){
            trousers[i] = Integer.parseInt(secondLine[i]);
        }

        int[] result = new int[2];
        int i = 0;
        int j = 0;
        int temp = Math.abs(t_shirt[i] - trousers[j]);
        while (i < N && j < M){
            if (t_shirt[i] >= trousers[j]){
                if (t_shirt[i] - trousers[j] < temp) {
                    temp = t_shirt[i] - trousers[j];
                    result[0] = i;
                    result[1] = j;
                }
                j++;
            }
            else {
                if (trousers[j] - t_shirt[i] < temp) {
                    temp = trousers[j] - t_shirt[i];
                    result[0] = i;
                    result[1] = j;
                }
                i++;
            }
        }
        System.out.println(t_shirt[result[0]] + " " + trousers[result[1]]);
    }
}
