public class Main {
    public static void main(String[] args) throws Exception {
        Person person = new Person();
        person.setFirstName("Rishabh");
        person.setAge(20);
        person.setLastName("Gokhe");
        System.out.println(person.getFullName());
    }
}