package Homework1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class F {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int[] num = new int[n];
        for (int i = 0; i < str.length; i++){
            num[i] = Integer.parseInt(str[i]);
        }
        int result = num[0];
        StringBuilder sb = new StringBuilder(n - 1);
        for (int i = 1; i < n; i++){
            if (result % 2 != 0 && num[i] % 2 != 0){
                result *= num[i];
                sb.append((char) 120);
            }
            else {
                result += num[i];
                sb.append((char) 43);
            }
        }
        System.out.println(sb);
    }
}
