package HE1.TASKB;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[] points = new int[8];
        int x1, y1;
        int x2, y2;
        double k1, k2;
        int counter;
        for(int i = 0; i < N; i++) {
            counter = 0;

            for(int j = 0; j < 8; j++) {
                points[j] = in.nextInt();
            }

            x1 = points[0] - points[2];
            y1 = points[1] - points[3];
            x2 = points[4] - points[6];
            y2 = points[5] - points[7];
            if (x1 == x2 && y1 == y2 || x1 == -x2 && y1 == -y2) {
                counter++;
            }

            x1 = points[0] - points[4];
            y1 = points[1] - points[5];
            x2 = points[2] - points[6];
            y2 = points[3] - points[7];
            if (x1 == x2 && y1 == y2 || x1 == -x2 && y1 == -y2) {
                counter++;
            }

            x1 = points[0] - points[6];
            y1 = points[1] - points[7];
            x2 = points[2] - points[4];
            y2 = points[3] - points[5];
            if (x1 == x2 && y1 == y2 || x1 == -x2 && y1 == -y2) {
                counter++;
            }

            if (counter >= 2) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }


    }
}
