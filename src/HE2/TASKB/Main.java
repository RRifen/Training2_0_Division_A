package HE2.TASKB;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String X = in.next();
        String Z = in.next();

        int ZLength = Z.length();
        StringBuilder forCheck = new StringBuilder(X);
        while(forCheck.length() < ZLength) {
            forCheck.append(forCheck);
        }

        boolean flagSuccess;
        int forCheckLength = forCheck.length();
        for(int i = ZLength - 1; i > -1; i--) {
            if (Z.charAt(i) == forCheck.charAt(forCheckLength - 1)) {
                flagSuccess = true;
                for(int j = 1; j < i + 1; j++) {
                    if (Z.charAt(i - j) != forCheck.charAt(forCheckLength - 1 - j)) {
                        flagSuccess = false;
                        break;
                    }
                }

                if (flagSuccess) {
                    System.out.println(Z.substring(i + 1));
                    return;
                }
            }
        }
        System.out.println(Z);
    }
}
