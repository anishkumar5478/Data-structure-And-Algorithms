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
            
            int input[] = new int[n];
            for(int i = 0; i < n; i++)
            {
                input[i] = Integer.parseInt(str[i]);
            }
            
            int x = Integer.parseInt(read.readLine());
            Solution obj = new Solution();
            System.out.println(obj.smallerThanX(input, n, x));
            
        }
    }
} 


// } Driver Code Ends


//User function Template for Java


// arr[]: input array
// n: size of array
// x: element for which you need to find smaller than x
class Solution
{
    public static int smallerThanX(int arr[], int n, int x)
    {
        // Your code here
        
        int count =0;
        
        for( int  i= 0;i<n;i++)
        {
            if(arr[i] <x)
            {
                count++;
            }
        }
        
        return count;
    }
}
