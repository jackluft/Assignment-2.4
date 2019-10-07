import java.util.Scanner;

public class Triangle
{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("What character do you want your triangle made of? ");
        String sys = sc.nextLine();
        System.out.println("How tall do you want your triangle? ");
        int num = sc.nextInt();
        for(int i= 0; i < num; i++){
            for(int j = 0; j <i; j++){
                System.out.print(sys);
                
                
            }
            System.out.println("");
            
            
        }
        
        
    }
}
