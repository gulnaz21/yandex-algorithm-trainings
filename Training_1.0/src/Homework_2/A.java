package Homework_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String[] str = br.readLine().split(" ");
        int[] numbers = new int[str.length];
        for (int i = 0; i < str.length; i++){
            numbers[i] = Integer.parseInt(str[i]);
        }
        for (int i = 1; i < str.length; i++){
            if (numbers[i - 1] >= numbers[i]) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
