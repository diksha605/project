import java.util.Scanner;
public class pattern{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n :" );
        int n = input.nextInt();
        int rows=1;
        while(rows<n){
            System.out.print("* ");
            int i=0;
            while(i<rows){
                System.out.print("* ");
                i++;
            }
            System.out.println();
        } rows++; 
    }
}