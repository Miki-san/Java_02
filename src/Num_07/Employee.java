package Num_07;

public class Employee {
    String surname, name;
    double baseSalary, Salary;
    int id;
    EmployeePosition position;
    Company selfCompany;

    Employee(String Surname, String Name, double BaseSalary, String Position, Company company, int Id){
        this.surname = Surname;
        this.name = Name;
        this.baseSalary = BaseSalary;
        this.selfCompany = company;
        this.id = Id;
        this.setPosition(Position);
        this.Salary = position.calcSalary(this.baseSalary);
    }
    void setPosition(String Position){
        if(Position == "Manager"){
            position = new Manager(this.selfCompany);
        } else if (Position == "TopManager"){
            position = new TopManager(this.selfCompany);
        }else if (Position == "Operator"){
            position = new Operator(this.selfCompany);
        }
    }
}
