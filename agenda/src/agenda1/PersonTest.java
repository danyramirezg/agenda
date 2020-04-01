package agenda1;

import javax.sound.midi.Soundbank;
import java.net.SocketTimeoutException;
import java.sql.SQLOutput;
import java.util.SortedMap;

public class PersonTest {

    public static void main(String[] args) {

        Person addPerson = new Person("Vladyslavvv", "Stashuk", "12345");
        System.out.println("Shows information by directly accessing its attributes.");
        System.out.println("Name: " + addPerson.name);
        System.out.println("Last Name: " + addPerson.lastName);
        System.out.println("Telephone: " + addPerson.telephone);
        System.out.println("******************");
        System.out.println("Displays information calling methods of the class");
        System.out.printf("Name: " + addPerson.getName());
        System.out.println("Last Name: " + addPerson.getLastName());
        System.out.printf("Telephone " + addPerson.getTelephone());
    }
}
