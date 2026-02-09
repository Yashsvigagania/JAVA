/* you are given two java object list1 and list2.write a java program that uses linked hash set to
perform the following operation while preserving insertion order
1st operation:union all the unique elements from both the list
2nd operation:intersection of both list
3rd operation:difference element in list1 that are not in list2
 */

package ques;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class ques1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();
        list1.add(11);
        list1.add(4);
        list1.add(100);
        list2.add(11);
        list2.add(40);
        list2.add(2);
        System.out.println(list1);
        System.out.println(list2);
        LinkedHashSet union=new LinkedHashSet(list1);
        union.addAll(list2);
        System.out.println("1.Union: " + union);

        ArrayList intersection = new ArrayList<>(list1);
        intersection.retainAll(list2);
        System.out.println("2.Intersection: " + intersection);

        ArrayList difference = new ArrayList(list1);
        difference.removeAll(list2);
        System.out.println("3.Difference: " + difference);

    }
}
