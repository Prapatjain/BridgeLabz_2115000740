public class Employee {
    String name; 
    final int id;
    String designation;
    static String companyName="Capgimini";
    static int totalCount;
    Employee(String name, int id, String designation){ //Parameterized constructor

        this.name = name;
        this.id = id;
        this.designation =designation;
        totalCount++;
    }
    static void displayTotalEmployees(){
        System.out.println("\n Total Employees: "+totalCount);
    };

    void displayDetails(Object b){ //instance of operator
        if(b instanceof Employee){
            System.out.println("Company name= "+Employee.companyName);
            System.out.println("Name= "+name);
            System.out.println("ID= "+id );
            System.out.println("Designation= "+designation);
        }
       else{
        System.out.println("Not an instance of the Employee class.");
       }
    }
}
