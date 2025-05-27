import java.util.Scanner;
public class eligibleforvote{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age:" );
        int age =input.nextInt();
        if(age>=18){
            System.out.println("Youare eligle for vote");
            }else {
                System.out.println("Yor are not eligble for vote");
            }
            
        
    }
}