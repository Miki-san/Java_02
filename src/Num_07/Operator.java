package Num_07;

public class Operator implements EmployeePosition {
    Company selfCompany;
    Operator(Company company){
        this.selfCompany = company;
    }

    @Override
    public String getJobTitle() {
        return "Operator";
    }

    @Override
    public double calcSalary(double baseSalary) {
        return baseSalary;
    }
}
