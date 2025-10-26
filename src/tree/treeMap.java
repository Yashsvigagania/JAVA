package tree;

import java.util.*;
public class treeMap {
    public static void main(String[] args){
        String sentence="Hello, world! And hello... to the World: the big,big world";
        String[] words= sentence
                .toLowerCase()
                .replaceAll("[^a-z\\s]","")
                .split("\\s+");
        TreeMap<String, Integer> freqMap= new TreeMap<>();
        for(String word:words){
            freqMap.put(word, freqMap.getOrDefault(word,0)+1);
        }
        freqMap.forEach((word,count)-> System.out.println(word +":"+count));
    }
}
