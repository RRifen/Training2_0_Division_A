package HE1.TASKD;

import java.util.Scanner;

public class Main {
    public static int[] bodies;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int firstIndex;
        int secondIndex;

        bodies = new int[N];
        for(int i = 0; i < N; i++) {
            bodies[i] = i;
        }

        int temp;
        for(int i = 0; i < M; i++) {
            firstIndex = in.nextInt();
            secondIndex = in.nextInt();
            temp = bodies[firstIndex - 1];
            bodies[firstIndex - 1] = bodies[secondIndex - 1];
            bodies[secondIndex - 1] = temp;
        }

        for(int i = 0; i < N - 2; i++) {
            if (bodies[i] != i) {
                swap(i, N - 2);
                swap(N - 1, bodies[N - 2]);
                while (bodies[N - 1] != N - 2 && bodies[N - 1] != N - 1) {
                    swap(N - 1, bodies[N - 1]);
                }
                swap(bodies[N - 2], N - 2);
            }
        }
        if (bodies[N - 1] == N - 2) {
            swap(N - 1, N - 2);
        }
    }

    public static void swap(int a, int b) {
        System.out.println((a + 1) + " " + (b + 1));
        int temp = bodies[a];
        bodies[a] = bodies[b];
        bodies[b] = temp;
    }

}