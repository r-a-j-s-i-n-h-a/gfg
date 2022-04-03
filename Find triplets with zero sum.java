class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int arr[] , int n)
    {   
       Arrays.sort(arr);
        
        
        for(int i=0;i<n;i++){
            int a=i+1;
            int b=n-1;
            while(a<b){
                if(arr[i]+arr[a]+arr[b]==0){
                    return true;
                }
                else if(arr[i]+arr[a]+arr[b]<0){
                    a++;
                }
                else{
                    b--;
                }
            }
            
            
        }
        
        return false;
        
    }
}
