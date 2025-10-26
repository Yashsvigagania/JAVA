package linkedList;

import java.util.Collections;
import java.util.LinkedList;

public class link {
    public static void main(String[] args){
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.addFirst("Mango");
        fruits.addLast("Berry");
        System.out.println("LinkedList: "+fruits);
        System.out.println("LinkedList: "+fruits.get(0));
        Collections.sort(fruits);
        System.out.println("LinkedList: "+fruits);
    }
}
