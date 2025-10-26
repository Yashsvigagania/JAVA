package practice;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        char ch=in.next().trim().charAt(0);
        System.out.println(ch);
        //System.out.println(in.next().trim());
        if(ch>='a' && ch<='z'){
            System.out.println("lower case");
        }
        else{
            System.out.println("upper case");
        }
    }
}
