package Homework1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long result = 0;
        for (int i = 0; i < n; i++){
            int a = Integer.parseInt(br.readLine());
            if (a / 4 > 0) {
                result += a / 4;
                a %= 4;
            }
            if (a > 0){
                if (a == 3)
                    result += 2;
                else
                    result += a;
            }
        }
        System.out.println(result);
    }
}
