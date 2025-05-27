import java.util.Scanner;
public class bitwise_operator{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("check bitwise operator");
        System.out.println("enter the first the number :");
        int first=input.nextInt();
        System.out.println("enter the second number :");
        int second=input.nextInt();
        int result=first&second;
    System.out.println("the result of bitwise and operator :" + result);
    int result2= first|second;
    System.out.println("the result of bitwise or operator :" + result2);
    int result3 = first^second;
    System.out.println("the result of bitwise xor opearator :" + result3);
    int result4=~first;
    System.out.println("the result of bitwise compliment operator : " + result4);
    int result5=first<<2;
    System.out.println("the result of bitwise left shift operator : " + result5);
    int result6= first>>2;
    System.out.println("the result of bitwise right shift operator : " + result6);



    }
}