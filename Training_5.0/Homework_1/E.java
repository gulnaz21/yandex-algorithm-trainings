package Homework1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        long n = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[1]);
        int d = Integer.parseInt(str[2]);
        int i;
        for (i = 0; i < d; i++){
            long temp;
            if (n % 1000 == 0)
                break;
             for (int j = 0; j <= 9; j++){
                 temp = n * 10 + j;
                 if (temp % k == 0){
                     n = temp;
                     break;
                }
                 else if (j == 9){
                     System.out.println(-1);
                     return;
                 }
            }
        }
        System.out.print(n);
        while (i < d){
            System.out.print(0);
            i++;
        }
    }
}
