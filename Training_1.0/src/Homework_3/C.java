package Homework_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

public class C {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new FileReader("input.txt"));
        String[] str = sc.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);
        Set<Integer> anya = new TreeSet<>();
        Set<Integer> boris = new TreeSet<>();
        for (int i = 0; i < N; i++){
            anya.add(Integer.parseInt(sc.readLine()));
        }
        Set<Integer> result = new TreeSet<>();
        int countAnya = 0;
        for (int i = 0; i < M; i++){
            int color = Integer.parseInt(sc.readLine());
            if (anya.contains(color))
                result.add(color);
            else
                boris.add(color);
        }
        StringBuilder sbAnya = new StringBuilder();
        for (Integer color : anya){
            if (!result.contains(color)){
                sbAnya.append(color).append(" ");
                countAnya++;
            }
        }
        System.out.println(result.size());
        func(result);
        System.out.println(countAnya);
        System.out.println(sbAnya);
        System.out.println(boris.size());
        func(boris);
    }
    private static void func(Set<Integer> set){
        StringBuilder sb = new StringBuilder();
        for (Integer color : set)
            sb.append(color).append(" ");
        System.out.println(sb);
    }
}
