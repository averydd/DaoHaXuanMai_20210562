import java.util.Scanner;

public class StarTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height of the triangle: ");
        int height = input.nextInt();
        input.close();
        
        for (int i = 1; i <= height; i++) {
            int numStars = 2 * i - 1; 
            int numSpaces = height - i; 
            for (int j = 1; j <= numSpaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= numStars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
