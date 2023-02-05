package HE1.TASKA;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, c, d;
        Scanner in = new Scanner(System.in);
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        d = in.nextDouble();

        if (a == 0) {
            if (b != 0) {
                System.out.println("NO");
            }
            else {
                System.out.println("INF");
            }
        }
        else if (-b % a != 0) {
            System.out.println("NO");
        }
        else {
            int x = (int) (-b / a);
            if (c * x + d != 0) {
                System.out.println(x);
            }
            else {
                System.out.println("NO");
            }
        }
    }
}