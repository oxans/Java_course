package Lesson05;

import java.util.Random;

public class Employees {


    private String FIO;
    private String role;
    private String eMail;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employees() {
 //       System.out.println("this is constructor for Employees");
        this.FIO = "Family Name ";
        this.role = "enginer";
        this.eMail = "temp@mail.com";
        this.phoneNumber = "+7123456789";
        this.salary = randomNumber(30000, 80000);
        this.age = randomNumber(25, 65);
        infoEmp(FIO, role, eMail, phoneNumber, salary, age);
    }

 //   public Employees(String FIO, String role, String eMail, String phoneNumber,int salary,int age){
 //        System.out.println("this is constructor for Employees");
 //        this.FIO = "Family Name ";
 //        this.role = "enginer";
 //        this.eMail = "temp@mail.com";
 //        this.phoneNumber = "+7123456789";
 //        this.salary = 6000;
 //        this.age = 40;
 //        infoEmp(FIO, role, eMail,phoneNumber,salary,age);
 //   }


    public static void infoEmp(String FIO, String role, String eMail, String phoneNumber, int salary, int age) {
//        System.out.println ("Information about employee");
        if (age >= 40) {
            System.out.println("FIO: " + FIO + "| role: " + role + "| e-mail: " + eMail +
                    "| phone: " + phoneNumber + "| salary: " + salary + "| aga: " + age);
        }
    }

    public static void setAge (int age){

    }

    public static int randomNumber(int min, int max){
        Random rn = new Random();
        int result = rn.nextInt(max + 1 - min) + min;
        return result;
    }

    }




