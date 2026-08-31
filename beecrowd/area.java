package beecrowd;

import java.util.Scanner;
import java.lang.Math;

public class area {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();
        
        double area_trian_retan = (A*C)/2;
        double area_circulo = 3.14159*Math.pow(C,2);
        double area_trapezio = ((A+B)*C)/2;
        double area_quadrado = Math.pow(B,2);
        double area_retangulo = A*B;
        
        System.out.printf("TRIANGULO: %.3f%n", area_trian_retan);
        System.out.printf("CIRCULO: %.3f%n", area_circulo);
        System.out.printf("TRAPEZIO: %.3f%n", area_trapezio);
        System.out.printf("QUADRADO: %.3f%n", area_quadrado);
        System.out.printf("RETANGULO: %.3f%n", area_retangulo);
        
        scanner.close();
    }
 
}