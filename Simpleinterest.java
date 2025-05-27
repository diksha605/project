import java.util.Scanner;

public class Simpleinterest{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("calculate simple interest");
        System.out.print("enter the value of p: ");
        double p =input.nextDouble();
        System.out.print("enter the value of r: ");
        double r = input.nextDouble();
        System.out.print("enter the value of t: ");
        double t= input.nextDouble();
        double si = (p*r*t)/100;
        System.out.println("The simple interest is " + si);

    }
}