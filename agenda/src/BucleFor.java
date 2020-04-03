//Practice syntax cycle for

public class BucleFor {

    public static void main (String[] args){
        int arrayEnteros [] = new int [5];

        for (int i = 0; i < 5; i++)
            arrayEnteros[i] = i;

        for(int i: arrayEnteros)
            System.out.println("arrayEnteros[" + i + "] = " + arrayEnteros[i]);

        //Practice Switch

        int month = 3;
        switch (month){
            case 1:
            case 3:
                System.out.println("The month has 31 days");
                break;
            case 2:
                System.out.println("The month has 28 days");
                break;
            default:
                System.out.println("None of the previous months");
                break;
        }
    }
}
