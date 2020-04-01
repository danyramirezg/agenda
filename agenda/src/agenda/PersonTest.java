package agenda;

public class PersonTest {

    public static void main(String[] args) {

        Person addPerson = new Person("Vladyslavvv", "Ramirez", "12345");
        System.out.println("Shows information by directly accessing its attributes.");
        System.out.println("Name: " + addPerson.name);
        System.out.println("Last Name: " + addPerson.lastName);
        System.out.println("Telephone: " + addPerson.telephone);
        System.out.println("******************");
        System.out.println("Displays information calling methods of the class");
        System.out.println("Name: " + addPerson.getName());
        System.out.println("Last Name: " + addPerson.getLastName());
        System.out.println("Telephone " + addPerson.getTelephone());
    }
}
