
import java.util.*;
import java.lang.*;
interface utility{

    public void get_details();
    public void set_details();
}

public class Main {


        static void main_menu() {

            System.out.println();
            System.out.println("====================****** WELCOME TO SHOWROOM MANAGEMENT SYSTEM ******====================");
            System.out.println();
            System.out.println("=====================****** ENTER YOUR CHOICE ******======================");
            System.out.println();
            System.out.println("1]. ADD SHOWROOM\t\t\t2]. ADD EMPLOYEES \t\t\t3]. ADD CARS");
            System.out.println();
            System.out.println("4]. GET SHOWROOM\t\t\t5]. GET EMPLOYEES\t\t\t6]. GET CARS");
            System.out.println();
            System.out.println("==================****** ENTER 0 TO EXIT ******=======================");
        }

            public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            Showroom showroom[]=new Showroom[5];

            Employees employees[]=new Employees[5];

            Cars cars[]=new Cars[5];

            int car_counter=0;
            int showroom_counter=0;
            int employee_counter=0;
            int choice=100;
            while(choice !=0){
                main_menu();
                choice=sc.nextInt();
                while(choice !=9 && choice !=0)

                    switch(choice){

                        case 1:
                            showroom[showroom_counter]=new Showroom();
                            showroom [showroom_counter].set_details();
                            showroom_counter++;
                            System.out.println();
                            System.out.println("1]. ADD NEW SHOWROOM:");
                            System.out.println("9]. GO BACK TO MAIN MENU:");
                            choice=sc.nextInt();
                            break;

                        case 2:
                            employees[employee_counter]=new Employees();
                            employees [employee_counter].set_details();
                            employee_counter++;
                            System.out.println();
                            System.out.println("1]. ADD NEW SHOWROOM:");
                            System.out.println("9]. GO BACK TO MAIN MENU:");
                            choice=sc.nextInt();
                            break;

                        case 3:
                            cars[car_counter]=new Cars();
                            cars[car_counter].set_details();
                            car_counter++;
                            System.out.println();
                            System.out.println("1]. ADD NEW SHOWROOM:");
                            System.out.println("9]. GO BACK TO MAIN MENU:");
                            choice=sc.nextInt();
                            break;

                        case 4:
                            for(int i=0;i<showroom_counter;i++){
                                showroom[i].get_details();
                                System.out.println();
                                System.out.println();
                            }
                            System.out.println();
                            System.out.println("9]. GO BACK TO MAIN MENU:");
                            System.out.println("0]. Exit:");
                            choice=sc.nextInt();
                            break;

                        case 5:
                            for(int i=0;i<employee_counter;i++){
                                employees[i].get_details();
                                System.out.println();
                                System.out.println();
                            }
                            System.out.println();
                            System.out.println("9]. GO BACK TO MAIN MENU:");
                            System.out.println("0]. Exit:");
                            choice=sc.nextInt();
                            break;

                        case 6:
                            for(int i=0;i<car_counter;i++){
                                cars[i].get_details();
                                System.out.println();
                                System.out.println();
                            }
                            System.out.println();
                            System.out.println("9]. GO BACK TO MAIN MENU:");
                            System.out.println("0]. Exit:");
                            choice=sc.nextInt();
                            break;


                    }
            }

        }
    }

 //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


import java.util.Scanner;
import java.sql.SQLOutput;

public class Showroom implements utility{

    String showroom_name;
    String showroom_address;
    int total_employees;
    int total_cars_in_stack=0;
    String manager_name;

    @Override

    public void get_details(){

        System.out.println("SHOWROOM NAME:"+showroom_name);
        System.out.println("SHOWROOM ADDRESS:"+showroom_address);
        System.out.println("MANAGER NAME:"+manager_name);
        System.out.println("TOTAL EMPLOYEES:"+total_employees);
        System.out.println("TOTAL CARS IN STACK:"+total_cars_in_stack);

    }

    @Override
    public void set_details() {

        Scanner sc=new Scanner(System.in);
        System.out.println("====================****** ENTER SHOWROOM DETAILS ******===================");
        System.out.println();
        System.out.println("SHOWROOM NAME:");
        showroom_name=sc.nextLine();
        System.out.println("SHOWROOM ADDRESS:");
        showroom_address=sc.nextLine();
        System.out.println("MANAGER NAME:");
        manager_name=sc.nextLine();
        System.out.println("TOTAL NO OF EMPLOYEE");
        total_employees=sc.nextInt();
        System.out.println("TOTAL CARS IN STACK:");
        total_cars_in_stack=sc.nextInt();

    }

}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;
import java.util.UUID;

public class Employees extends Showroom implements utility {

    String emp_id;
    String emp_name;
    int emp_age;
    String emp_department;


    @Override

    public void get_details() {

        System.out.println("ID:" + emp_id);
        System.out.println("NAME:" + emp_name);
        System.out.println("AGE:" + emp_age);
        System.out.println("DEPARTMENT:" + emp_department);
        System.out.println("SHOWROOM NAME:" + showroom_name);
    }

    @Override

    public void set_details() {

        Scanner sc = new Scanner(System.in);
        UUID uuid = UUID.randomUUID();
        emp_id = String.valueOf(uuid);
        System.out.println("====================****** ENTER EMPLOYEE DETAILS ******====================");
        System.out.println();
        System.out.println("EMPLOYEE NAME:");
        emp_name = sc.nextLine();
        System.out.println("EMPLOYEE AGE:");
        emp_age = sc.nextInt();
        sc.nextInt();
        System.out.println("EMPLOYEE DEPARTMENT:");
        emp_department = sc.nextLine();
        System.out.println("SHOWROOM NAME:");
        showroom_name = sc.nextLine();

    }
}


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class Cars extends Showroom implements utility {

    String car_name;
    String car_color;
    String car_fuel_type;
    int car_price;
    String car_type;
    String  car_transmission;


    @Override

    public void get_details() {

        System.out.println("NAME:" + car_name);
        System.out.println("COLOR:" + car_color);
        System.out.println("FUEL TYPE:" + car_fuel_type);
        System.out.println("PRICE:" + car_price);
        System.out.println("CAR TYPE:" + car_type);
        System.out.println("TRANSMISSION:" + car_transmission);

    }

      @Override

           public void set_details(){


            Scanner sc=new Scanner(System.in);
            System.out.println("================******* ENTER DETAILS ******====================");
            System.out.println();
            System.out.println("CAR NAME:");
            car_name=sc.nextLine();
            System.out.println("CAR COLOR:");
            car_color=sc.nextLine();
            System.out.println("CAR FUEL TYPE(PETROL/DIESEL):");
            car_fuel_type=sc.nextLine();
            System.out.println("CAR PRICE:");
            car_price=sc.nextInt();
            sc.nextInt();
            System.out.println("CAR TYPE (SEDAM/SUV/HATCHBACK):");
            car_type=sc.nextLine();
            System.out.println("TRANSMISSION TYPE(AUTOMATIC/MANUAL):");
            car_transmission=sc.nextLine();
            total_cars_in_stack++;



        }



    }




