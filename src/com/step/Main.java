package com.step;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nr = 0;
        Employee[] employees = new Employee[1000];
        int move;


        while(true) {
            System.out.println();
            System.out.println("Employee Menu");
            System.out.println("1. Enter employee");
            System.out.println("2. Show employees");
            System.out.println("3. Update employee");
            System.out.println("4. Search by name");
            System.out.println("5. Search by surname");
            System.out.println("6. Search by idnp");
            System.out.println("0. EXIT");
            System.out.println();

            move = sc.nextInt();
            sc.nextLine();

            switch(move) {
                case 0:
                    System.exit(0);
                case 1:
                    char confirm;
                    do {
                        employees[nr] = new Employee();
                        System.out.println("Employee surname: ");
                        employees[nr].setSurname(sc.nextLine());
                        System.out.println("Employee name: ");
                        employees[nr].setName(sc.nextLine());
                        System.out.println("Employee idnp: ");
                        employees[nr].setIdnp(sc.nextLine());
                        System.out.println("Employee job: ");
                        employees[nr].setJob(sc.nextLine());
                        System.out.println("Employee address: ");
                        employees[nr].setAddress(sc.nextLine());
                        System.out.println("Employee gender: (type '1' for MALE or '2' for FEMALE)");
                        confirm = sc.next().charAt(0);
                        sc.nextLine();
                        while(confirm != '1' && confirm != '2') {
                            System.out.println("Only '1' or '2'!!! NO OTHER CHARACTERS!!! Enter again '1' for MALE or '2' for FEMALE: ");
                            confirm = sc.next().charAt(0);
                            sc.nextLine();
                        }
                        switch (confirm) {
                            case '1': employees[nr].setGender(Employee.GENDER.MALE);
                            case '2': employees[nr].setGender(Employee.GENDER.FEMALE);
                        }
                        nr++;
                        System.out.println("Enter another employee? (type 'y' for YES or 'n' for NO)");
                        confirm = sc.next().charAt(0);
                        sc.nextLine();
                        while(confirm != 'y' && confirm != 'n') {
                            System.out.println("Only 'y' or 'n'!!! NO OTHER LETTERS!!! Enter again 'y' for YES or 'n' for NO: ");
                            confirm = sc.next().charAt(0);
                            sc.nextLine();
                        }
                    } while (confirm == 'y');
                    break;
                case 2:
                    for(int i=0; i<nr; i++) {
                        System.out.println();
                        System.out.println("Employee name: " + employees[i].getName());
                        System.out.println("Employee surname: " + employees[i].getSurname());
                        System.out.println("Employee address: " + employees[i].getAddress());
                        System.out.println("Employee job: " + employees[i].getJob());
                        System.out.println("Employee idnp: " + employees[i].getIdnp());
                        System.out.println("Employee gender: " + employees[i].getGender());
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Enter the idnp of the person you wish to update: ");
                    String idnp = sc.nextLine();
                    sc.nextLine();
                    int i=0;
                    while (true) {
                        if(Objects.equals(employees[i].getIdnp(), idnp)) {
                            break;
                        }
                        i++;
                    }
                    employees[i].updateEmployee();
                    break;
                case 4:
                    System.out.println("Enter the name of the person you wish to find: ");
                    String name = sc.nextLine();
                    sc.nextLine();
                    for(i=0; i<nr; i++) {
                        if(Objects.equals(employees[i].getName(), name)) {
                            System.out.println();
                            System.out.println("Employee name: " + employees[i].getName());
                            System.out.println("Employee surname: " + employees[i].getSurname());
                            System.out.println("Employee address: " + employees[i].getAddress());
                            System.out.println("Employee job: " + employees[i].getJob());
                            System.out.println("Employee idnp: " + employees[i].getIdnp());
                            System.out.println();
                        }
                    }
                    break;
                case 5:
                    System.out.println("Enter the surname of the person you wish to find: ");
                    String surname = sc.nextLine();
                    sc.nextLine();
                    for(i=0; i<nr; i++) {
                        if(Objects.equals(employees[i].getName(), surname)) {
                            System.out.println();
                            System.out.println("Employee name: " + employees[i].getName());
                            System.out.println("Employee surname: " + employees[i].getSurname());
                            System.out.println("Employee address: " + employees[i].getAddress());
                            System.out.println("Employee job: " + employees[i].getJob());
                            System.out.println("Employee idnp: " + employees[i].getIdnp());
                            System.out.println();
                        }
                    }
                    break;
                case 6:
                    System.out.println("Enter the idnp of the person you wish to find: ");
                    idnp = sc.nextLine();
                    sc.nextLine();
                    for(i=0; i<nr; i++) {
                        if(Objects.equals(employees[i].getName(), idnp)) {
                            System.out.println();
                            System.out.println("Employee name: " + employees[i].getName());
                            System.out.println("Employee surname: " + employees[i].getSurname());
                            System.out.println("Employee address: " + employees[i].getAddress());
                            System.out.println("Employee job: " + employees[i].getJob());
                            System.out.println("Employee idnp: " + employees[i].getIdnp());
                            System.out.println();
                        }
                    }
                    break;
            }
        }
    }
}
