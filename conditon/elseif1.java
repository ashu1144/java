import java.util.Scanner;

public class elseif1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter yoour age ");
        int age = sc.nextInt();

        if(age>60){
            System.out.println(" senior ");}

        else 
            if(age>=18){
                System.out.println(" adult ");}
            
                
            else{
                System.out.println("child ");
            }
            
        }
            
        

    }



