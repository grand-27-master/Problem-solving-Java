public class LCMofNumber {
    public static void main(String[] args)
    {
        // use formula-> LCM=(a*b)/HCF

        int hcf=lcm(20,50);

        int lcm=(20*50)/hcf;

        System.out.print(lcm);
        
        
    }

    static int lcm(int a,int b)
    {
        if(a==0)
        return b;
        return lcm((b%a),a);
    }
}
