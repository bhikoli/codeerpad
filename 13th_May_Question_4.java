import java.io.*; 
import java.util.*; 
import java.util.Arrays;
  class Solution 
{  

  int subArraySum(int arr[], int n, int sum) 
  { 
    int curr_sum, i, j;
    int[] abc = new int[10];
        // List<int> list1= new ArrayList();
    // iterate from starting point 
    for (i = 0; i < n; i++) 
    { 
      curr_sum = arr[i]; 
       
      // try all subarrays starting with 'i' 
      for (j = i + 1; j <= n; j++) 
      { 
        if (curr_sum == sum) 
        { 
          int p = j - 1; 
          System.out.println("Sum found between indexes " + i 
              + " and " + p+"\n"); 
          System.out.println("i = "+arr[i]+"  p = "+arr[p]);
          System.out.print("[");
          for(;i<=p;i++)
          {
              System.out.print(arr[i]+" ");
          } 
            System.out.print("]");
            
        } 
        if (curr_sum > sum || j == n) 
          break; 
        curr_sum = curr_sum + arr[j]; 
      } 
    } 

    System.out.println("No subarray found"); 
    return 0; 
  } 

  public static void main(String[] args) 
  { 
    Solution arraysum = new Solution(); 
    int arr[] = { 12,7,29,6, 2, 11,4,8}; 
    int n = arr.length; 
    int sum = 19; 
    arraysum.subArraySum(arr, n, sum); 
  } 
}  