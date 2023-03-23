import java.util.Scanner;

public class perimeter {

    public static void main(String[] args) {
        System.out.println("the length of the square ");
        Scanner sc = new Scanner(System.in);
        int square = sc.nextInt();
        sc.close();

        int peri=4*square;

        System.out.println("the perimeter of the square is " + peri);
    }
}