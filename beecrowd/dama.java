package beecrowd;

import java.util.Scanner;

public class dama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int X1 = scanner.nextInt();
            int Y1 = scanner.nextInt();
            int X2 = scanner.nextInt();
            int Y2 = scanner.nextInt();

            // Fim da entrada
            if (X1 == 0 && Y1 == 0 && X2 == 0 && Y2 == 0) {
                break;
            }

            // Já está na casa de destino
            if (X1 == X2 && Y1 == Y2) {
                System.out.println(0);
            }
            // Mesma linha, mesma coluna ou mesma diagonal
            else if (X1 == X2 || Y1 == Y2 || Math.abs(X1 - X2) == Math.abs(Y1 - Y2)) {
                System.out.println(1);
            }
            // Qualquer outra situação
            else {
                System.out.println(2);
            }
        }

        scanner.close();
    }
}
