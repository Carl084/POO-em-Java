package beecrowd;

import java.util.Scanner;

public class maior_posicao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maior   = 0;
        int posicao = 0;

        for (int i=1; i<= 100; i++) {
            int entrada = scanner.nextInt();

            if (entrada > maior) {
                maior = entrada;
                posicao = i;
            }
        }

        System.out.println(maior);
        System.out.println(posicao);

        scanner.close();
    }
}