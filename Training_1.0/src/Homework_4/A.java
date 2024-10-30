package Homework_4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        int count = Integer.parseInt(br.readLine());
        Map<String, String> synonyms = new HashMap<>();
        for (int i = 0; i < count; i++){
            String[] line = br.readLine().split(" ");
            synonyms.put(line[0], line[1]);
        }
        String findWord = br.readLine();
        if (synonyms.get(findWord) != null)
            System.out.println(synonyms.get(findWord));
        else {
            for (Map.Entry<String, String> entry : synonyms.entrySet()){
                if (entry.getValue().equals(findWord)){
                    System.out.println(entry.getKey());
                    return;
                }
            }
        }
    }
}
