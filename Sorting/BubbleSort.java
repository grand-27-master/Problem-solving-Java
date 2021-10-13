public class BubbleSort{
    public static void main(String[] args)
    {
        // Idea: to start from the first element and swap it with the next one, if it is greater than it, until the array gets sorted.

        int[] arr={1,4,2,6,3,5};

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}