package week1.beecrowd;

import java.util.Scanner;

public class beecrowd20 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your age in days: ");
        int age = scanner.nextInt();

        int years = age / 365;
        int reDays = age % 365;
        int month = reDays / 30;
        int days = reDays % 30;
        
        System.out.println("Age in months: "+ years); 
        System.out.println("Age in months: "+ month); 
        System.out.println("Age in days: "+ days); 

        scanner.close();
    }
}