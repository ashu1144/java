package ashuopps;

class pen{
    String colour;
    String type;

    public void write(){
        System.out.println("writting sometthing");
    }
    public void printcolour(){
        System.out.println(this.colour);
    }
}
 
class student{
    String name;
    int age;

    public void printname(){
        System.out.println(this.name);}
    public void printage(){
        System.out.println(this.age);
    }
    
}



public class test1 {
    public static void main(String[] args) {
        pen pen1 = new pen();
        pen1.colour = "blue";
        pen1.type="gel";
        
       pen pen2 = new pen();
       pen2.colour="black";
       pen2.type="ballpoint";

       pen1.printcolour();
       
       pen2.printcolour();

       student std1 = new student();
       std1.name="ashu";
       std1.age=21;


       std1.printname();
       std1.printage();;

       
    }

    
}
