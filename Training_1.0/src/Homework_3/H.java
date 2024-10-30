package Homework_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class H {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        int N = Integer.parseInt(br.readLine());
        Set<String> result = new HashSet<>();
        for (int i = 0; i < N; i++){
            String[] str = br.readLine().split(" ");
            result.add(str[0]);
        }
        System.out.println(result.size());
    }
}
