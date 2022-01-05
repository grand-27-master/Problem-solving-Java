public class RevStringbywords {
    public static void main(String[] args){
        String str="hello world";
        String answer = "";
        int i=str.length()-1;

        while(i>=0)
        {
            while(i>=0 && str.charAt(i)==' ')
            i--;

            while(i>=0 && str.charAt(i)!=' ')
            {
                answer+=str.charAt(i);
                i--;
            }

            if(i>=0)
            answer+=" ";
        }
        System.out.println(answer);

    }
}
