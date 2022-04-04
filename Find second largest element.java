// { Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;


class Array {
	public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a[] = new int[n];
            
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            
            Solution ob = new Solution();
            
            System.out.println(ob.print2largest(a,n));
        }
        
	}
}// } Driver Code Ends


//User function Template for Java

class Solution
{ 
    public static int print2largest(int A[],int N) 
    {
        Arrays.sort(A);
        int c=A[0];
        int a=A[N-1];
        for(int i=N-1;i>=0;i--){
            if(A[i]!=a){
                int b=A[i];
                return b;
                }
            if(A[i]==c){
                return -1;
            }
                
            
            
        }
        return 0;
    }
}
        
