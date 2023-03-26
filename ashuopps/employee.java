package ashuopps;

class company{

    public void companyname(){
        System.out.println("tcs"); }

}

class employeee extends company{

    String name;

    public void printname(){
        System.out.println(this.name);
    }

}


public class employee {
    public static void main(String[] args) {

        employeee e1 = new employeee();
        e1.name="shaik mohammaad ashan ";
        e1.printname();
        e1.companyname();

        
        
    }
    
}
