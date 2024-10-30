package Homework_3;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class D {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new FileReader("input.txt"));
        String line;
        StringBuilder sb = new StringBuilder();
        Set<String> set = new HashSet<>();
        while ((line = sc.readLine()) != null){
            int i = 0;
            if (line.isEmpty())
                break;
            while (i <= line.length()){
                if (i == line.length() || line.charAt(i) == ' ') {
                    set.add(sb.toString());
                    sb.setLength(0);
                }
                else
                    sb.append(line.charAt(i));
                i++;
            }
        }
        FileWriter writer = new FileWriter("output.txt");
        writer.write(set.size() + "\n");
        writer.flush();
    }
}