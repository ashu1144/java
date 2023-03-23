package conditon;
import java.util.Scanner;

public class switch1 {

    private static Scanner vc;

    public static void main(String[] args) {
        
        vc = new Scanner(System.in);
        System.out.println("enter yoour age ");
        int age = vc.nextInt();

        switch(age){
            
            case 1 :System.out.println("adult"); 
            break;
            case 2 :System.out.println(" not adult");
            break; 

        }



        
    }

    
    
}
