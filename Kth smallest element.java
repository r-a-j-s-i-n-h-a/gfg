class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        Arrays.sort(arr);
        for(int i=0;i<l+r;i++){
            int t=arr[k-1];
            return t;
        }
        return 0;
        
    } 
}
