import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution {
  public static void main(String[] args) {
    int[]  arr1 = new int[]{1, 3, 4, 5};
    int[]  arr2 = new int[]{2, 4, 6, 8}; 
    ArrayList<Integer> 
      list1 =   IntStream.of(arr1).boxed().collect(Collectors.toCollection(ArrayList::new));
    ArrayList<Integer> list2 = IntStream.of(arr2)
              .boxed().collect(Collectors.toCollection(ArrayList::new));
    list1.addAll(list2);
    Collections.sort(list1);
    System.out.print(list1);
    
  }
}
