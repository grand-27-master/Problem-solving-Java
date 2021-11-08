public class MazePath{
    public static void main(String[] args)
    {
        System.out.println(countPath(3,3));

        printPath(3,3);
    }

    static int countPath(int r, int c)
    {
        if(r == 0 && c == 0)
        return 1;
        if (r < 0 || c < 0)
        return 0;
        return countPath(r-1, c) + countPath(r, c-1);
    }

    static void printPath(int r, int c)
    {
        if(r == 0 && c == 0)
        {
            System.out.println("(0,0)");
            return;
        }
        if (r < 0 || c < 0)
        return;

        printPath(r-1, c);
    }
}