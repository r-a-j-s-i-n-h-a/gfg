// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        Arrays.sort(a);
        int count =0;
        int b=size/2;
        int c=0;
        for(int i=0;i<size;i++){
            if(size==1){
                return a[0];
            }
            if(i<size-1)
            {
                if(a[i]==a[i+1]){
                 count++;
                 if(i+1==size){
                     count++;
                 }
                
            }
            else{
                count=0;
            }
                if(count>=b){
                   c=a[i];
                    return c;
                 }
            
        }
        
            
            
            
        }
        return -1;
    }
}
