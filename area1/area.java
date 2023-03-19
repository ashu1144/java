import java.util.Scanner;

import javax.naming.event.NamingExceptionEvent;

public class area {
    public static void main(String[] args) {


        System.out.println("length of a square");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        int area = length * length;

        System.out.print(area);
    
        
    }
    
}
