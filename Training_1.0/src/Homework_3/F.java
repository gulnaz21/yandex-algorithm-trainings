package Homework_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class F {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("input.txt"));
        String firstGenome = bufferedReader.readLine();
        String secondGenome = bufferedReader.readLine();
        Set<String> set = new HashSet<>();
        StringBuilder sb = new StringBuilder(2);
        for (int i = 0; i < secondGenome.length() - 1; i++){
            sb.append(secondGenome.charAt(i));
            sb.append(secondGenome.charAt(i + 1));
            set.add(sb.toString());
            sb.setLength(0);
        }
        int count = 0;
        for (int i = 0; i < firstGenome.length() - 1; i++){
            sb.append(firstGenome.charAt(i));
            sb.append(firstGenome.charAt(i + 1));
            if (set.contains(sb.toString()))
                count++;
            sb.setLength(0);
        }
        System.out.println(count);
    }
}
