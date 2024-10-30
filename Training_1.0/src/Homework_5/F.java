package Homework_5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class F {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new FileReader("input.txt"));
        int n = sc.nextInt();
        int[] minPower = new int[n];
        for (int i = 0; i < n; i++)
            minPower[i] = sc.nextInt();
        Arrays.sort(minPower);

        int m = sc.nextInt();
        Map<Integer, Integer> models = new TreeMap<>();
        for (int i = 0; i < m; i++){
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (!models.containsKey(c) || (models.containsKey(c) && b > models.get(c))){
                models.put(c, b);
            }
        }
        int sum = 0;
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : models.entrySet()){
            if (i == n)
                break;
            if (minPower[i] <= entry.getValue()){
                while (i < n && minPower[i] <= entry.getValue()){
                    sum += entry.getKey();
                    i++;
                }
            }
        }
        System.out.println(sum);
    }
}
