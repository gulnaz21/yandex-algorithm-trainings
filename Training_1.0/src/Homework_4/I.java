package Homework_4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class I {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        int n = Integer.parseInt(br.readLine());
        Set<String> dictionary = new HashSet<>();
        Set<String> smallLetterDictionary = new HashSet<>();
        for (int i = 0; i < n; i++){
            String word = br.readLine();
            dictionary.add(word);
            smallLetterDictionary.add(word.toLowerCase());
        }
        String[] exercise = br.readLine().split(" ");
        if (exercise[0].isEmpty()){
            System.out.println(0);
            return;
        }
        int mistakes = exercise.length;
        for (int i = 0; i < exercise.length; i++){
            if (smallLetterDictionary.contains(exercise[i].toLowerCase())) {
                if (dictionary.contains(exercise[i]))
                    mistakes--;
            }
            else{
                int count_accents = 0;
                for (int j = 0; j < exercise[i].length(); j++){
                    if (exercise[i].charAt(j) >= 'A' && exercise[i].charAt(j) <= 'Z')
                        count_accents++;
                }
                if (count_accents == 1)
                    mistakes--;
            }
        }
        System.out.println(mistakes);
    }
}
