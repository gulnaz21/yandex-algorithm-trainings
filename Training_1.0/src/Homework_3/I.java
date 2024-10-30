package Homework_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class I {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        Set<String> allStudent = new HashSet<>();
        Set<String> oneStudent = new HashSet<>();
        Set<String> temp = new HashSet<>();
        boolean flag = true;
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++){
            temp.clear();
            int M = Integer.parseInt(br.readLine());
            for (int j = 0; j < M; j++){
                temp.add(br.readLine());
            }
            oneStudent.addAll(temp);
            if (flag){
                allStudent.addAll(oneStudent);
                flag = false;
            }
            else {
                allStudent.retainAll(temp);
            }
        }
        print(allStudent);
        print(oneStudent);
    }
    private static void print(Set<String> set){
        System.out.println(set.size());
        for (String s : set){
            System.out.println(s);
        }
    }
}

