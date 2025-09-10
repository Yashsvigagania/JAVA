package userInput;

import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);

        // Prompt the user for their name
        System.out.print("Enter your name: ");
        // Read the entire line of input as a String
        String name = sc.nextLine();

        // Prompt the user for their age
        System.out.print("Enter your age: ");
        // Read the integer input
        int age = sc.nextInt();

        // Print the collected information
        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        // Close the scanner to release resources
        sc.close();
    }
}
/*nextLine(): Reads an entire line of text, including spaces, until a newline character is encountered.
next(): Reads a single word (token) until whitespace is encountered.
nextInt(): Reads an integer value.
nextDouble(): Reads a double-precision floating-point value.
nextBoolean(): Reads a boolean value.*/

