package beecrowd;

import java.util.Scanner;

public class menor_posicao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        if (1 > N || N > 1000) {
            System.out.println("Entre 1 e 1000");
        }

        int[] X = new int[N];

        for (int i = 0; i < X.length; i++) {
            X[i] = sc.nextInt();
        }
        
        int menor = X[0];
        int posicao = 0;
        
        for (int i = 1; i < N; i++) {
            if (X[i] < menor) {
                menor = X[i];
                posicao = i;
            }
        }

        System.out.printf("Menor valor: %d%n",menor);
        System.out.printf("Posicao: %d%n",posicao);

        sc.close();
    }
}