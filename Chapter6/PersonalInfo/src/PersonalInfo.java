public class PersonalInfo {
    String name = "N/A";
    String address = "N/A";
    int age = 0;
    String phoneNumber = "N/A";

    public void setName(String newName){
        name = newName;
    }

    public void setAddress(String newAddress){
        address = newAddress;
    }

    public void setAge(int newAge)
    {
        age = newAge;
    }

    public void setPhoneNumber(String newPhoneNumber)
    {
        phoneNumber = newPhoneNumber;
    }

    public void getInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
    }
}
