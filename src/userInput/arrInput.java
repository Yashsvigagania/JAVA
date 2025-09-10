package userInput;

import java.util.Scanner;

public class arrInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object

        System.out.print("Enter the number of elements in the array: ");
        int n = input.nextInt(); // Read the size of the array from the user

        int[] arr = new int[n]; // Declare an array of the specified size
        //arraylist=new arraylist();
        //new capacity=oldcapacity=(oldcapacity>>1) or 1.5*oldcapacity
        //System arraycopy()
        //ensurecapacity(15) km se km
        //agr capacity badha di or glt entry ki wjha se delete krna pda pr
        //capacity utni hi rhegi pr memory pe asar na pde to use krnge trimtosize()

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = input.nextInt(); // Read each element from the user
        }

        if (n == 0) { // Handle the case of an empty array
            System.out.println("The array is empty.");
            input.close();
            return;
        }
    }
}