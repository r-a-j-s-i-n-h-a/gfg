class Solution{
    
    long Maximize(int arr[], int n)
    {
        Arrays.sort(arr);
        int i;
        long res = 0;
        
        for(i=0;i<n;i++)
            res+= ((long)arr[i]*(long)i)%1000000007l;

        
        
        res = res%1000000007l;
        
        return res;
    }   
}
