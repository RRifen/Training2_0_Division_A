package HE2.TASKC;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] chess = new int[10][10];

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int row, column;
        int P = 0;

        for(int i = 0; i < N; i++) {
            row = in.nextInt();
            column = in.nextInt();
            chess[row][column] = 1;
        }

        for(int i = 1; i < 9; i++) {
            for(int j = 1; j < 9; j++) {
                if(chess[i][j] == 1) {
                    if (chess[i + 1][j] == 0) {
                        P++;
                    }
                    if (chess[i][j + 1] == 0) {
                        P++;
                    }
                    if (chess[i - 1][j] == 0) {
                        P++;
                    }
                    if (chess[i][j - 1] == 0) {
                        P++;
                    }
                }
            }
        }
        System.out.println(P);
    }
}
