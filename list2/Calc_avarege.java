package list2;

import java.util.Scanner;

public class Calc_avarege {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();

        double avarege = (nota1 + nota2 + nota3) / 3;

        System.out.printf("Avarege: %.2f%n", avarege);

        scanner.close();
    }
}