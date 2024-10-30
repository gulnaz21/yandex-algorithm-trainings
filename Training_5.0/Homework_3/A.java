package Homework3;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> generalMusic = new TreeMap<>();
        for (int i = 0; i < n; i++){
            int k = Integer.parseInt(br.readLine());
            String[] str = br.readLine().split(" ");
            for (int j = 0; j < k; j++){
                if (!generalMusic.containsKey(str[j]))
                    generalMusic.put(str[j], 1);
                else
                    generalMusic.put(str[j], generalMusic.get(str[j]) + 1);
            }
        }
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(Map.Entry<String,Integer> entry : generalMusic.entrySet()) {
            if (entry.getValue() == n) {
                sb.append(entry.getKey()).append(" ");
                count++;
            }
        }
        FileWriter writer = new FileWriter("output.txt");
        writer.write(count + "\n");
        writer.write(sb.toString());
        writer.flush();
    }
}
