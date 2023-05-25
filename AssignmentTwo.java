import java.util.Scanner;
// Christopher H
// This program determines if a circle is inside / overlaps with another

public class AssignmentTwo {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter coordinates and radius of circle 1
        System.out.print("Enter circle 1's center x-, y-coordinates, and radius: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double r1 = input.nextDouble();

        // Prompt the user to enter coordinates and radius of circle 2
        System.out.print("Enter circle 2's Center x-, y-coordinates, and radius: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double r2 = input.nextDouble();

        // Calculate the distance and display the result
        double distance= Math.sqrt((Math.pow((x1 - x2),2)+(Math.pow((y1 - y2),2))));
            if (distance <= r1 - r2) {
                System.out.println("Circle2 is inside Circle1"); }
            else if (distance <= r2 + r1) {
                System.out.println("Circle2 overlaps Circle1"); }
            else {
                System.out.println("Circle2 does not overlap circle1"); }

    }
}