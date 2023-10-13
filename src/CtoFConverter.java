import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double degreeC;
        double degreeF;
        String trash;

        do {
            System.out.println("Enter temperature in Celsius: ");
            if (in.hasNextDouble()) {
                degreeC = in.nextDouble();
                degreeF = degreeC * 9/5 + 32;

                System.out.println("Here is the temperature in Fahrenheit: " + degreeF);

                if (degreeC <= 0) {
                    System.out.println("You have entered freezing point");
                } else if (degreeC >= 100) {
                    System.out.println("You have entered boiling point");
                }
                break;
            } else {
                trash = in.nextLine();
                System.out.println("Your input of " + trash + " was incorrect.");
                System.out.println("Please rerun the program and enter a valid number.");
            }
        } while (true);

        in.close();
    }
}
