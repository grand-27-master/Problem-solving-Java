import java.util.*;

public class IntersectionOfArrays {
    public static void main(String[] args)
    {
        int arr1[]={1, 2, 2, 2, 3, 4};
        int arr2[]={2, 2, 3, 3};

        ArrayList<Integer>ans=new ArrayList<Integer>();

        for(int i=0;i<6;i++)
    {
        int val=arr1[i];
        
        for(int j=0;j<4;j++)
        {
            if(val==arr2[j])
            {
               ans.add(val);
                arr2[j]=-1111111;
                break;
            }

        }
    }
    System.out.print(ans);
    }
}

// optimized approach: use 2 pointer method