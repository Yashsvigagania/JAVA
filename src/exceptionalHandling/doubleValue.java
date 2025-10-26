package exceptionalHandling;

import java.util.Scanner;
public class doubleValue {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        try{
            double value=Double.parseDouble(input);
            System.out.println(value);
        }
        catch(NumberFormatException e){
            System.out.println("Invalid input");
        }
    }
}
