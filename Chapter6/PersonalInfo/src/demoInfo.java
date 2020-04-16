public class demoInfo {
    public static void main(String[] args)
    {
        PersonalInfo sarah = new PersonalInfo();
        sarah.getInfo();
        sarah.setName("Sarah");
        sarah.setAddress("123 Main St.");
        sarah.setAge(20);
        sarah.setPhoneNumber("123-456-7890");

        PersonalInfo kevin = new PersonalInfo();
        kevin.getInfo();
        kevin.setName("Kevin");
        kevin.setAddress("456 Side St.");
        kevin.setAge(20);
        kevin.setPhoneNumber("098-765-4321");

        sarah.getInfo();
        kevin.getInfo();
    }
}
