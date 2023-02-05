package HE1.TASKC;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] field = new int[3][3];
        int zeroCounter = 0;
        int crossCounter = 0;
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                field[i][j] = in.nextInt();
                if (field[i][j] == 1) {
                    crossCounter++;
                } else if (field[i][j] == 2) {
                    zeroCounter++;
                }
            }
        }

        int zeroWinCounter = 0;
        int crossWinCounter = 0;
        boolean flag;
        for(int i = 0; i < 3; i++) {
            flag = false;
            for(int j = 1; j < 3; j++) {
                if (field[i][j] != field[i][0]) {
                    flag = true;
                    break;
                }
            }
            if (!flag && field[i][0] != 0) {
                if (field[i][0] == 1) {
                    crossWinCounter++;
                }
                else {
                    zeroWinCounter++;
                }
            }
        }

        for(int j = 0; j < 3; j++) {
            flag = false;
            for (int i = 1; i < 3; i++) {
                if (field[i][j] != field[0][j]) {
                    flag = true;
                    break;
                }
            }
            if (!flag && field[0][j] != 0) {
                if (field[0][j] == 1) {
                    crossWinCounter++;
                }
                else {
                    zeroWinCounter++;
                }
            }
        }

        if (field[0][0] == field[1][1] && field[1][1] == field[2][2] && field[0][0] != 0) {
            if (field[0][0] == 1) {
                crossWinCounter++;
            }
            else {
                zeroWinCounter++;
            }
        }
        if (field[0][2] == field[1][1] && field[1][1] == field[2][0] && field[0][2] != 0) {
            if (field[0][2] == 1) {
                crossWinCounter++;
            }
            else {
                zeroWinCounter++;
            }
        }

        if (crossWinCounter == 1 && zeroWinCounter == 0 && crossCounter - 1 == zeroCounter) {
            System.out.println("YES");
        }
        else if (crossWinCounter == 0 && zeroWinCounter == 1 && crossCounter == zeroCounter) {
            System.out.println("YES");
        }
        else if ((crossWinCounter + zeroWinCounter) == 0 && ((crossCounter == zeroCounter) || (crossCounter - 1 == zeroCounter))) {
            System.out.println("YES");
        }
        else if (crossWinCounter == 2 && crossCounter == 5 && zeroCounter == 4) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

    }
}
