package com.greatlearning.services;
import com.greatlearning.model.Employee;

public interface CredentialService {
    String generateEmail(String firstName,String lastName,String dept);
    String generatePassword();
    void showDetails(Employee emp);
}
