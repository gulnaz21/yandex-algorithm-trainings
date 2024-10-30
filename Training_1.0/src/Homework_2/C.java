package Homework_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class C {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int x = Integer.parseInt(br.readLine());
        int[] arrayNumbers = new int[n];
        for (int i = 0; i < n; i++){
            arrayNumbers[i] = Integer.parseInt(str[i]);
        }
        int result = arrayNumbers[0];
        for (int i = 1; i < n; i++){
            if (Math.abs(x - arrayNumbers[i]) < Math.abs(x - result))
                result = arrayNumbers[i];
        }
        System.out.println(result);
    }
}
