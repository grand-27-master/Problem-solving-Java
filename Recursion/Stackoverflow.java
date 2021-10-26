public class Stackoverflow {
    public static void main(String[] args){
        System.out.println(print(5));
    }


    // results in stackoverflow as n-- first passes value and then subtracts, which eventually doesn't happen at all

    static int print(int n)
    {
        if(n==0)
        return -1;
        else
        return print(n--);
    }
}
