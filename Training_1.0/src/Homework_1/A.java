package Homework_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String[] str = br.readLine().split(" ");
        int troom = Integer.parseInt(str[0]);
        int tcond = Integer.parseInt(str[1]);
        String operatingMode = br.readLine();
        if ((operatingMode.equals("freeze") && troom < tcond) || (operatingMode.equals("heat")
                && troom > tcond) || operatingMode.equals("fan"))
            System.out.println(troom);
        else
            System.out.println(tcond);
    }
}
