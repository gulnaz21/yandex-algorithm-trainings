package Homework_4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String str;
        Map<String, Integer> wordCount = new TreeMap<>();
        StringBuilder result = new StringBuilder();
        while ((str = br.readLine()) != null && str.length() != 0) {
            String[] line = str.split(" ");
            for (int i = 0; i < line.length; i++){
                if (!wordCount.containsKey(line[i])) {
                    wordCount.put(line[i], 1);
                    result.append(0).append(" ");
                }
                else {
                    result.append(wordCount.get(line[i])).append(" ");
                    wordCount.put(line[i], wordCount.get(line[i]) + 1);
                }
            }
        }
        System.out.println(result);
    }
}
