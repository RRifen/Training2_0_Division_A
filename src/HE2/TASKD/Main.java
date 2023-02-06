package HE2.TASKD;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int sum, max, temp;
        max = in.nextInt();
        sum = max;
        for(int i = 1; i < N; i++) {
            temp = in.nextInt();
            sum += temp;
            if (temp > max) {
                max = temp;
            }
        }

        if (max > sum - max) {
            System.out.println(max - (sum - max));
        }
        else {
            System.out.println(sum);
        }
    }
}
