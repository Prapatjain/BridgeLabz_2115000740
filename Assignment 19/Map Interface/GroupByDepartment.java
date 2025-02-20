import java.util.*;

class Employee {
    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class GroupByDepartment {
    public static Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
        Map<String, List<Employee>> groupedMap = new HashMap<>();

        for (Employee emp : employees) {
            String department = emp.department;

            if (!groupedMap.containsKey(department)) {
                groupedMap.put(department, new ArrayList<>());
            }
            groupedMap.get(department).add(emp);
        }
        return groupedMap;
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", "HR"));
        employees.add(new Employee("Bob", "IT"));
        employees.add(new Employee("Carol", "HR"));

        System.out.println(groupByDepartment(employees));
       
    }
}
