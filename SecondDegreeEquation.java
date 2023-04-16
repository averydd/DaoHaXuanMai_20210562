import java.util.Scanner;

public class SecondDegreeEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the coefficient a: ");
        double a = input.nextDouble();

        System.out.print("Enter the coefficient b: ");
        double b = input.nextDouble();

        System.out.print("Enter the coefficient c: ");
        double c = input.nextDouble();

        boolean a_is_zero = a == 0;
        if (a_is_zero) {
            System.out.println("Error: a cannot be zero");
        } else {
            double delta = b * b - 4 * a * c;

            boolean delta_is_negative = delta < 0;
            boolean delta_is_zero = delta == 0;

            if (delta_is_negative) {
                System.out.println("There is no real solution");
            } else if (delta_is_zero) {
                double root = -b / (2 * a);
                System.out.println("The solution is x = " + root);
            } else {
                double root1 = (-b + Math.sqrt(delta)) / (2 * a);
                double root2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("The solutions are x = " + root1 + " and x = " + root2);
            }
        }
    }
}

