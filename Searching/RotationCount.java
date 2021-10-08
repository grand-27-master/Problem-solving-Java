public class RotationCount {
    public static void main(String[] args)
    {
        int[] arr = {15, 18, 2, 3, 6, 12};
        System.out.println(rotations(arr));
    }

    /* 2 methods */

    // 1) find pivot element i.e largest element in array
    /*static int rotations(int[] arr)
    {
        int max_val=0,max_index=0;

        for (int i = 0; i < arr.length; i++) {
           if(arr[i]>max_val)
           {
               max_val=arr[i];
               max_index=i;
           }
        }
        return max_index+1;*/
    // 2) find index of smallest element
   static int rotations(int[] arr)
    {
        int min_val=arr[0],min_index=-1;

        for (int i = 0; i < arr.length; i++) {
            if(min_val>arr[i])
            {
                min_val=arr[i];
                min_index=i;
            }
        }
        return min_index;
    }
}
