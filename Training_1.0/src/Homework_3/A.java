package Homework_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String[] line = br.readLine().split(" ");
        Set<String> numbers = new HashSet<>();
        numbers.addAll(Arrays.asList(line));
        System.out.println(numbers.size());
    }
}
