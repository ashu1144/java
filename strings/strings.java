package strings;

import java.util.Scanner;

public class strings {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("your name is "+name);

        String firstname="tony";
        String middlename = "stark";
        String fullname= firstname + " " + middlename;

        System.out.println(fullname);
        System.out.println(fullname.length());
        
        for(int i =0;i<fullname.length();i++){
            System.out.println(fullname.charAt(i));

        }

        fullname = fullname.substring(5, )

        
    }
    
}
