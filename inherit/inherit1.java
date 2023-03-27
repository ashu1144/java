// multilevel inheritance
class company {
    public  void  comp(){
        System.out.println("tcs");
    }
}

class field extends company{
    public void getfield(){
        System.out.println("workprocess");
    }

}

class employee extends field{
    String name ;
    public void getname(){
        System.out.println(this.name);
    }

    public void getinfo(){
        System.out.println(this.name);
        getfield();
        comp();
    }
}



public class inherit1 {
    public static void main(String[] args) {

        employee e1 = new employee();
        e1.name="ashu";
        e1.getinfo();
    
}

}



