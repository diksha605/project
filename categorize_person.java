import java.util.Scanner;
public class categorize_person{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = input.nextInt();
        if(age>=70){
            System.out.println("Yoy are senior citizen");
        }else if (age>=50){
            System.out.println("You are senior");
        }else if(age>=30){
            System.out.println("You are young");

        }else if(age>=20){
            System.out.println("You are adult");
        }else if(age>=13){
            System.out.println("You are teenager");
        }else{
            System.out.println("You are child");
        }
    }
}