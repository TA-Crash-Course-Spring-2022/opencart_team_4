package repository;

import models.AdminLoginPageModel;
import org.apache.commons.lang3.RandomStringUtils;

public class AdminLoginPageRepository {

    private AdminLoginPageRepository(){
    }

    public static AdminLoginPageModel getInvalidAdminLogin(){
        String adminPassword = RandomStringUtils.randomAlphabetic(6);
        return AdminLoginPageModel.builder()
                .setAdminUsername(RandomStringUtils.randomAlphabetic(8))
                .setAdminPassword(adminPassword)
                .build();
    }
}
