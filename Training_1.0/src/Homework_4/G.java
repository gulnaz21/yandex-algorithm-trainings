package Homework_4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class G {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        Map<String, Long> bankAccount = new HashMap<>();
        String str;
        while ((str = br.readLine()) != null){
            String[] line = str.split(" ");
            if (line[0].equals("INCOME")) {
                for (Map.Entry<String, Long> entry : bankAccount.entrySet()){
                    if (entry.getValue() >= 0) {
                        bankAccount.put(entry.getKey(), entry.getValue() * (100 + Integer.parseInt(line[1])) / 100);
                    }
                 }
            }
            else if (line[0].equals("BALANCE")) {
                if (!bankAccount.containsKey(line[1]))
                    System.out.println("ERROR");
                else
                    System.out.println(bankAccount.get(line[1]));
            }
            else {
                if (!bankAccount.containsKey(line[1])){
                    bankAccount.put(line[1], (long) 0);
                }
                if (line[0].equals("DEPOSIT")) {
                    bankAccount.put(line[1], bankAccount.get(line[1]) + Integer.parseInt(line[2]));
                } else if (line[0].equals("WITHDRAW")) {
                    bankAccount.put(line[1], bankAccount.get(line[1]) - Integer.parseInt(line[2]));
                }
                else if (line[0].equals("TRANSFER")) {
                    if (!bankAccount.containsKey(line[2]))
                        bankAccount.put(line[2], (long) 0);
                    int sum = Integer.parseInt(line[3]);
                    bankAccount.put(line[1], bankAccount.get(line[1]) - sum);
                    bankAccount.put(line[2], bankAccount.get(line[2]) + sum);
                }
            }
        }
    }
}
