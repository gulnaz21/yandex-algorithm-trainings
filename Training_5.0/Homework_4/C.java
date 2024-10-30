package Homework4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class  C {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String []str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        long m = Long.parseLong(str[1]);
        long []orcs = new long[n];
        str = br.readLine().split(" ");
        for (int i=0; i<n; i++){
            orcs[i]= Integer.parseInt(str[i]);
        }
        long [] Pref_Sum = new long[n];
        Pref_Sum[0]=orcs[0];
        for(int i =1;i<n;i++){
            Pref_Sum[i]= Pref_Sum[i-1]+orcs[i];
        }
        long result=0;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < m; i++) {
            str = br.readLine().split(" ");
            long Polk_Count = Long.parseLong(str[0]);
            long Orcs_Count = Long.parseLong(str[1]);
            result = FindFirstPosition(orcs, Polk_Count, Orcs_Count, Pref_Sum);
            sb.append(result);
            sb.append("\n");
        }
        System.out.println(sb);


    }
    private static long FindFirstPosition(long[] orcs, long l, long s, long []ps) {
        long left = 0;
        long right = orcs.length-l;
        long result = -1;
        long middle=0;

        while (left <= right) {
            middle = left + (right - left) / 2;

            if (check(orcs, middle, l, s,ps)) {
                result = middle + 1; // Номер полка начала вылазки
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        if(result+l<=orcs.length+1 && result>1 && ps[(int) (result+l-2)]-ps[(int) (result-2)] == s)
            return result;
        if(result == 1 && ps[(int) (result+l-2)] == s){
            return result;
        }
        return -1;
    }
    private static boolean check(long[] orcs, long start, long l, long s, long []ps) {
        long  sum1 = 0;
        if(start>0)
            sum1 = ps[(int) (start+l-1)]-ps[(int) (start-1)];
        else if(start == 0)
            sum1 = ps[(int) (start+l-1)];
        return sum1 <= s;
    }
}