package week1.list;

import java.util.Scanner;

public class largest_three_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.printf("Largeest number: %d",num1);
        }
        else if (num2 > num3) {
            System.out.printf("Largeest number: %d",num2);
        }
        else {
            System.out.printf("Largeest number: %d",num3);
        }

        scanner.close();
    }
}
