package Homework1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str1 = br.readLine().split(":");
        int game1_1 = Integer.parseInt(str1[0]);
        int game1_2 = Integer.parseInt(str1[1]);
        String[] str2 = br.readLine().split(":");
        int game2_1 = Integer.parseInt(str2[0]);
        int game2_2 = Integer.parseInt(str2[1]);
        int type = Integer.parseInt(br.readLine());
        int result = func(game1_1, game1_2, game2_1, game2_2, type);
        System.out.println(result);
    }
    private static int func(int game1_1, int game1_2, int game2_1, int game2_2, int type){
        int sum_1 = game1_1 + game2_1;
        int sum_2 = game1_2 + game2_2;
        if (sum_1 > sum_2)
            return 0;
        else if (sum_1 == sum_2){
            if (type == 1 && game2_1 > game1_2)
                return 0;
            else if (type == 2 && game1_1 > game2_2)
                return 0;
            return 1;
        }
        else {
            int diff = sum_2 - sum_1;
            if (type == 1 && game2_1 + diff <= game1_2)
                return diff + 1;
            else if (type == 2 && game1_1 <= game2_2)
                return diff + 1;
            return diff;
        }
    }
}
