import java.util.Scanner;
class std{
    public static void main(String[] argv)
    {
        Scanner ob = new Scanner(System.in);
        int roll;
        String name;
        double totalmarks;
        System.out.println("Enter rollnumber");
        roll=ob.nextInt();
        System.out.println("Enter your name");
        name=ob.next();
        System.out.println("Enter your total marks");
        totalmarks=ob.nextDouble();

        System.out.println("Roll number = " + roll);
        System.out.println("Name = " + name);
        System.out.println("Total marks = " + totalmarks);
    }
}