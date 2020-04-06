package agenda;

public class companyToPrint{

    public static void main(String[] args){
        Company addCompany = new Company("tapabocasmede", "12345");
        System.out.println("Accesing directly to its attribute");
        System.out.println("Company name: " + addCompany.name);
        System.out.println("Company phone: "+ addCompany.telephone);
        System.out.println("*****************");
        System.out.println("Calling class methods");
        System.out.println("Company name: " + addCompany.getName());
        System.out.println("Company phone: " + addCompany.getTelephone());
    }

}
