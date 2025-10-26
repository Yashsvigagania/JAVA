package collections;

import java.util.ArrayList;

public class A1 {
    public static void main(String[] args){
        ArrayList list=new ArrayList();
        list.add(28);
        list.add("yashsvi");
        list.add(true);
        list.add(10.4);

        ArrayList list1=new ArrayList();
        list1.add(11);
        list1.add(0,122);
        list1.add(list); //creates a subarray
        list1.addAll(list); //do not create subarray
        System.out.println(list);
        for(Object i:list){
            System.out.println(i);
        }
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
