package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class A2 {
    public static void main(String[] args) {
        ArrayList arr=new ArrayList();
        arr.ensureCapacity(5);
        arr.trimToSize();
        arr.add(10);
        arr.add(28);
        arr.add("yashsvi");
        arr.add(true);
        arr.add(12.4);
        System.out.println(arr.get(3));
        arr.set(0,11);
        ArrayList art=(ArrayList) arr.clone();
        System.out.println(art);
        System.out.println(arr);
    }
}
