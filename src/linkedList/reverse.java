package linkedList;

import java.util.LinkedList;
import java.util.Collections;
public class reverse {
    public static void main(String[] args){
        LinkedList<Integer> list= new LinkedList<>();
        list.add(5);
        list.add(13);
        list.add(23);
        list.add(28);
        Collections.reverse(list);
        System.out.println("Reversed list: ");
        for(int num:list){
            System.out.print(num+" ");

        }
    }

}
