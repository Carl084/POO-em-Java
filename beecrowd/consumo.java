package beecrowd;

import java.util.Scanner;

public class consumo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        int    X = scanner.nextInt();
        double Y = scanner.nextDouble();
    
        double km_por_litro = X/Y;
    
        System.out.printf("%.3f Km/l", km_por_litro);
        
        scanner.close();
    }
}
