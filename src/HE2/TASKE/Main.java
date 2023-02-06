package HE2.TASKE;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long x1, x2, x3, y1, y2, y3, r;

        Scanner in = new Scanner(System.in);
        x1 = in.nextInt();
        y1 = in.nextInt();
        x2 = in.nextInt();
        y2 = in.nextInt();
        x3 = in.nextInt();
        y3 = in.nextInt();

        r = in.nextInt();

        long xCircleRightUp = x3 + r;
        long yCircleRightUp = y3 + r;

        long xCircleLeftDown = x3 - r;
        long yCircleLeftDown = y3 - r;

        long xRectRightUp, yRectRightUp, xRectLeftDown, yRectLeftDown;

        xRectRightUp = Math.min(xCircleRightUp, x2);
        yRectRightUp = Math.min(yCircleRightUp, y2);
        xRectLeftDown = Math.max(xCircleLeftDown, x1);
        yRectLeftDown = Math.max(yCircleLeftDown, y1);

        long counter = 0;
        long j;
        long increment;
        if (Math.abs(yRectLeftDown - y3) > Math.abs(yRectRightUp - y3)) {
            j = yRectLeftDown;
            increment = 1;
        }
        else {
            j = yRectRightUp;
            increment = -1;
        }

        long jBorder;
        if (Math.abs(yRectLeftDown - yRectRightUp) < Math.abs(j - y3)) {
            if (j == yRectLeftDown) {
                jBorder = yRectRightUp;
            }
            else {
                jBorder = yRectLeftDown;
            }
        }
        else {
            jBorder = y3;
        }

        boolean flagSuccess;
        for(long i = Math.min(x3, xRectRightUp); i >= xRectLeftDown; i--) {
            flagSuccess = false;
            for(; Math.abs(j - jBorder) != 0; j = j + increment) {
                if ((i - x3) * (i - x3) + (j - y3) * (j - y3) <= r * r) {
                    flagSuccess = true;
                    break;
                }
            }

            if (flagSuccess) {
                if (jBorder == yRectLeftDown || jBorder == yRectRightUp) {
                    counter += Math.abs(j - jBorder);
                }
                else {
                    if (increment == 1) {
                        if (Math.abs(yRectRightUp - y3) < Math.abs(j - y3)) {
                            counter += Math.abs(yRectRightUp - y3) + Math.abs(j - y3);
                        }
                        else {
                            counter += 2 * Math.abs(j - y3);
                        }
                    }
                    else {
                        if (Math.abs(yRectLeftDown - y3) < Math.abs(j - y3)) {
                            counter += Math.abs(yRectLeftDown - y3) + Math.abs(j - y3);
                        }
                        else {
                            counter += 2 * Math.abs(j - y3);
                        }
                    }
                }
            }

            if ((i - x3) * (i - x3) + (jBorder - y3) * (jBorder - y3) <= r * r) {
                counter++;
            }

        }

        if (Math.abs(yRectLeftDown - y3) > Math.abs(yRectRightUp - y3)) {
            j = yRectLeftDown;
            increment = 1;
        }
        else {
            j = yRectRightUp;
            increment = -1;
        }

        for(long i = Math.max(x3 + 1, xRectLeftDown); i <= xRectRightUp; i++) {
            flagSuccess = false;
            for(; Math.abs(j - jBorder) != 0; j = j + increment) {
                if ((i - x3) * (i - x3) + (j - y3) * (j - y3) <= r * r) {
                    flagSuccess = true;
                    break;
                }
            }

            if (flagSuccess) {
                if (jBorder == yRectLeftDown || jBorder == yRectRightUp) {
                    counter += Math.abs(j - jBorder);
                }
                else {
                    if (increment == 1) {
                        if (Math.abs(yRectRightUp - y3) < Math.abs(j - y3)) {
                            counter += Math.abs(yRectRightUp - y3) + Math.abs(j - y3);
                        }
                        else {
                            counter += 2 * Math.abs(j - y3);
                        }
                    }
                    else {
                        if (Math.abs(yRectLeftDown - y3) < Math.abs(j - y3)) {
                            counter += Math.abs(yRectLeftDown - y3) + Math.abs(j - y3);
                        }
                        else {
                            counter += 2 * Math.abs(j - y3);
                        }
                    }
                }
            }

            if ((i - x3) * (i - x3) + (jBorder - y3) * (jBorder - y3) <= r * r) {
                counter++;
            }

        }

        System.out.println(counter);

    }
}
