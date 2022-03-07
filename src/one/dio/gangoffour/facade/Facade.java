package one.dio.gangoffour.facade;

import one.dio.gangoffour.subsystem1.crm.CrmService;
import one.dio.gangoffour.subsytem2.code.PostalCodeAPI;

public class Facade {
    public void clientTransfer(String name, String postalCode){

        String city = PostalCodeAPI.getInstance().getCity(postalCode);
        String state = PostalCodeAPI.getInstance().getState(postalCode);

        CrmService.recordClient(name, postalCode, city, state);
    }
}
