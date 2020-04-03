package agenda;

import java.sql.SQLOutput;

public class Arrays {

    /**
     * @param args
     */

    public static void main(String[] args) {

        // References

        int arrayEnteros[] = new int[10];
        arrayEnteros[4] = 10;

        for(int i: arrayEnteros)
            System.out.println("Shows the arrayEnteros " + i);

        System.out.println(java.util.Arrays.toString(arrayEnteros));

        Person group[] = new Person[10];
        System.out.println(java.util.Arrays.toString(group));

        group[5] = new Person("Dany", "Ramirez", "12345");

        System.out.println(arrayEnteros[4]);
        System.out.println(group[5].name);

        for(int i = 0; i < 10; i += 2){
            System.out.println(i);
        }
    }
}

