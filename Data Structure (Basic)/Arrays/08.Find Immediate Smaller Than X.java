// { Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
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
            
            for(int i =0; i < n; i++)
                arr[i] = Integer.parseInt(str[i]);
            
            int x = Integer.parseInt(read.readLine());
            System.out.println(new Solution().immediateSmaller(arr, n, x));
        }
    }
}
// } Driver Code Ends


//User function Template for Java



class Solution
{
    // Complete the function
    public static int immediateSmaller(int arr[], int n, int x)
    {
        // Your code here
        
        int res = Integer.MIN_VALUE;
        boolean flag =false;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<x )
            {
                flag =true;
                if(arr[i]>res)
                {
                    res = arr[i];
                }
           
            }
        }
        
        if(flag ==false)
        {
            return -1;
        }
        return res;
    }
}
