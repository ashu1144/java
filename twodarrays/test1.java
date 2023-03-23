package twodarrays;

import java.util.Scanner;
// also called leaner searching 
public class test1 {
    public static void main(String[] args) {
        

        // int [] marks = new int [3];
        // marks[0]=97;//phy
        // marks[1]=98;//chem
        // marks[2]=58;//eng


        // // int marks2[]={97,98,95};

        // for(int i = 0 ; i<3 ; i++ ){
        //     System.out.println(marks[i]);

        // }

        System.out.println("enter the size of array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int counter =0;

        int[] marks3= new int[size];

        // giving input inside array

        for (int j=0;j<size;j++){
            System.out.println("enter your input in array ");
            Scanner dc = new Scanner(System.in);
            int num = dc.nextInt();
            marks3[j] = num;
            dc.close();
        }

        // find number in array

        System.out.println("the number you want to find");
        int findnum= sc.nextInt();
        for(int i =0;i<size;i++){
            counter = counter + 1;
            if(marks3[i] == findnum){
                System.out.println(marks3[i]+" " + "the location of "+ findnum +" is " + counter );}
                    
        }
          for(int k=0;k<marks3.length;k++){
            System.out.print(marks3[k] + " ");
        }
        sc.close();
        





    }
    
}
