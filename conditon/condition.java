package conditon;

import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
        System.out.println(" enter your age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.close();

        if (age>=18){
            System.out.println("adult");
        }
        else {
            System.out.println(" not adult");
        }

    }

}
