package Homework_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        if (a < (b + c) && b < (a + c) && c < (a + b))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}