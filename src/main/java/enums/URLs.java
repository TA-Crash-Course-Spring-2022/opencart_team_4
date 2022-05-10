package enums;

public enum URLs {

    BASE_URL("http://localhost/opencart"),
    ADMIN_URL("http://localhost/opencart/admin");

    private final String value;

    private  URLs(String value){this.value = value;}

    public String getValue(){return this.value;}
}
