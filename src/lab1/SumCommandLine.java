package lab1;

public class SumCommandLine {
    public static void main(String[] args) {
        int sum = 0;
        if (args.length == 0) {
            System.out.println("No command line arguments provided.");
            return; // Exit if no arguments
        }
        for (String arg : args) {
            try {
                int number = Integer.parseInt(arg);
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid argument: '" + arg + "' is not a valid number. Skipping.");
            }
        }
        System.out.println("The sum of valid command line arguments is: " + sum);
    }

}
