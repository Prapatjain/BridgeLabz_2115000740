
public class Manager extends Employee{
 int teamSize;   
 Manager(String name, int id, int salary){
    super(name, id, salary);
 }
 @Override
 void displayDetails(){
    super.displayDetails();
    System.out.println("team Size= "+teamSize);
 }
}
