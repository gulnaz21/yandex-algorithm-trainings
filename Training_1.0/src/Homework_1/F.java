package Homework_1;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class F {
     public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new FileReader("input.txt"));
         String[] laptopSizes = br.readLine().split(" ");
         int firstLaptop_a = Integer.parseInt(laptopSizes[0]);
         int firstLaptop_b = Integer.parseInt(laptopSizes[1]);
         int secondLaptop_a = Integer.parseInt(laptopSizes[2]);
         int secondLaptop_b = Integer.parseInt(laptopSizes[3]);
         laptop(firstLaptop_a, firstLaptop_b, secondLaptop_a, secondLaptop_b);
     }
     private static void laptop(int a1, int b1, int a2, int b2){
         int max_firstLaptop = Math.max(a1, b1);
         int max_secondLaptop = Math.max(a2, b2);
         if (Math.abs(max_firstLaptop - max_secondLaptop) <= (max_secondLaptop - Math.min(a1, b1)) && Math.abs(max_firstLaptop - max_secondLaptop) <= (max_firstLaptop - Math.min(a2, b2))){
             System.out.print(Math.max(max_firstLaptop, max_secondLaptop) + " ");
             System.out.println(Math.min(a1, b1) + Math.min(a2, b2));
         }
         else if ((max_firstLaptop - Math.min(a2, b2)) < Math.abs(max_firstLaptop - max_secondLaptop)){
             System.out.print(Math.max(max_firstLaptop, Math.min(a2, b2)) + " ");
             System.out.println(max_secondLaptop + Math.min(a1, b1));
         }
         else if ((max_secondLaptop - Math.min(a1, b1)) < Math.abs(max_firstLaptop - max_secondLaptop)){
             System.out.print(Math.max(max_secondLaptop, Math.min(a1, b1)) + " ");
             System.out.println(max_firstLaptop + Math.min(a2, b2));
         }
     }
}
