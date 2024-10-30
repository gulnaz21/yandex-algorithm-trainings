package Homework2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int max = Integer.parseInt(str[0]);
        int sum = max;
        for (int i = 1; i < str.length; i++){
            int k = Integer.parseInt(str[i]);
            sum+= k;
            if (k > max)
                max = k;
        }
        if (sum - max >= max)
            System.out.println(sum);
        else
            System.out.println(max - (sum - max));
    }
}
