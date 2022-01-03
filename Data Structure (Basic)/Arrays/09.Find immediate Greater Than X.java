// { Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.io.*;
import java.lang.*;


class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            String str[] = read.readLine().trim().split(" ");
            
            int arr[] = new int[n];
            for(int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(str[i]);
                
            int x = Integer.parseInt(read.readLine());    
            System.out.println(new Solution().immediateGreater(arr, n, x));
        }
    }
}// } Driver Code Ends


//User function Template for Java


class Solution
{
    // Complete the function
    public static int immediateGreater(int arr[], int n, int x)
    {
        // Your code here
        
     int  min = Integer.MAX_VALUE;
      
      for(int i :arr)
      {
          
          if(i>x && min >i)
          {
              min =i;
              //System.out.println(" "+min);
          }
      }
      
      if(min == Integer.MAX_VALUE)
      {
          return -1;
      }
      return min;
      
        
        
    }
}
