public class Searching2DArrays {
    public static void main(String[] args)
    {
        int[][] arr={{1,2},{3,4},{5,6}};
        search(arr);
    }

    static void search(int[][] arr)
    {
        int target=3;
        int n=arr.length;
        int m=arr[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i][j]==target)
                System.out.println(i+" "+j);
            }
        }
       //System.out.println(null);
    }
}
