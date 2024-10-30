package Homework_6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);
        String[] line_1 = br.readLine().split(" ");
        String[] line_2 = br.readLine().split(" ");
        int[] firstArray = StringToInt(line_1, N);
        int[] secondArray = StringToInt(line_2, K);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < K; i++){
            int number = binSearch(secondArray[i], firstArray, N);
            if (number == secondArray[i])
                sb.append("YES");
            else
                sb.append("NO");
            sb.append("\n");
        }
        System.out.println(sb);
    }
    private static int[] StringToInt(String[] str, int count){
        int[] array = new int[count];
        for (int i = 0; i < count; i++){
            array[i] = Integer.parseInt(str[i]);
        }
        return array;
    }
    private static int binSearch(int number, int[] array, int count){
        int l = 0;
        int r = count - 1;
        while (l < r){
            int m = (l + r) / 2;
            if (array[m] >= number){
                r = m;
            }
            else
                l = m + 1;
        }
        return array[l];
    }
}
