package Homework_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class D {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String[] str = br.readLine().split(" ");
        int[] arrayNumbers = new int[str.length];
        for (int i = 0; i < str.length; i++){
            arrayNumbers[i] = Integer.parseInt(str[i]);
        }
        int result = 0;
        for (int i = 1; i < arrayNumbers.length - 1; i++){
            if (arrayNumbers[i] > arrayNumbers[i - 1] && arrayNumbers[i] > arrayNumbers[i + 1])
                result++;
        }
        System.out.println(result);
    }
}
