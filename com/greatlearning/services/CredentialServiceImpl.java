package com.greatlearning.services;
import java.util.Random;

import com.greatlearning.model.Employee;
public class CredentialServiceImpl implements CredentialService {

    @Override
    public String generateEmail(String firstName, String lastName, String dept) {
        return firstName+lastName+"@"+dept+".rdm.com";
    }

    @Override
    public String generatePassword() {
        String capalpha="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String loweralpha="abcdefghijklmnopqrstuvwxyz";
        String numeric="1234567890";
        String splchar="!@#$%^&*()";

        String mix=capalpha+loweralpha+numeric+splchar;  //72 chars
        String password="";
        Random random=new Random();
        for(int i=0;i<=7;i++)
        {
            password = password + String.valueOf(mix.charAt(random.nextInt(mix.length())));
        }
        return password;
    }

    @Override
    public void showDetails(Employee emp) {
        System.out.println("Dear " + emp.getFirstName() + " your generated details are as follows");
        System.out.println("Email -->" + emp.getEmail());
        System.out.println("Password -->" + emp.getPassword());
    }
}
