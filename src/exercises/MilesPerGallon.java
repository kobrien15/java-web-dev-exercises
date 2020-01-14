package exercises;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){

        double milesDriven;
        double gallonsConsumed;
        double milesPerGallon;
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven this year?");
        milesDriven = input.nextDouble();
        System.out.println("How many gallons of gas have you consumed this year?");
        gallonsConsumed = input.nextDouble();

        input.close();

        milesPerGallon = milesDriven / gallonsConsumed;

        System.out.println("You averaged " + milesPerGallon + "miles per gallon.");

    }
}
