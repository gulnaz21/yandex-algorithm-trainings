package Homework3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class C {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        Map<Integer, Integer> allNumbers = new TreeMap<>();
        for (int i = 0; i < n; i++){
            int number = Integer.parseInt(str[i]);
            if (!allNumbers.containsKey(number))
                allNumbers.put(number, 1);
            else
                allNumbers.put(number, allNumbers.get(number) + 1);
        }
        int max = 0;
        int sum = 0;
        int previous = 0;
        int count = 0;
        for(Map.Entry<Integer,Integer> entry : allNumbers.entrySet()) {
            sum += entry.getValue();
            if (entry.getKey() - previous == 1 && previous != 0) {
                int temp = entry.getValue() + allNumbers.get(previous);
                if (temp > max) {
                    max = temp;
                    count++;
                }
            }
            previous = entry.getKey();
        }
        if (allNumbers.size() == 1)
            System.out.println(0);
        else if (count == 0) {
            System.out.println(sum - 1);
        } else
            System.out.println(sum - max);
    }
}
