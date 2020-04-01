package agenda;

public class Person {

    String name;
    String lastName;
    String telephone;

    Person() {
    }

    Person(String name, String lastName, String telephone) {
        this.name = name;
        this.lastName = lastName;
        this.telephone = telephone;
    }

    String getName() {
        return name;
    }

    String getLastName() {
        return lastName;
    }

    String getTelephone() {
        return telephone;
    }
}
