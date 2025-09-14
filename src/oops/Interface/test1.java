package oops.Interface;

interface Inter1{
    int x=112;
    void method1();
}

interface Inter2{
    int x=115;
    void method3();
}
public class test1 implements Inter1 ,Inter2{
    public static void main(String[] args){
        System.out.println("Main entry point");
        System.out.println("x");
        int x=113;
        System.out.println(x);
    }
    public void method1(){
        System.out.println("this is my method");
    }
    public void method3(){
        System.out.println("this is my method");
    }
}
//1 method functional interface
