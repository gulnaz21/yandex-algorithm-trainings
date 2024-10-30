package Homework_4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class C {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String str;
        Map<String, Integer> words = new TreeMap<>();
        while ((str = br.readLine()) != null){
            String[] line = str.split(" ");
            for (int i = 0; i < line.length; i++){
                if (!words.containsKey(line[i]))
                    words.put(line[i], 1);
                else
                    words.put(line[i], words.get(line[i]) + 1);
            }
        }

        int max = 0;
        String maxWord = "";
        for (Map.Entry<String, Integer> entry : words.entrySet()){
            if (entry.getValue() > max){
                max = entry.getValue();
                maxWord = entry.getKey();
            }
        }
        System.out.println(maxWord);
    }
}
