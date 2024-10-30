package Homework3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class E {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        Map<Integer, Integer> numbers = new TreeMap<>();
        Set<String> currentSet = new HashSet<>();
        for (int i = 0; i < 3; i++){
            int n = Integer.parseInt(br.readLine());
            String[] str = br.readLine().split(" ");
            for (int j = 0; j < n; j++){
                int currentNumber = Integer.parseInt(str[j]);
                if (numbers.get(currentNumber) == null)
                    numbers.put(currentNumber, 1);
                else if (!currentSet.contains(str[j]))
                    numbers.put(currentNumber, numbers.get(currentNumber) + 1);
                currentSet.add(str[j]);
            }
            currentSet.clear();
        }
        for(Map.Entry<Integer,Integer> entry : numbers.entrySet()) {
            if (entry.getValue() >= 2) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
