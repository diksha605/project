import java.util.Scanner;
public class greatestnumner{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Check the greatest number");
        System.out.println("Please enter the number 1 :");
        int number1=input.nextInt();
        System.out.println("Please the enter the number 2 :");
        int number2=input.nextInt();
        System.out.println("Please enter the number 3 :");
        int number3=input.nextInt();
        if(number1>number2&&number1>number3){
            System.out.println("number1 is the greatest number");

        }else if(number2>number3&& number2>number1){
            System.out.println("number2 is the greatest number");
        }else{
            System.out.println("number3 is the greatest number");
        }
    

    }
}