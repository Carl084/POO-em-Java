package beecrowd;

import java.util.Scanner;

public class validar_nota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double soma = 0;
        int notasvalidas = 0;

        while (notasvalidas < 2) {
            double nota = scanner.nextDouble();
            
            if (nota < 0 || nota > 10 ) {
                System.out.println("nota invalida");
                continue;
            }
            
            soma += nota;
            notasvalidas++;
        }

        double media = soma/2;
        System.out.println("media = "+ media);

        scanner.close();
    }
}
