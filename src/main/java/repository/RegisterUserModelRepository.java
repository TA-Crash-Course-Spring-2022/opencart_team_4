package repository;

import models.RegisterUserModel;
import  org.apache.commons.lang3.RandomStringUtils;

public class RegisterUserModelRepository {

    private RegisterUserModelRepository(){
    }

    public static RegisterUserModel getValidRegisterUser(){
        String password = RandomStringUtils.randomAlphabetic(12);
        return RegisterUserModel.builder()
                .setFirstName(RandomStringUtils.randomAlphabetic(8))
                .setLastName(RandomStringUtils.randomAlphabetic(8))
                .setEmail(RandomStringUtils.randomAlphabetic(7)+"@gmail.com")
                .setTelephone(RandomStringUtils.randomNumeric(10))
                .setPassword(password)
                .setPasswordConfirm(password)
                .build();
    }

    public static RegisterUserModel getInvalidRegisterUser(){
        return RegisterUserModel.builder()
                .setFirstName(RandomStringUtils.randomAlphabetic(8))
                .build();
    }

    public static RegisterUserModel getUserWithInvalidEmail(){
        String password = RandomStringUtils.randomAlphabetic(12);
        return RegisterUserModel.builder()
                .setFirstName(RandomStringUtils.randomAlphabetic(8))
                .setLastName(RandomStringUtils.randomAlphabetic(8))
                .setEmail(RandomStringUtils.randomAlphabetic(7)+"@"+RandomStringUtils.randomAlphabetic(9))
                .setTelephone(RandomStringUtils.randomNumeric(10))
                .setPassword(password)
                .setPasswordConfirm(password)
                .build();
    }

    public static RegisterUserModel getUserWithInvalidConfirmPassword(){
        return RegisterUserModel.builder()
                .setFirstName(RandomStringUtils.randomAlphabetic(8))
                .setLastName(RandomStringUtils.randomAlphabetic(8))
                .setEmail(RandomStringUtils.randomAlphabetic(7)+"@gmail.com")
                .setTelephone(RandomStringUtils.randomAlphabetic(10))
                .setPassword(RandomStringUtils.randomAlphabetic(12))
                .setPasswordConfirm(RandomStringUtils.randomAlphabetic(12))
                .build();
    }

    public static RegisterUserModel getUserWithInvalidTelephone(){
        String password = RandomStringUtils.randomAlphabetic(12);
        return RegisterUserModel.builder()
                .setFirstName(RandomStringUtils.randomAlphabetic(8))
                .setLastName(RandomStringUtils.randomAlphabetic(8))
                .setEmail(RandomStringUtils.randomAlphabetic(7)+"@gmail.com")
                .setTelephone(RandomStringUtils.randomAlphabetic(10))
                .setPassword(password)
                .setPasswordConfirm(password)
                .build();
    }

}
