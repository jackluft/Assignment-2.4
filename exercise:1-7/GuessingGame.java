import java.util.Scanner;

public class GuessingGame
{
   public static void main(String[] args){
       // ans = (high+low)/2
       Scanner sc = new Scanner(System.in);
       int min = 0;
       int max = 100;
       int input = 0;
       double rannd_num = (Math.random()*((max-min)+1))+min;
       int ran_num = (int) rannd_num;
       int g = 0;
       //System.out.println(ran_num);
       System.out.println("I've picked a random number between 1 and 100. Try to guess it!");
       while(input != ran_num){
           System.out.println("What is your guess?");
           input = sc.nextInt();
           if(input > ran_num){
               System.out.println("Too high....");
               
               
            }
            if(input < ran_num){
                System.out.println("Too low....");
                
                
            }
           
           g= g +1;
           
        }
        System.out.println("You've guessed my number! Good job!");
        System.out.println("It took you: "+g+" tries!");
    }
}
