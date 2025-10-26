package exceptionalHandling;

import java.util.*;
class negativeNumberException extends Exception{
    public negativeNumberException(String message){
        super(message);
    }
}
public class exceptionalHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a < 0 || b < 0) {
                throw new negativeNumberException("Error: negative number");
            }
            if (b == 0) {
                System.out.println("Cannot divide");
                continue;
            }
            double result = (double) a / b;
            System.out.printf("Result %.2f%n" + result);
            break;
        } catch (negativeNumberException nne) {
            System.out.println(nne.getMessage());
        } catch (InputMismatchException nme) {
            System.out.println("invalid");
            sc.nextLine();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
        sc.close();
    }
}
