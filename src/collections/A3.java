package collections;

import java.util.ArrayList;
import java.lang.Object;
public class A3 {
    public static void main(String[] args){
        ArrayList list=new ArrayList();
        list.add(10);
        list.add("yashsvi");
        list.add(true);
        list.add(28);
        list.add(12.5);
        list.add(10);
        System.out.println(list);
        ArrayList list2=new ArrayList();
        list2.add(111);
        list2.addAll(0,list);
//        System.out.println(list2);
//        list2.remove(Integer.valueOf(10));
//        list2.removeAll(list);
//        list2.removeAll(Collections.singleton(10));
        list2.removeIf(e ->e.equals(10));
        System.out.println(list2);


    }
}
