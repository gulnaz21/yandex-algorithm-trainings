package Homework_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class C {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String phoneNumber = numberFormatting(br.readLine());
        String firstNumber = numberFormatting(br.readLine());
        String secondNumber = numberFormatting(br.readLine());
        String thirdNumber = numberFormatting(br.readLine());
        numberCheck(phoneNumber, firstNumber);
        numberCheck(phoneNumber, secondNumber);
        numberCheck(phoneNumber, thirdNumber);
    }
    private static String numberFormatting(String number){
        StringBuilder sb = new StringBuilder(11);
        int i = 0;
        if (number.charAt(0) == '+' && number.charAt(1) == '7'){
            i = 2;
            sb.append('8');
        }
        while (i < number.length()){
            if (number.charAt(i) != '(' && number.charAt(i) != ')'
                && number.charAt(i) != '-')
                sb.append(number.charAt(i));
            i++;
        }
        if (sb.length() == 7)
            sb.insert(0, "8495");
        return sb.toString();
    }
    private static void numberCheck(String phoneNumber, String verificationNumber){
        if (phoneNumber.equals(verificationNumber))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
