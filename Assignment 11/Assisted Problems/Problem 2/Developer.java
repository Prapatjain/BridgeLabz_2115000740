
public class Developer extends Employee {
    String programmingLanguage ;
    Developer(String name, int id, int salary, String programmingLanguage){
        super(name,id,salary);
        this.programmingLanguage = programmingLanguage;
    }
    @Override
     void displayDetails(){
        super.displayDetails();
        System.out.println("programming language= "+programmingLanguage);
    }
}
