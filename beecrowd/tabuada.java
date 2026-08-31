package beecrowd;

import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        if (N <= 2 || N >= 1000 ) {
            System.out.println("Um numero entre 2 e 1000");
        } else {
            for (int i = 1; i <= 10; i++) {
                    int resultado = (i*N);
                    System.out.println(i+" x "+N+" = "+resultado);
            }
        }
        scanner.close();
    }
}
