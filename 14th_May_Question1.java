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
    
    int[] arr1 = new int[]{1,2,3,4,5};
    int[] arr2 = new int[]{1,2,5,7,9};
    int[] arr3 = new int[]{1,3,4,5,8}; 
    
    List<Integer> arrlist = new ArrayList<Integer>();
    
    int i=0,j=0,k=0,x =0;
    
    while (i <arr1.length && j<arr2.length && k<arr3.length)
    { 
                if(arr1[i]==arr2[j] && arr2[j]==arr3[k])
                { 
                  arrlist.add(arr1[i]);
                  i++;
                  j++;
                  k++;
                }
                else if (arr1[i]<arr2[j])
                    i++;                 
                else if (arr2[j]<arr3[k])
                    j++;                  
                else
                    k++;
            
        }
     
    System.out.println("Common elements in sorted array is :"+arrlist);
  }
}

 