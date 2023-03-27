
class company {
    public  void  comp(){
        System.out.println("tcs");
    }
}

class employee extends  company{
    String name ;
    public void getname(){
        System.out.println(this.name);
    }
}



public class inherit {
    public static void main(String[] args) {

        employee e1 = new employee();
        e1.name="ashu";
        e1.getname();
        e1.comp();

    
}

}