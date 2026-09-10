package beecrowd;

import java.util.Scanner;

public class troca_vetor1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] N = new int[20];

        for (int i = 0; i < 20; i++) {
            int X = sc.nextInt();
            N[i] = X;
        }

        int n_inv = 19;
        for (int i = 0; i < 10; i++) {
            int cache = N[i];
            
            N[i] = N[n_inv];
            N[n_inv] = cache;
            
            n_inv--;
        }

        for (int i = 0; i < 20; i++) {
            System.out.println("N["+i+"] = "+N[i]);
        }

        sc.close();
    }
}
