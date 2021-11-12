public class OddEvenSum {
    public static void main(String[] args) {
        int digit=1234;
        int num,sum_even=0,sum_odd=0;

   while(digit>0)

   {

       num=digit%10;

       digit=digit/10;

       if(num%2==0)

       {

           sum_even=sum_even+num;

       }

       else

           sum_odd=sum_odd+num;

   }

   System.out.print(sum_odd+" "+sum_even);
   
    }
}
