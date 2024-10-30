package Homework_4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class D {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        int n = Integer.parseInt(br.readLine());
        String[] firstLine = br.readLine().split(" ");
        int k = Integer.parseInt(br.readLine());
        String[] secondLine = br.readLine().split(" ");
        int[] maxClicks = convertStringToInt(firstLine, n);
        int[] countClicks = convertStringToInt(secondLine, k);
        Map<Integer, Integer> allClicks = new TreeMap<>();
        for (int i = 0; i < k; i++){
            if (!allClicks.containsKey(countClicks[i]))
                allClicks.put(countClicks[i], 1);
            else
                allClicks.put(countClicks[i], allClicks.get(countClicks[i]) + 1);
        }
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : allClicks.entrySet()){
            if (entry.getValue() <= maxClicks[i])
                System.out.println("NO");
            else
                System.out.println("YES");
            i++;
        }
    }
    private static int[] convertStringToInt(String[] line, int size){
        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            array[i] = Integer.parseInt(line[i]);
        }
        return array;
    }
}
