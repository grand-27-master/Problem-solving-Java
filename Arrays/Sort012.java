public class Sort012 {
    public static void main(String[] args)
    {

        int arr[]={0, 1, 2, 2, 1, 0};

        int count0=0,count1=0,count2=0;
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
                count0++;
            else if(arr[i]==1)
                count1++;
            else
                count2++;
        }
        
         for(int i=0;i<arr.length;i++)
         {
             if(count0>0)
             {
                 arr[i]=0;
                 count0--;
             }
             else if(count1>0)
             {
                 arr[i]=1;
                 count1--;
             }
             else{
                 arr[i]=2;
                 count2--; 
             }   
         }
        
         for(int i=0;i<arr.length;i++)
             System.out.print(arr[i]+" ");
    }
    }
