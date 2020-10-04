package Num_07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Company {
    int count, current_count;
    String Name;
    double Income = 0;
    List<Employee> Staff = new ArrayList<Employee>();
    List<Employee> SortedStaff = new ArrayList<Employee>();

    Company(String name){
        this.Name = name;
        this.count = 0;
        this.current_count = 0;
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

    void refresh(){
        current_count = count;
    };


    void hire(Employee employee){
        Staff.add(employee);
        SortedStaff.add(employee);
        this.count++;
    }

    void hireAll(List<Employee> employees){
        Staff.addAll(employees);
        SortedStaff.addAll(employees);
        this.count += employees.size();
    }

    void fire(int Id){
        for (int i = 0; i < Staff.size(); i++){
            if(Staff.get(i).id == Id){
                Staff.remove(i);
                break;
            }
        }
        SortedStaff.clear();
        SortedStaff.addAll(Staff);
        count --;
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
        List<Employee> temp = new ArrayList<Employee>();
        temp.addAll(getSortedStaff());
        Collections.reverse(temp);

        return temp.subList(0, Count--);
    }

    List<Employee> getLowestSalaryStaff(int Count){
        List<Employee> temp = new ArrayList<Employee>();
        temp.addAll(getSortedStaff());
        return temp.subList(0, Count--);
    }
}
