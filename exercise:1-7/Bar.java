import java.util.Scanner;

public class Bar
{
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("What character do you want your bar made of?");
       String input = sc.nextLine();
       System.out.println("How long do you want your bar?");
       int n = sc.nextInt();
       for(int i = 0; i <n; i++){
           System.out.print(input);
           
           
        }
        System.out.println("");
        System.out.println("Done");
       
    }
}
