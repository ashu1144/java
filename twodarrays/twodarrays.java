package twodarrays;

import java.util.Scanner;

public class twodarrays {
    
    public static void main(String[] args) {

        


        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int coloum = sc.nextInt();

        int[][] twodarrays = new int[rows][coloum];

        for(int i = 0 ; i<rows;i++){
            for (int k =0 ;k<coloum;k++){
                twodarrays[i][k] = sc.nextInt(); 
            }
        }
        sc.close();





        for(int i=0; i<rows ;i++){
            for(int k=0;k<coloum;k++){
                System.out.print(twodarrays[i][k]+" " );
                
            }
            System.out.println();
        }

        System.out.println("enter the number you want to find");
        int x = sc.nextInt();

        for(int i=0;i<rows;i++){
            for (int j=0;j<coloum;j++){
               if (twodarrays[i][j]==x){
                System.out.println("x is found at location "+( i + " , "+ j));
               } 
            }
        }

 

        
    
    }
}