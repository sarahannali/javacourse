public class Employee {
    String name = "N/A";
    int idNumber = 0;
    String department = "N/A";
    String position = "N/A";

    public Employee(String given_name, int given_idNumber, String given_department, String given_position){
        name = given_name;
        idNumber = given_idNumber;
        department = given_department;
        position = given_position;
    }

    public Employee(String given_name, int given_idNumber){
        name = given_name;
        idNumber = given_idNumber;
        department = "";
        position = "";
    }

    public Employee(){
        name = "";
        department = "";
        position = "";
        idNumber = 0;
    }

    public void set_name(String given_name){
        name = given_name;
    }

    public void set_idNumber(int given_idNumber){
        idNumber = given_idNumber;
    }

    public void set_department(String given_department){
        department = given_department;
    }

    public void set_position(String given_position){
        position = given_position;
    }

    public String get_name(){
        return name;
    }

    public int get_idNumber(){
        return idNumber;
    }

    public String get_department(){
        return department;
    }

    public String get_position(){
        return position;
    }

}
