
import java.util.Scanner;

public class rectangle_area_perimeter {
    public static void main(String[] args) {
        System.out.println("the enter the length  of rctangle ");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        System.out.println("the enter the breadth  of rctangle ");
        Scanner vc = new Scanner(System.in);
        int breadth = vc.nextInt();

        int area_rec = length * breadth;
        int peri_rec = 2*length + 2*breadth;


        System.out.println("the area  of rctangle is  " +  area_rec);
        System.out.println("the perimeter  of rctangle is  " +  peri_rec);




    }
    
}



