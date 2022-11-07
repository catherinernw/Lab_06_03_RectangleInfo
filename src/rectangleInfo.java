
import java.util.Scanner;
public class FuelCosts {
    public static void main(String[] args) {

        //declarations

        int gasGallons = 0;
        int fuelEfficiency = 0;
        double pricePerGallon = 0;
        String trash = ""; //used for bad input

        Scanner in = new Scanner(System.in);

        System.out.print("Please input the number of gallons in the gas tank: ");
        if(in.hasNextInt()) {
            gasGallons = in.nextInt();
            in.nextLine();
        }
        else {
            trash = in.nextLine();
            System.out.println("Please enter a valid number amount. " + trash + " is not a valid number amount.");
            System.out.println("Run the program again with a valid input.");
            System.exit(0);
        }

        System.out.print("Please input the fuel efficiency of your vehicle in miles per gallon: ");
        if(in.hasNextInt()) {
            fuelEfficiency = in.nextInt();
            in.nextLine();
        }
        else {
            trash = in.nextLine();
            System.out.println("Please enter a valid number amount. " + trash + " is not a valid number amount.");
            System.out.println("Run the program again with a valid input.");
            System.exit(0);
        }

        System.out.print("Please input the price of gas per gallon: ");
        if(in.hasNextDouble()) {
            pricePerGallon = in.nextDouble();
            in.nextLine();
        }
        else {
            trash = in.nextLine();
            System.out.println("Please enter a valid cost amount. " + trash + " is not a valid cost amount.");
            System.out.println("Run the program again with a valid input.");
            System.exit(0);
        }

        //calculations and output
        System.out.print("The cost of fuel per 100 miles of travel for a vehicle with a fuel efficiency of " + fuelEfficiency
                + " mpg while gas is " + "$");
        System.out.printf("%-2.2f:\n", pricePerGallon);

        System.out.print("$");
        System.out.printf("%-2.2f\n", ((100/fuelEfficiency) * pricePerGallon));

        System.out.println("Currently, you can travel " + (gasGallons * fuelEfficiency) + " miles with "
                + gasGallons + " gallons of gas in your vehicle at a fuel efficiency of " + fuelEfficiency + " mpg.");

    }
}