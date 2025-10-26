package linkedList;

import java.util.LinkedHashSet;
import java.util.Collections;
public class append {
    public static void main(String[] args){
        LinkedHashSet<Integer> set= new LinkedHashSet<>();
        set.add(5);
        set.add(13);
        set.add(23);
        set.add(28);
        int newElement=10;
        System.out.println(set);
        set.add(newElement);
        System.out.println("Appended set:" + set);
    }
}
