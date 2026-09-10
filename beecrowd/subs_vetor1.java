package beecrowd;

import java.util.Scanner;

public class subs_vetor1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] X = new int[10];

        for (int i = 0; i < 10; i++) {

            int Y = sc.nextInt();

            if (Y <= 0) {
                X[i] = 1;
            } else {
                X[i] = Y;
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("X["+i+"] = "+X[i]);
        }

        sc.close();
    }
}
