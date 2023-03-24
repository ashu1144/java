package ashuopps;
class Employee {
    public void salary() {
        System.out.println("Salary= 200000");
    }
}

class Programmer extends Employee { 
// Programmer class inherits from Employee class
    public void bonus() {
        System.out.println("Bonus=50000");
    }
}

public class singleinh {
    public static void main(String[] args) {

        Programmer p = new Programmer();
        p.salary(); // calls method of super class
        p.bonus(); // calls method of sub class

    }
    
}
