import java.util.Scanner;
public class circle {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        double r,a,c;
        System.out.println("Enter radius of a circle");
        r = ob.nextDouble();
        a = 3.14*r*r;
        c = 2*3.14*r;
        System.out.println("Area = " + a);
        System.out.println("Circumference = " + c);
    }
}
