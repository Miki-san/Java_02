package Num_07;

public class TopManager implements EmployeePosition{
    Company selfCompany;
    TopManager(Company company){
        this.selfCompany = company;
    }

    @Override
    public String getJobTitle() {
        return "TopManager";
    }

    @Override
    public double calcSalary(double baseSalary) {
        if(selfCompany.getIncome() > 10000000){
            return baseSalary * 2.5;
        }else{
            return baseSalary;
        }
    }
}
