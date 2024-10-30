package Homework2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class H {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        String[][] str2 = new String[n][m];
        for (int i = 0; i < n; i++){
            str2[i] = br.readLine().split(" ");
        }
        int[][] array = convertStringToInt(str2, n, m);

        int max_index_i = 0;
        int max_index_j = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (array[max_index_i][max_index_j] < array[i][j]){
                    max_index_i = i;
                    max_index_j = j;
                }
            }
        }

        int firstMaximum;
        int[] firstMaximum_index = new int[2];
        if (max_index_i == 0)
            firstMaximum = array[1][0];
        else
            firstMaximum = array[0][0];
        for (int i = 0; i < n; i++){
            if (i == max_index_i)
                continue;
            for (int j = 0; j < m; j++){
                if (firstMaximum < array[i][j]) {
                    firstMaximum = array[i][j];
                    firstMaximum_index[0] = i;
                    firstMaximum_index[1] = j;
                }
            }
        }

        int secondMaximum;
        int[] secondMaximum_index = new int[2];
        if (max_index_j == 0)
            secondMaximum = array[0][1];
        else
            secondMaximum = array[0][0];
        for (int j = 0; j < m; j++){
            if (j == max_index_j)
                continue;
            for (int i = 0; i < n; i++){
                if (secondMaximum < array[i][j]) {
                    secondMaximum = array[i][j];
                    secondMaximum_index[0] = i;
                    secondMaximum_index[1] = j;
                }
            }
        }

        if (firstMaximum < secondMaximum){
            System.out.println((max_index_i + 1) + " " + (firstMaximum_index[1] + 1));
        }
        else if (firstMaximum > secondMaximum)
            System.out.println((secondMaximum_index[0] + 1) + " " + (max_index_j + 1));
        else {

            firstMaximum = findMax(max_index_i, firstMaximum_index[1], n, m, array, startMax(firstMaximum_index, array, max_index_i));

            secondMaximum = findMax(firstMaximum_index[0], max_index_j, n, m, array, startMax(firstMaximum_index, array, max_index_i));

            if (firstMaximum < secondMaximum)
                System.out.println((max_index_i + 1) + " " + (firstMaximum_index[1] + 1));
            else
                System.out.println((firstMaximum_index[0] + 1) + " " + (max_index_j + 1));
        }

    }
    private static int[][] convertStringToInt(String[][] str, int n, int m) {
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = Integer.parseInt(str[i][j]);
            }
        }
        return array;
    }
    private static int startMax(int[] max_index, int[][] array, int index_i){
        if (index_i == 0){
            if (max_index[1] == 0)
                return array[1][1];
            else
                return array[1][0];
        }
        else {
            if (max_index[1] == 0)
                return array[0][1];
            else
                return array[0][0];
        }
    }
    private static int findMax(int index1, int index2, int n, int m, int[][] array, int max){
        for (int i = 0; i < n; i++){
            if (i == index1)
                continue;
            for (int j = 0; j < m; j++){
                if (j == index2)
                    continue;
                if (max < array[i][j])
                    max = array[i][j];
            }
        }
        return max;
    }
}
