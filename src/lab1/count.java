package lab1;

import java.util.Scanner;
public class count {
    public static void main(String[] args) {
        int count =0;
        int sum=0;
        for (int a = 0; a < 100; a++) {
            if (a % 2 != 0) {
                count++;
                sum+=a;
            }
        }
        System.out.println("Print the odd number : " + count);
        System.out.println("Print the sum of odd number : " + sum);
    }
}
