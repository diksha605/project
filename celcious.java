import java.util.Scanner;
public class celcious{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println(" convert farehnhite to celcious");
        System.out.print("enter the value fah : ");
        float fah = input.nextFloat();
        float cel = (fah-32)*5/9;
        System.out.println(" Temperature in celcious : "+ cel);
    }
}