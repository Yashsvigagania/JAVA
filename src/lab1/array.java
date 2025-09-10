package lab1;

import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int [] num=new int[size];

        for(int i=0;i<size;i++){
            System.out.print("Element " + (i + 1) + ": ");
            num[i]=sc.nextInt();
        }
        if (size == 0) {
            System.out.println("The array is empty");
            sc.close();
            return;}

        int smallest=num[0];
        int largest=num[0];
        for(int i=1;i <= size-1;i++){
            if(num[i] < smallest){
                smallest=num[i];
            }
            else if(num[i]>largest){
                largest=num[i];
            }
        }
        System.out.println("The smallest number is:" +smallest);
        System.out.println("The largest number is:" +largest);
        sc.close();
    }
}
/*WAP to count the number of charcters in a given string, to reverse the string andcheck whether it is palindrome or not?

        5.     WAP to find out the sum of command line arguments.*/
