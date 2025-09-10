package oops.abstraction;

 abstract public class vehicle {
    int no_tyre;
    void common(){
        System.out.println("This is a common vehicle");
    }
    abstract void stop();
    public static void main(String[] args) {
        car car = new car();
        car. no_tyre=4;
        car.stop();
    }
}

