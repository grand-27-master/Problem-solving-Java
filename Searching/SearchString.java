public class SearchString{
    public static void main(String[] args)
    {
        String str="search";
        char ch='a';

        for (int i = 0; i < str.length(); i++) {
            if(ch==str.charAt(i))
            System.out.println(i);
        }
    }
}