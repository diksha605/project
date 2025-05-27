import java.util.Scanner;
public class lear_year{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a year");
        int year=input.nextInt();
        if (year/4==0){
            System.out.println("year is leap");
        }else if (year%400==0){
            System.out.println("yaer is leap");

        } else if(year%100==0){
            System.out.println("year is not leap");
        }
         else{
            System.out.println("year is not leap");
        }

    }
}