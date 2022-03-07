package one.dio.gangoffour.subsystem1.crm;

public class CrmService {

    public static void recordClient(String name, String postalCode, String city, String state){
        System.out.println("Client inserted in CRM system");
        System.out.println(name);
        System.out.println(postalCode);
        System.out.println(city);
        System.out.println(state);

    }
}
