import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        
        // initialize userHeight and userWeight variables that the user will input
        int userHeight;
        int userWeight;

        // initialize metric conversions of height and weight
        double metricHeight;
        double metricWeight;

        // initialize BMI variable
        double bmi;

        /* initialize Scanner, prompt the user to input their height followed by their weight
        (separated by a space), then assign the two numbers to the int variables */
        Scanner input = new Scanner(System.in);
        System.out.print("\nBMI Calculator\n\nPlease input your height in inches, add a space,\nthen enter your weight in pounds: ");
        userHeight = input.nextInt();
        userWeight = input.nextInt();

        // convert the userHeight and userWeight variables to metric
        metricHeight = userHeight * 0.0254;
        metricWeight = userWeight * 0.45359237;

        // calculate BMI
        bmi = metricWeight / Math.pow(metricHeight, 2);

        // Another way to convert imperial to metric without having to use another pair of variables
        // bmi = (userWeight * 0.45359237) / Math.pow((userHeight * 0.0254),2);

        // Output the user's BMI and information from HHS
        System.out.println("\nYour BMI is " + bmi + "\n");
        System.out.println("Here is BMI information from the U.S. Department of Health and Human Services\nto evaluate your BMI.");
        System.out.println("\nUnderweight: less than 18.5\nNormal: 18.5 – 24.9\nOverweight: 25 – 29.9\nObese: 30 or greater\n");
    }
}