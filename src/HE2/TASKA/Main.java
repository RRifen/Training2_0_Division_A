package HE2.TASKA;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        long KAndTemp = in.nextInt();
        long min;
        long max;

        min = in.nextInt();
        max = min;

        for(int i = 1; i < N; i++) {
            KAndTemp = in.nextInt();
            if (KAndTemp > max) {
                max = KAndTemp;
            }
            else if (KAndTemp < min) {
                min = KAndTemp;
            }
        }

        System.out.println(max - min);
    }
}

