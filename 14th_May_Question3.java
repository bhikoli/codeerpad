import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution {
  public static void main(String[] args) {
    ArrayList<String> list_str = new ArrayList<String>();
    list_str.add("Ajay");
    list_str.add("Raja");
    list_str.add("Keshav");
    list_str.add("List");
    list_str.add("Set");
    list_str.add("Elephant");
    list_str.add("Drone");
    
    String str = "kLSArED"; //an external order in which it needs to be sorted
    
    ArrayList<String> list_str1 = new ArrayList<String>();
    ArrayList<Character> chars = new ArrayList<Character>();

    for (int i = 0; i < str.length(); i++) { 
      chars.add(str.charAt(i));
    }
     
    for(int i=0;i<chars.size();i++)
    {      
      for(String s:list_str)
      {
        char ch1 = Character.toLowerCase(chars.get(i));
        char ch2 = Character.toLowerCase(s.charAt(0));
        int compar_ch = Character.compare(ch1, ch2);
        if(compar_ch==0)      
          list_str1.add(s);
      }
      
    }
    
    System.out.println("Sorted list is : "+list_str1);
    
  }
} 