package beecrowd;
import java.util.Scanner;

public class area_do_círculo {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radius = scanner.nextDouble();

        double pi     = 3.14159;
        double result = pi*(radius*radius);

        System.out.printf("A=%.4f%n", result);

        scanner.close();
    }
 
}