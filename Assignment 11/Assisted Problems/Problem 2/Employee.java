
public class Employee {
    String name;
    int id;
    int salary;
     Employee(String name, int id, int salary){
        this.name = name;
        this.id =id;
        this.salary = salary;
    }
     void displayDetails(){
        System.out.println(" name= "+name+" id= "+id+" salary= "+salary);
    }
}
