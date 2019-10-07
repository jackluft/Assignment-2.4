import java.util.Scanner;

public class RunningTally
{
   public static void main(String[] args){
       
       Scanner input = new Scanner(System.in);
       int num = 0;
       int ans = 0;
       System.out.println("Let's add some numbers!");
       System.out.println("Enter negative number to quite");
       while(num >= 0){
           ans = ans +num;
           num = input.nextInt();
           
           
        }
        System.out.println("Your total is: "+ans);
       
       
    }
}
