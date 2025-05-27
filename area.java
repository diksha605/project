import java.util.Scanner;
public class area{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("enter the value of b: ");
        double b = input.nextDouble();
        System.out.print("enter the value of h: ");
        double h = input.nextDouble();
        double area = 0.5*b*h;
        System.out.println("Area of triangle is: "+ area); 

    }
}