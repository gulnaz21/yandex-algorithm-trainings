package Homework_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class I {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        int[] num = new int[5];
        for (int i = 0; i < 5; i++){
            num[i] = Integer.parseInt(br.readLine());
        }
        boolean result = func(num[0], num[1], num[2], num[3], num[4]);
        if (result)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    private static boolean func(int A, int B, int C, int D, int E){
        if (A <= D){
            if (B <= E || C <= E)
                return true;
        }
        if (B <= D){
            if (A <= E || C <= E)
                return true;
        } if (C <= D) {
            if (B <= E || A <= E)
                return true;
        }
        return false;
    }
}
