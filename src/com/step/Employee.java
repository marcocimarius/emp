package com.step;

import java.util.Objects;
import java.util.Scanner;

public class Employee {
    private String name;
    private String surname;
    private String idnp;
    private String job;
    private String address;
    Scanner sc = new Scanner(System.in);

    private GENDER gender;
     enum GENDER {
        MALE,
        FEMALE
    }

    public GENDER getGender() {
        return gender;
    }

    public void setGender(GENDER gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        while(true) {
            if(!Objects.equals(name, "")) {
                this.name = name;
                break;
            }
            else {
                System.out.println("Enter the name correctly: ");
                name = sc.nextLine();
                sc.nextLine();
            }
        }


    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        while(true) {
            if(!Objects.equals(surname, "")) {
                this.surname = surname;
                break;
            }
            else {
                System.out.println("Enter the surname correctly: ");
                surname = sc.nextLine();
                sc.nextLine();
            }
        }

    }

    public String getIdnp() {
        return idnp;
    }

    public void setIdnp(String idnp) {
        while(true) {
            if(!Objects.equals(idnp, "") && idnp.length() == 13) {
                this.idnp = idnp;
                break;
            }
            else {
                System.out.println("Enter the idnp correctly: ");
                idnp = sc.nextLine();
                sc.nextLine();
            }
        }

    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        while(true) {
            if(!Objects.equals(job, "")) {
                this.job = job;
                break;
            }
            else {
                System.out.println("Enter the job correctly: ");
                job = sc.nextLine();
                sc.nextLine();
            }
        }

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        while(true) {
            if(!Objects.equals(address, "")) {
                this.address = address;
                break;
            }
            else {
                System.out.println("Enter the address correctly: ");
                address = sc.nextLine();
                sc.nextLine();
            }
        }
    }

    public void updateEmployee() {
        char confirm;

        System.out.println("Do you wish to update the name? (type 'y' for YES or 'n' fo NO)");
        confirm = sc.next().charAt(0);
        while(confirm != 'y' && confirm != 'n') {
            System.out.println("Only 'y' or 'n'!!! NO OTHER LETTERS!!! Enter again 'y' for YES or 'n' for NO: ");
            confirm = sc.next().charAt(0);
            sc.nextLine();
        }
        if(confirm == 'y') {
            System.out.println("Enter the name you want to be updated with: ");
            this.name = sc.nextLine();
            sc.nextLine();
        }


        System.out.println("Do you wish to update the surname? (type 'y' for YES or 'n' fo NO)");
        confirm = sc.next().charAt(0);
        while(confirm != 'y' && confirm != 'n') {
            System.out.println("Only 'y' or 'n'!!! NO OTHER LETTERS!!! Enter again 'y' for YES or 'n' for NO: ");
            confirm = sc.next().charAt(0);
            sc.nextLine();
        }
        if(confirm == 'y') {
            System.out.println("Enter the surname you want to be updated with: ");
            this.surname = sc.nextLine();
            sc.nextLine();
        }


        System.out.println("Do you wish to update the idnp? (type 'y' for YES or 'n' fo NO)");
        confirm = sc.next().charAt(0);
        while(confirm != 'y' && confirm != 'n') {
            System.out.println("Only 'y' or 'n'!!! NO OTHER LETTERS!!! Enter again 'y' for YES or 'n' for NO: ");
            confirm = sc.next().charAt(0);
            sc.nextLine();
        }
        if(confirm == 'y') {
            System.out.println("Enter the idnp you want to be updated with: ");
            this.idnp = sc.nextLine();
            sc.nextLine();
        }


        System.out.println("Do you wish to update the address? (type 'y' for YES or 'n' fo NO)");
        confirm = sc.next().charAt(0);
        while(confirm != 'y' && confirm != 'n') {
            System.out.println("Only 'y' or 'n'!!! NO OTHER LETTERS!!! Enter again 'y' for YES or 'n' for NO: ");
            confirm = sc.next().charAt(0);
            sc.nextLine();
        }
        if(confirm == 'y') {
            System.out.println("Enter the address you want to be updated with: ");
            this.address = sc.nextLine();
            sc.nextLine();
        }


        System.out.println("Do you wish to update the job? (type 'y' for YES or 'n' fo NO)");
        confirm = sc.next().charAt(0);
        while(confirm != 'y' && confirm != 'n') {
            System.out.println("Only 'y' or 'n'!!! NO OTHER LETTERS!!! Enter again 'y' for YES or 'n' for NO: ");
            confirm = sc.next().charAt(0);
            sc.nextLine();
        }
        if(confirm == 'y') {
            System.out.println("Enter the job you want to be updated with: ");
            this.job = sc.nextLine();
            sc.nextLine();
        }


        System.out.println("Do you wish to update the gender? (type 'y' for YES or 'n' fo NO)");
        confirm = sc.next().charAt(0);
        while(confirm != 'y' && confirm != 'n') {
            System.out.println("Only 'y' or 'n'!!! NO OTHER LETTERS!!! Enter again 'y' for YES or 'n' for NO: ");
            confirm = sc.next().charAt(0);
            sc.nextLine();
        }
        if(confirm == 'y') {
            System.out.println("Employee gender: (type '1' for MALE or '2' for FEMALE)");
            confirm = sc.next().charAt(0);
            sc.nextLine();
            while(confirm != '1' && confirm != '2') {
                System.out.println("Only '1' or '2'!!! NO OTHER CHARACTERS!!! Enter again '1' for MALE or '2' for FEMALE: ");
                confirm = sc.next().charAt(0);
                sc.nextLine();
            }
            switch (confirm) {
                case '1': this.setGender(GENDER.MALE);
                case '2': this.setGender(Employee.GENDER.FEMALE);
            }
            sc.nextLine();
        }
    }

}
