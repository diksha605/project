import java.util.Scanner;
public class calculator{
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("enter the value of a: ");
    int a=input.nextInt();
    System.out.println("enter the value of b: ");
    int b= input.nextInt();
    System.out.println(a+b);
    System.out.println(a-b);
    System.out.println(a/b);
    System.out.println(a*b);
    System.out.println(a%b);
}

}