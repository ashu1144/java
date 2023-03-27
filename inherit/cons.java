// perimeterised constructor
class company1 {
    public  void  comp(){
        System.out.println("tcs");
    }
}

class employee1 extends  company1{
    String name ;
    public void getname(){
        System.out.println(this.name);
    }
    public employee1(String name){
        this.name = name;
    }
}



public class cons {
    public static void main(String[] args) {
        employee1 e1 = new employee1("ashu");
        e1.getname();
    }
}
