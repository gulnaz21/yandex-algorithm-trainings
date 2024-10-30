package Homework_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class D {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        System.out.println(equation(a, b, c));
    }
    private static String equation(int a, int b, int c){
        if (a == 0) {
            if (c * c == b)
                return "MANY SOLUTIONS";
        }
        else if (c >= 0) {
            int x = (c * c - b) / a;
            int ost = (c * c - b) % a;
            if (ost == 0)
                return x + "";
        }
        return "NO SOLUTION";
    }
}
