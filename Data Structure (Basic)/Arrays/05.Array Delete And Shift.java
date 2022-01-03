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
            int index = Integer.parseInt(read.readLine());
            
            int arr[] = new int[n];
            for(int i =0; i< n; i++)
                arr[i] = i+1;
                
            new Solution().deleteFromArray(arr, n, index);
            for(int i = 0; i < n; i++)
                System.out.print(arr[i] + " ");
                
            System.out.println();
        }
    }
}


// } Driver Code Ends


//User function Template for Java


class Solution
{
    // Complete the function
    public static void deleteFromArray(int arr[], int n, int index)
    {
        // Your code here
        
    while(index<n-1)
    {
      arr[index] =arr[index+1];
      index++;
    }
    
    arr[n-1] =0;
    
    }
}

