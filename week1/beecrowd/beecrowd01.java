package week1.beecrowd;

import java.util.Scanner;

public class beecrowd01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int X = (A + B);

        System.out.printf("SOMA = %d%n",X);

        scanner.close();
    }
}
