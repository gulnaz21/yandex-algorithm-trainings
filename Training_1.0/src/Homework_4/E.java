package Homework_4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class E {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        int N = Integer.parseInt(br.readLine());
        Map<Integer, Integer> blocks = new HashMap<>();
        for (int i = 0; i < N; i++){
            String[] line = br.readLine().split(" ");
            int w = Integer.parseInt(line[0]);
            int h = Integer.parseInt(line[1]);
            if (!blocks.containsKey(w)){
                blocks.put(w, h);
            }
            else{
                if (h > blocks.get(w))
                    blocks.put(w, h);
            }
        }
        long max = 0;
        for (Map.Entry<Integer, Integer> entry : blocks.entrySet()){
            max += entry.getValue();
        }
        System.out.println(max);
    }
}
