class Solution {
    int MissingNumber(int array[], int n) {
        Arrays.sort(array);
        int sum =0;
        int sum1=0;
        for(int i=0;i<n-1;i++){
           sum +=array[i];
            
        }
        for(int i=1;i<=n;i++){
            sum1+=i;
        }
        return sum1-sum;
        
        
    }
    
}
