class Solution
{
    public static void sort012(int a[], int n)
    {   int i;
        int count0=0;
        int count1=0;
        int count2=0;
        for(i=0;i<n;i++){
            if(a[i]==0){
                count0++;
                
            }
            if(a[i]==1){
                count1++;
                
            }
            if(a[i]==2){
                count2++;
                
            }
            // for(int k=0;k<n;k++){
                
            // }
        }
        i=0;
         while (count0 > 0) {
            a[i++] = 0;
            count0--;
        }
     
        // Then all the 1s
        while (count1 > 0) {
            a[i++] = 1;
            count1--;
        }
     
        // Finally all the 2s
        while (count2 > 0) {
            a[i++] = 2;
            count2--;
        }
    }
}
