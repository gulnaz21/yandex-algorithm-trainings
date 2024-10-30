package Homework2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] board = new int[8][8];
        for (int i = 0; i < n; i++){
            String[] str = br.readLine().split(" ");
            int x = Integer.parseInt(str[0]) - 1;
            int y = Integer.parseInt(str[1]) - 1;
            board[x][y] = 1;
        }
        int result = 0;
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                if (board[i][j] == 1){
                    result += 4;
                    if (i != 0 && board[i - 1][j] == 1)
                        result--;
                    if (j != 7 && board[i][j + 1] == 1)
                        result--;
                    if (i != 7 && board[i + 1][j] == 1)
                        result--;
                    if (j != 0 && board[i][j - 1] == 1)
                        result--;
                }
            }
        }
        System.out.println(result);
    }
}
