package practice.employee.controller;

import practice.employee.model.Employee ;

public class EmployeeAppl {

        public static void main(String[] args) {

            //  создаем объектные переменные

            Employee employee1 = new Employee(4552, "Ivan", "Ivanov", "m", 2500, 4);
            Employee employee2 = new Employee(4626, "Pit", "Petrov", "m", 2200, 5) ;
            Employee employee3 = new Employee(4835, "Li ", "Kim", "m", 1900, 3) ;
            Employee employee4 = new Employee(4121, "Si", "Kim", "w", 2250, 1) ;


           employee1  .display() ;
            System.out.println();
           employee2  .display() ;
            System.out.println();
           employee3  .display() ;
            System.out.println();
           employee4  .display() ;
        }
    }

