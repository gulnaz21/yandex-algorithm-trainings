package Homework2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class E {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        int n = Integer.parseInt(br.readLine());
        long [][] positive = new long[n][3];       //массив с положительной разницей между подъемом и спуском
        long[][] negative = new long[n][3];        //массив с отрицательной разницей между подъемом и спуском
        long max1 = 0;                             //максимальный спуск у положительных чисел
        long max2 = 0;                             //максимальный подъем у отрицательных чисел
        int l = 0;
        int m = 0;
        int index1_max = 0;
        int index2_max = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < n; i++){
            String[] str = br.readLine().split(" ");
            long a = Long.parseLong(str[0]);
            long b = Long.parseLong(str[1]);
            if (a - b >= 0){
                count1++;
                positive[l][0] = a;
                positive[l][1] = b;
                positive[l][2] = i;
                if (max1 < b){
                    max1 = b;
                    index1_max = l;
                }
                l++;
            }
            else {
                count2++;
                negative[m][0] = a;
                negative[m][1] = b;
                negative[m][2] = i;
                if (max2 < a){
                    max2 = a;
                    index2_max = m;
                }
                m++;
            }
        }
        long result = 0;
        StringBuilder sb = new StringBuilder(n + n);
        if (count1 == 0){
            System.out.println(max2);
            sb.append(negative[index2_max][2] + 1).append(" ");
            for (int i = 0; i < count2; i++){
                if (i == index2_max)
                    continue;
                sb.append(i + 1).append(" ");
            }
        }
        else {
            for (int i = 0; i < count1; i++) {
                if (i == index1_max)
                    continue;
                result += (positive[i][0] - positive[i][1]);
                sb.append(positive[i][2] + 1).append(" ");
            }
            sb.append(positive[index1_max][2] + 1).append(" ");
            long result2 = result;
            result += positive[index1_max][0];
            if (count2 == 0){
                System.out.println(result);
            }
            else {
                result2 += (positive[index1_max][0] - positive[index1_max][1]);
                result2 += max2;
                sb.append(negative[index2_max][2] + 1).append(" ");
                for (int i = 0; i < count2; i++){
                    if (i == index2_max)
                        continue;
                    sb.append(negative[i][2]+ 1).append(" ");
                }
                System.out.println(Math.max(result, result2));
            }
        }
        System.out.println(sb);
    }
}
