import java.util.Scanner; 
public class grades{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("calculate the grades accorting to the marks percentage  :");
        System.out.println("enter the student marks percentage : ");
        float percentage = input.nextFloat();
        if(percentage>=80){
            System.out.println("Excellent,yor got Grade A");

        }else if(percentage<=80&&percentage>70){
            System.out.println("Very good,You got Grade B");
        }else if(percentage>60&&percentage<=70){
            System.out.println("Good,You got Grade C");

        }else{
            System.out.println("You need to work hard more so next time you got good grade");
        }
    }
}