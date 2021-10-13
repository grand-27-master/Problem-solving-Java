public class SelectionSort {
    public static void main(String[] args)
    {
        // Idea: find min/max element in array and place it at first/last index, until array gets sorted

        int[] arr={1,4,2,6,3,5};

        for (int i = 0; i < arr.length-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < arr.length; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
 
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
