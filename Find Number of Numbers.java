class GfG
{
          public static int num(int a[], int n, int k)
          {
             int r, count = 0;
             for(int i = 0; i < n; i++)
             {
                int q = a[i];
                while(q!=0)
            {
                   r = q%10;
                 if(r==k){
                    count++;
                }
                q = q/10;
             }
       
         }
         return count;
        }
}
