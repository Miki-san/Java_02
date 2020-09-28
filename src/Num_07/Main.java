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
        List<Employee> operators = new ArrayList<Employee>();
        List<Employee> managers = new ArrayList<Employee>();
        List<Employee> topmanagers = new ArrayList<Employee>();
        List<Employee> TopSalary = new ArrayList<Employee>();
        int id = 0;
        for(int i = 0; i < 180; i++){
            operators.add(new Employee("Maksek", "Angelina", 20000, new Operator(company), company, id));
            id++;
        }
        for(int i = 0; i < 80; i++){
            managers.add(new Employee("Kavo", "Deda", 45000, new Manager(company), company, id));
            id++;
        }
        for(int i = 0; i < 10; i++){
            topmanagers.add(new Employee("Suda", "Smotri", 60000, new TopManager(company), company, id));
            id++;
        }
        company.hireAll(operators);
        company.hireAll(managers);
        company.hireAll(topmanagers);

        TopSalary.addAll(company.getTopSalaryStaff(13));
        for (Employee emp : TopSalary) {
            System.out.println(emp.toString());
        }


    }
}
