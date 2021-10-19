public class Palindrome {
    public static void main(String[] args) {
        String s="civic";
        String rev="";

        for (int i = s.length()-1; i >=0 ; i--) {
            rev+=s.charAt(i);
        }

        if(rev.equals(s))
        System.out.print("palindrome");
        else
        System.out.print("not palindrome");
    }
}
