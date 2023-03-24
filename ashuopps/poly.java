package ashuopps;

class student{
    String name;
    int age;

    public void printinfo(){
        System.out.println(name);
    }
    public void printinfo(int age){
        System.out.println(age);
    }
    public void printinfo(String name , int age ){
        System.out.println(name +" " + age );
    }
   
}




public class poly {

    public static void main(String[] args) {
        
        student s1 = new student();
        s1.name="ashu";
        s1.age=21;

        s1.printinfo(s1.name,s1.age );
        s1.printinfo();
        s1.printinfo(s1.age);
    }

    
    
}
