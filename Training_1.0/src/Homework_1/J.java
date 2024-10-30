package Homework_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class J {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        double a = Double.parseDouble(br.readLine());
        double b = Double.parseDouble(br.readLine());

        double c = Double.parseDouble(br.readLine());
        double d = Double.parseDouble(br.readLine());

        double e = Double.parseDouble(br.readLine());
        double f = Double.parseDouble(br.readLine());

        double delta = (a * d) - (b * c);
        double delta_x = (e * d) - (b * f);
        double delta_y = (a * f) - (e * c);
        if (delta == 0) {
            if (a == 0 && b == 0 && c == 0 && d == 0 && e == 0 && f == 0)
                System.out.println(5);
            else if (delta_x != 0 || delta_y != 0 || (a == c && b == d && e != f))
                System.out.println(0);
            else if (a == 0 && c == 0) {
                double y0;
                if (b != 0)
                    y0 = e / b;
                else
                    y0 = f / d;
                System.out.printf("4 %.5f", y0);
            }
            else if (b == 0 && d == 0) {
                double x0;
                if (a != 0)
                    x0 = e / a;
                else
                    x0 = f / c;
                System.out.printf("3 %.5f", x0);
            }
            else {
                if (b != 0)
                    System.out.printf("1 %.5f %.5f", -(a / b), (e / b));
                else
                    System.out.printf("1 %.5f %.5f", -(c / d), (f / d));
            }
        }
        else {
            System.out.printf("2 %.5f %.5f", (delta_x / delta), (delta_y/ delta));
        }
    }
}
