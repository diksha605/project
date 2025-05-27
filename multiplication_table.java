import java.util.Scanner;
public class multiplication_table{
    public static void main(String[] args) {
        
        
        Scanner input=new Scanner(System.in);
        
        System.out.print("enter the number to create multiplication table :");
        
        int number=input.nextInt();
        printMultiplicationTable(number);
    }
    public static void printMultiplicationTable(int number){
        int i=1;
        while(i<=10){
            System.out.println("the multiplication table is :"  + number*i);
            i++;
        
        }
    }
}