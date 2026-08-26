package list2;

public class even_odd {
    public static void main(String[] args) {
        int entry = Integer.parseInt(args[0]);

        if (entry % 2 == 0) {
            System.out.println("This number is even!");
        }
        else {
            System.out.println("This number is odd!");
        }

    }
}
