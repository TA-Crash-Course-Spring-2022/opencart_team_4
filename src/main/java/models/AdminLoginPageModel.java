package models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AdminLoginPageModel {
    private String adminUsername;
    private String adminPassword;
    private String adminEmailAddress;

    private AdminLoginPageModel(){
    }

    public static AdminLoginPageModel.Builder builder(){return new AdminLoginPageModel().new Builder();}

    public class Builder {
        public AdminLoginPageModel.Builder setAdminUsername(String value){
            adminUsername = value;
            return this;
        }
        public AdminLoginPageModel.Builder setAdminPassword(String value){
            adminPassword = value;
            return this;
        }
        public AdminLoginPageModel build(){return AdminLoginPageModel.this;}
    }
}
