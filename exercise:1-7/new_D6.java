import java.util.Scanner;

public class new_D6
{

    public static void main(String[] args){
        int max = 6;
        int min = 1;
        int total = 0;

        Scanner sc = new Scanner(System.in);

        String input = "y";
        while(input.equals("y")){
            total = 0;
            System.out.println("How many D6's do you want to roll?");
            int num_roll = sc.nextInt();
            System.out.print("Roll: ");
            for(int i = 0; i < num_roll; i++){
                double r = (Math.random()*((max-min)+1))+min;
                int r2 = (int) r;
                
                
                System.out.print(r2+" ");
                total +=r2;

            }

            System.out.println("Total: "+total);
            System.out.println("Again? [y,n]");

            input = sc.next();
            
            
            
        }
        System.out.println("GoodBye!!");

    }
}
