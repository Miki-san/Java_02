package Num_07;

import java.util.Collections;
import java.util.List;

public class Company {
    int count;
    String Name;
    double Income = 0;
    List<Employee> Staff;
    List<Employee> SortedStaff;

    Company(String name){
        this.Name = name;
        this.count = 0;
        SortedStaff.addAll(Staff);
    }

    double getIncome(){
        double counter = 0;
        for (Employee employee : Staff) {
            if(employee.position.getJobTitle() == "Manager"){
                counter += employee.Salary - employee.baseSalary;
            }
        }
        return counter;
    }

    void hire(Employee employee){
        Staff.add(employee);
        this.count++;
    }

    void hireAll(List<Employee> employees){
        Staff.addAll(employees);
        this.count += employees.size();
    }

    void fire(int Id){
        for (Employee employee : Staff) {
            if(employee.id == Id){
                Staff.remove(employee);
                SortedStaff.addAll(Staff);
                SortedStaff.addAll(getSortedStaff());
            }
        }
    }
    private void toSwap(Employee first, Employee second){
        Employee temp = first;
        first = second;
        second = temp;
    }

    public void bubbleSorter(List<Employee> employees){
        for (int out = count - 1; out >= 1; out--){
            for (int in = 0; in < out; in++){
                if(employees.get(in).Salary > employees.get(in + 1).Salary)
                    toSwap(employees.get(in), employees.get(in + 1));
            }
        }
    }
    List<Employee> getSortedStaff(){
        bubbleSorter(this.SortedStaff);
        return SortedStaff;
    }

    List<Employee> getTopSalaryStaff(int Count){
        Collections.reverse(getSortedStaff());
        return SortedStaff.subList(0, Count--);
    }

    List<Employee> getLowestSalaryStaff(int Count){
        return getSortedStaff().subList(0, Count--);
    }
}
