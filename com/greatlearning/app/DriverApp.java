package com.greatlearning.app;

import java.util.Scanner;
import com.greatlearning.model.Employee;
import com.greatlearning.services.CredentialServiceImpl;

public class DriverApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Name of Employee: ");
        String fName=sc.next();
        System.out.println("Enter Last Name of Employee: ");
        String lName=sc.next();

        Employee emp1=new Employee(fName,lName);
        CredentialServiceImpl cred1 = new CredentialServiceImpl();

        String generatedEmail="";
        String generatedPass;

        System.out.println("Please enter the department from the following\n1. Technical\n2. Admin\n3. Human Resource\n4. Legal");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 ->
                    generatedEmail = cred1.generateEmail(emp1.getFirstName().toLowerCase(), emp1.getLastName().toLowerCase(), "tech");
            case 2 ->
                    generatedEmail = cred1.generateEmail(emp1.getFirstName().toLowerCase(), emp1.getLastName().toLowerCase(), "adm");
            case 3 ->
                    generatedEmail = cred1.generateEmail(emp1.getFirstName().toLowerCase(), emp1.getLastName().toLowerCase(), "hr");
            case 4 ->
                    generatedEmail = cred1.generateEmail(emp1.getFirstName().toLowerCase(), emp1.getLastName().toLowerCase(), "legal");
            default -> System.out.println("Invalid Choice");
        }
        generatedPass = cred1.generatePassword();

        emp1.setEmail(generatedEmail);
        emp1.setPassword(generatedPass);

        cred1.showDetails(emp1);
        sc.close();
    }
}
