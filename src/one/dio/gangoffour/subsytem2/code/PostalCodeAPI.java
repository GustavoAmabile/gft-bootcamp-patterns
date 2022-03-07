package one.dio.gangoffour.subsytem2.code;

public class PostalCodeAPI {
    private static PostalCodeAPI instance = new PostalCodeAPI();

    private PostalCodeAPI(){
        super();
    }

    public static PostalCodeAPI getInstance(){
        return instance;
    }

    public String getCity(String postalCode){
        return "Belo Horizonte";
    }
    public String getState(String postalCode){
        return "MG";
    }
}
