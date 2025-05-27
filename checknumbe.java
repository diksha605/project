import java.util.Scanner;
public class checknumbe{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please check the number is positive,negtive or zero");
        System.out.print("Enter a number :");
        int number= input.nextInt();
        if(number>0){
            System.out.println("numberis positive");
         }else if(number<0){
             System.out.println("number is negative");
         } else 
            System.out.println("number is zero");
         }
                  
        
    }
