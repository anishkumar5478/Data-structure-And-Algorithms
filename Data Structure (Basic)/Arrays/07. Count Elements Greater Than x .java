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
            for(int i = 0; i <n; i++)
                arr[i] = Integer.parseInt(str[i]);
            
            int x = Integer.parseInt(read.readLine());
            System.out.println(new Solution().greaterThanX(arr, n, x));
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    // arr[]: input array
    // n: size of the array
    // x: element for which you need to return the count
    public static int greaterThanX(int arr[], int n, int x)
    {
        // Your code here
        
        int count =0 ;
        for(int i =0;i<n;i++)
        {
            if(arr[i]> x)
            {
                count++;
            }
        }
        return count;
    }
}
