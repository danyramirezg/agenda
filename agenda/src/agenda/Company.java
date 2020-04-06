package agenda;

/**
 * Implementation company class
 * That is an exercise to comment the code
 *
 * @author Dany Ramirez
 * @version 1.0
 */

public class Company {

    String name = "Dany.S.A.S";
    String telephone = "122345";
    public static int nInstances = 0;

    /**
     * Constructor by default
     */

    public Company() {
        nInstances++;
    }

    /**
     * Constructor with parameters
     *
     * @param name      Name of the company
     * @param telephone Contact number company
     */

    Company(String name, String telephone) {
        this.name = name;
        this.telephone = telephone;
        nInstances++;

    }

    /**
     * Return the number of the instances created
     * @return number of instances
     */

    public static int getNInstances(){
        return nInstances;
    }

    /**
     * @return Contact name
     */

    public String getName(){
        return name;
    }

    /**
     * @return telephone number
     */
    public String getTelephone() {
        return telephone;
    }
}