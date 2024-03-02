import java.util.Scanner;
class interest{
    public static void main (String[] argv){
        Scanner ob = new Scanner(System.in);
        double p,t,r,i;
        System.out.println("Enter Principle");
        p = ob.nextDouble();
        System.out.println("Enter Rate");
        r = ob.nextDouble();
        System.out.println("Enter Time");
        t = ob.nextDouble();
        i = (p*t*r)/100;
        System.out.println("Interest = " + i);
    }
}