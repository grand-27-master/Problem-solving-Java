public class CyclicSort {
    public static void main(String[] args)
    {
        // Idea: check if the element is present at its correct index or not

        int[] arr={1,4,2,6,3,5};

        int correct_idx;
        int i=0;

        while (i<arr.length) {
            correct_idx=arr[i]-1;

            if(arr[i]!=arr[correct_idx])
            {
                int temp=arr[i];
                arr[i]=arr[correct_idx];
                arr[correct_idx]=temp;
            }
            else
            i++;
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+" ");
        }
    }
}
