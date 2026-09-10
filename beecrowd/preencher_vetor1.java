package beecrowd;

import java.util.Scanner;

public class preencher_vetor1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] N = new int[10];

        int X = sc.nextInt();

        if (X <= 50) {

            for (int i = 0; i < 10; i++) {
                
                if (i == 0) {
                    N[i] = X;
                } else {
                    N[i] = N[i-1]*2;
                }
            }
            
            for (int i = 0; i < 10; i++) {
                System.out.println("N["+i+"] = "+N[i]);
            }

        }

        sc.close();

    }
}
