package Num_07;

public class Manager implements EmployeePosition {
    Company selfCompany;
    Manager(Company company){
        this.selfCompany = company;
    }

    @Override
    public String getJobTitle() {
        return "Manager";
    }

    @Override
    public double calcSalary(double baseSalary) {
        return baseSalary + 0.05 * (115000 + (int)(35000 * Math.random()));
    }
}
