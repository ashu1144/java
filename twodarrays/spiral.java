package twodarrays;

import java.util.Scanner;

public class spiral {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int coloum = sc.nextInt();

        int [][] spiral1 = new int [rows][coloum];
        
        for (int i=0;i<rows;i++){
            for(int j=0;j<coloum;j++ ){
                spiral1[i][j]=sc.nextInt();}}

        for(int i=0;i<rows;i++){
            for(int j=0;j<coloum;j++ ){
                System.out.print(spiral1[i][j]);}
            System.out.println();
        }

        
        System.out.println("enter the number you want ");
        int x = sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<coloum;j++ ){
                if(spiral1[i][j]==x){
                    System.out.println("the location of x is at the location " +( i + "," + j) );
                sc.close();
                }

            }

        }
    }
}    

