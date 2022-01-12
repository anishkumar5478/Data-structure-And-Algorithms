import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        
        while(t-- >0)
        {
            int hash_size = sc.nextInt();
            int array_size = sc.nextInt();
            
            int arr[] = new int[array_size];
            for(int i = 0; i < array_size; i++)
             arr[i] = sc.nextInt();
             
            // int hash_table[] = new int[hash_size];
            // for(int i = 0; i < hash_size; i++)
            //     hash_table[i] = -1;
            Solution obj = new Solution();
            int hash_table[] = obj.linearProbing(hash_size, arr, array_size);
            
            for(int i = 0; i <hash_size; i++)
                System.out.print(hash_table[i] + " ");
             
            System.out.println();
             
        }
    }
    
}// } Driver Code Ends


class Solution{
    //Function to fill the array elements into a hash table 
    //using Linear Probing to handle collisions.
    int[] linearProbing(int hs, int arr[], int n)
    {
       int ht[] = new int[hs];
       for(int i=0;i<hs;i++){
           ht[i]=-1;
       }
       int size=0;
       int cap=hs;
       for(int i=0;i<n;i++){
       int hk = arr[i]%hs;
       if(size==cap){
           return ht;
       }
       while(((ht[hk])!=-1)&&((ht[hk])!=arr[i])){
           hk = (hk+1)%hs;
       }
       if(ht[hk]==arr[i]){
           
       }
       else{
           ht[hk] = arr[i];
           size++;
       }
       }
       return ht;
       
       
    }
