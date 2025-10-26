package tree;

import java.util.*;
public class treeSort {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("banana", "apple", "orange", "banana", "apple"));
        TreeSet<String> sortedList = removeDuplicatesAndSort(list);
        System.out.println("Sorted list:" + sortedList);
        TreeSet<String> reverseSortedList = removeDuplicatesAndSortreverse(list);
        System.out.println("Reverse sort:" + reverseSortedList);
    }

        private static TreeSet<String> removeDuplicatesAndSortreverse(ArrayList<String> inputList){
            return new TreeSet<>(Comparator.reverseOrder()){{
                addAll(inputList);
            }};
        }
        private static TreeSet<String> removeDuplicatesAndSort(ArrayList<String> inputList) {
            return new TreeSet<>(inputList);
        }
}
