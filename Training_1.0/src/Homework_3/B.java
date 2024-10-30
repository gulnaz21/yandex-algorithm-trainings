package Homework_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String[] line1 = sc.readLine().split(" ");
        String[] line2 = sc.readLine().split(" ");
        Set<Integer> firstSet = new HashSet<>();
        Set<Integer> secondSet = new TreeSet<>();
        for (String i : line1){
            firstSet.add(Integer.parseInt(i));
        }
        for (String i : line2){
            secondSet.add(Integer.parseInt(i));
        }
        secondSet.retainAll(firstSet);
        for (int i : secondSet){
            System.out.print(i + " ");
        }
    }
}

