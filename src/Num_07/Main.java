package Num_07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        Scanner in = new Scanner(System.in);
        name = in.nextLine();
        Company company = new Company(name);
        List<Employee> newStaff = new ArrayList<Employee>();
        List<Employee> TopSalary = new ArrayList<Employee>();
        List<Employee> LowSalary = new ArrayList<Employee>();
        int id = 0;
        for(int i = 0; i < 180; i++){
            newStaff.add(new Employee("Puchkova", "Angelina", 20000, new Operator(company), company, id));
            id++;
        }
        company.hireAll(newStaff);
        newStaff.clear();
        for(int i = 0; i < 80; i++){
            newStaff.add(new Employee("Zhumaisimba", "Maksek", 45000, new Manager(company), company, id));
            id++;
        }
        company.hireAll(newStaff);
        newStaff.clear();
        for(int i = 0; i < 10; i++){
            newStaff.add(new Employee("Anikfeev", "Sergey", 60000, new TopManager(company), company, id));
            id++;
        }
        company.hireAll(newStaff);
        newStaff.clear();
        company.refresh();

        TopSalary.addAll(company.getTopSalaryStaff(13));
        for (Employee emp : TopSalary) {
            System.out.println(emp.toString());
        }

        System.out.println("_________________________________________________________________________________________");

        LowSalary.addAll(company.getLowestSalaryStaff(30));
        for (Employee emp : LowSalary){
            System.out.println(emp.toString());
        }

        for (int i = 0; i < company.current_count; i++){
            if(i % 2 == 1){
                company.fire(i);
            }
        }
        company.refresh();

        System.out.println();
        System.out.println("Deleting 50% employees....");
        System.out.println("Data refreshed.");
        System.out.println();

        TopSalary.clear();
        LowSalary.clear();

        TopSalary.addAll(company.getTopSalaryStaff(13));
        for (Employee emp : TopSalary) {
            System.out.println(emp.toString());
        }

        System.out.println("_________________________________________________________________________________________");

        LowSalary.addAll(company.getLowestSalaryStaff(30));
        for (Employee emp : LowSalary){
            System.out.println(emp.toString());
        }
    }
}
