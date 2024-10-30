package Homework_5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class E {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String[] line1 = br.readLine().split(" ");
        String[] line2 = br.readLine().split(" ");
        int N = Integer.parseInt(line1[0]);
        int K = Integer.parseInt(line1[1]);
        int[] colors = new int[N];
        for (int i = 0; i < N; i++){
            colors[i] = Integer.parseInt(line2[i]);
        }

        Map<Integer, Integer> countColors = new HashMap<>();
        int i = 0, j = 0;
        int start = 0, end = 0;
        while (j < N || countColors.size() == K){
            if (countColors.size() == K){
                if ((j - 1) - i < end - start || (start == 0 && end == 0)){
                    start = i;
                    end = j - 1;
                }
                countColors.put(colors[i], countColors.get(colors[i]) - 1);
                if (countColors.get(colors[i]) == 0)
                    countColors.remove(colors[i]);
                i++;
            }
            else {
                if (countColors.containsKey(colors[j]))
                    countColors.put(colors[j], countColors.get(colors[j]) + 1);
                else
                    countColors.put(colors[j], 1);
                j++;
            }
        }
        System.out.println((start + 1) + " " + (end + 1));
    }
}
