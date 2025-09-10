package oops;

class A1{
    void m1(){
        System.out.println("Coming from m1 method");
    }
}
class B1 extends A1{
    @Override
    void m1(){
        System.out.println("Coming from m2 method");
    }
}
public class Dpoly1 {
    public static void main(String[] args){
        System.out.println("A");
        //A1 b1=new A1();
       // b1.n2() not possible
        A1 b1=new B1(); //possible
        b1.m1();
    }
}
