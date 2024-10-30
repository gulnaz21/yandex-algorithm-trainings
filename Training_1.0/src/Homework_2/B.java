package Homework_2;

import java.util.Scanner;

public class B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int previousNumber = sc.nextInt();
        int currentNumber = sc.nextInt();;
        int flag = 0;
        while (currentNumber != -2000000000){
            if (previousNumber == currentNumber && flag == 0)
                flag = 1;
            if (previousNumber < currentNumber && flag == 0)
                flag = 2;
            else if ((flag == 1 && previousNumber < currentNumber) || (flag == 2 && previousNumber == currentNumber))
                flag = 3;
            else if (previousNumber > currentNumber && flag == 0)
                flag = 4;
            else if ((flag == 1 && previousNumber > currentNumber) || (flag == 4 && previousNumber == currentNumber))
                flag = 5;
            else if ((flag == 2 || flag == 3) && previousNumber > currentNumber || (flag == 4 || flag == 5) && previousNumber < currentNumber)
                flag = 6;
            previousNumber = currentNumber;
            currentNumber = sc.nextInt();
        }
        switch (flag){
            case 1:
                System.out.println("CONSTANT");
                break;
            case 2:
                System.out.println("ASCENDING");
                break;
            case 3:
                System.out.println("WEAKLY ASCENDING");
                break;
            case 4:
                System.out.println("DESCENDING");
                break;
            case 5:
                System.out.println("WEAKLY DESCENDING");
                break;
            case 6:
                System.out.println("RANDOM");
                break;
        }
    }
}
