import java.util.Scanner;
public class oddevenBitwise{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to check odd/even number by bitwise operator");
        System.out.print("please enter the number: ");
        int number=input.nextInt();
        if((number&1)==1){
            System.out.println("the number is odd");
        } else{
            System.out.println("the number is even");
        }
    }
}
