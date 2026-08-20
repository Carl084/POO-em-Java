package day1.List;

public class area_circle {

    public static void main(String[] args) {

        double radius = Double.parseDouble(args[0]);

        double pi     = 3.14159;
        double result = pi*(radius*radius);

        System.out.printf("Area of a circle: %.5f", result);
    }
}