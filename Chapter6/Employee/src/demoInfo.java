public class demoInfo {
    public static void main(String[] args)
    {
        Employee employee_1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
        Employee employee_2 = new Employee("Mark Jones", 39119, "IT", "Programmer");
        Employee employee_3 = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");

        System.out.println(
                "Name: " + employee_1.get_name() +
                "ID Number: " + employee_1.get_idNumber() +
                "Department: " + employee_1.get_department() +
                "Position: " + employee_1.get_position()
        );

        System.out.println(
                "Name: " + employee_2.get_name() +
                "ID Number: " + employee_2.get_idNumber() +
                "Department: " + employee_2.get_department() +
                "Position: " + employee_2.get_position()
        );

        System.out.println(
                "Name: " + employee_3.get_name() +
                "ID Number: " + employee_3.get_idNumber() +
                "Department: " + employee_3.get_department() +
                "Position: " + employee_3.get_position()
        );
    }
}
