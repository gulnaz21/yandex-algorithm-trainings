package Homework3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class D {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String[] str1 = br.readLine().split(" ");
        String[] allNumbers = br.readLine().split(" ");
        int n = Integer.parseInt(str1[0]);
        int k = Integer.parseInt(str1[1]);
        Map<String, Integer> numberWithIndex = new HashMap<>();
        for (int i = 0; i < n; i++){
            if (!numberWithIndex.containsKey(allNumbers[i])){
                numberWithIndex.put(allNumbers[i], i);
            }
            else {
                if (i - numberWithIndex.get(allNumbers[i]) > k){
                    numberWithIndex.put(allNumbers[i], i);
                }
                else{
                    System.out.println("YES");
                    return;
                }
            }
        }
        System.out.println("NO");
    }
}
