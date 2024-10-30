package Homework_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class I {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);
        int K = Integer.parseInt(str[2]);
        int[][] field = new int[N + 2][M + 2];
        for (int i = 0; i < K; i++){
            String[] line = br.readLine().split(" ");
            int p = Integer.parseInt(line[0]);
            int q = Integer.parseInt(line[1]);
            field[p][q] = 1;
        }
   /*     for (int i = 0; i < field.length; i++) {
            for ()
            System.out.print(field[i]);
        }
        func(field);*/
    }
    private static void func(char[][] field){
        for (int i = 0; i < field.length; i++){
            for (int j = 0; j < field[i].length; j++){
                int count = 0;
                if (field[i][j] != '*'){
                    if (i != 0){
                        if (field[i - 1][j] == '*')
                            count++;
                        if (j != 0 && field[i - 1][j - 1] == '*')
                            count++;
                        if (j != field[i].length - 1 && field[i - 1][j + 1] == '*')
                            count++;
                    }
                    if (i != field.length - 1){
                        if (field[i + 1][j] == '*')
                            count++;
                        if (j != 0 && field[i + 1][j - 1] == '*')
                            count++;
                        if (j != field[i].length - 1 && field[i + 1][j + 1] == '*')
                            count++;
                    }
                    if (j != 0 && field[i][j - 1] == '*')
                        count++;
                    if (j != field[i].length - 1 && field[i][j + 1] == '*')
                        count++;
                }
                if (field[i][j] != '*')
                    field[i][j] = (char) (count + '0');
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }
}
