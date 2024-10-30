package Homework_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class E {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String[] str1 = br.readLine().split(" ");
        String N = br.readLine();
        Set<Integer> buttons = new HashSet<>();
        Set<Integer> result = new HashSet<>();
        for (String i : str1){
            buttons.add(Integer.parseInt(i));
        }
        for (int i = 0; i < N.length(); i++){
            int number = N.charAt(i) - '0';
            if (!buttons.contains(number))
                result.add(number);
        }
        System.out.println(result.size());
    }
}

