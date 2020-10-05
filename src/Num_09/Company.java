package Num_09;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Company {
    private final ArrayList<Employee> employee;
    private int count, current_count;

    public Company() {
        this.current_count = 0;
        this.count = 0;
        employee = new ArrayList<>();
    }

    private void refresh(){
        current_count = count;
    };

    public void hire(Employee emp){
        employee.add(emp);
        this.count++;
    }

    public void fire(String phone_num){
        for (int i = 0; i < employee.size(); i++){
            if(employee.get(i).phone_number == phone_num){
                employee.remove(i);
                break;
            }
        }
        count --;
    }


    public void doSomethingWithEmployee(SelectorEmployees selector, HandleEmployees handler){
        int count = 0;
        for (Employee emp : employee){
            if(selector.isNeedEmployee(emp)){
                handler.handleEmployee(emp, emp.phone_number);
                count++;
            }
        }
        System.out.println(count);
    }
}
