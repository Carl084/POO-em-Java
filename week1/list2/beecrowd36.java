package week1.list2;

import java.util.Scanner;

public class beecrowd36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entry a number 'a': ");
        double a = scanner.nextDouble();
        
        System.out.println("Entry a number 'b': ");
        double b = scanner.nextDouble();
        
        System.out.println("Entry a number 'c': ");
        double c = scanner.nextDouble();

        double delta = (b * b)-(4 * a * c);

        if (delta <= 0) {
            System.out.println("Impossible calculation!");
        }

        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.printf("Soucer x1: %.5f%n",x1);
        System.out.printf("Soucer x2: %.5f%n",x2);

        scanner.close();
    }
}
