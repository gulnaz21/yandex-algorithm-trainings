package Homework3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String firstLine = br.readLine();
        String secondLine = br.readLine();
        Map<Character, Integer> allCharacters = new HashMap<>();
        for (int i = 0; i < firstLine.length(); i++){
            if (allCharacters.containsKey(firstLine.charAt(i)))
                allCharacters.put(firstLine.charAt(i), allCharacters.get(firstLine.charAt(i)) + 1);
            else
                allCharacters.put(firstLine.charAt(i), 1);
        }
        for (int i = 0; i < secondLine.length(); i++){
            if (allCharacters.containsKey(secondLine.charAt(i)))
                allCharacters.put(secondLine.charAt(i), allCharacters.get(secondLine.charAt(i)) - 1);
            else
                allCharacters.put(secondLine.charAt(i), 1);
        }
        for (Character key : allCharacters.keySet()) {
            if (allCharacters.get(key) != 0){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
