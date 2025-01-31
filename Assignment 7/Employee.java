public class Employee {
        private String name;
        private int id ;
        private int salary;
        Employee(String name, int id, int salary){
            this.name = name;
            this.id = id;
            this.salary =salary;
        }
        public void displayDetails(){
            System.out.println("Name of the Employee: "+ name);
            System.out.println("id: "+id);
            System.out.println("Salary of the Employee: "+salary);
        }  
        public void setName(String name)
        {
            this.name = name;
        }
        public void setId(int id)
        {
            this.id = id;
        }
        public void setSalary(int salary)
        {
            this.salary = salary;
        }

        public String getName(){
            return this.name;
        }
        public int getId(){
            return this.id;
        }
        public int getSalary(){
            return this.salary;
        }
    }

