package Homework3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class F {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String[] str = br.readLine().split(" ");
        Map<Character, Set<String>> sortedDictionary = new TreeMap<>();
        for (int i = 0; i < str.length; i++){
            if (!sortedDictionary.containsKey(str[i].charAt(0))) {
                Set<String> set = new HashSet<>();
                set.add(str[i]);
                sortedDictionary.put(str[i].charAt(0), set);
            }
            else {
                sortedDictionary.get(str[i].charAt(0)).add(str[i]);
                sortedDictionary.put(str[i].charAt(0), sortedDictionary.get(str[i].charAt(0)));
            }
        }
        for(Map.Entry<Character,Set<String>> entry : sortedDictionary.entrySet()) {
            Set<String> sortedSet = entry.getValue().stream()
                    .sorted(Comparator.comparingInt(String::length))
                    .collect(Collectors.toCollection(LinkedHashSet::new));
            entry.setValue(sortedSet);
        }
        String[] allWords = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder(2 * allWords.length);
        for (int i = 0; i < allWords.length; i++){
            String temp = "";
            boolean flag = true;
            if (sortedDictionary.containsKey(allWords[i].charAt(0))){
                for (String word : sortedDictionary.get(allWords[i].charAt(0))){
                    if (word.length() <= allWords[i].length() && allWords[i].substring(0, word.length()).equals(word)) {
                            temp = word;
                            flag = false;
                            break;
                    }
                }
            }
            if (flag)
                sb.append(allWords[i]).append(" ");
            else
                sb.append(temp).append(" ");
        }
        System.out.println(sb);
    }
}

