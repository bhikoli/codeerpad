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
        int input=5, sum=2;
        
        
        if(input%2!=0)
        {
          System.out.println("Given number is Prime Number: "+ input);
        }
        else
        {
          for(int i=2;i<input;i++)
          {
            System.out.println("i :"+i);
            if(i%2==0)
            {
                System.out.println("Not a prime number: "+ i);
            }
            else
            {
                System.out.println("sum :"+sum);
                
                if((sum*i) == input)
                {
                  
                  System.out.println("final Output: "+sum+ ","+i);  
                }
            }
            

          }
        }
  }
}
