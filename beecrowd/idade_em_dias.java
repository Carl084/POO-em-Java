package beecrowd;

import java.util.Scanner;

public class idade_em_dias {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int age = scanner.nextInt();

        int years = age / 365;
        int reDays = age % 365;
        int month = reDays / 30;
        int days = reDays % 30;
        
        System.out.println(years + " ano(s)"); 
        System.out.println(month + " mes(es)"); 
        System.out.println(days + " dia(s)"); 

        scanner.close();
    }
}