package Num_09;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int k = 0;
        String num;
        Company company = new Company();
        Random r = new Random();
        for (int i = 0; i < 50; i++){
            num = "+8-";
            k = r.nextInt(1000);
            num += String.valueOf(k) + "-";
            k = r.nextInt(100);
            num += String.valueOf(k) + "-";
            k = r.nextInt(100);
            num += String.valueOf(k);
            company.hire(new Employee("Maksim", "Astaf'ev", "Moscow", num, 30_000 + r.nextInt(20_000), 1900 + r.nextInt(120), 1 + r.nextInt(12), 1 + r.nextInt(28)));
        }
        company.doSomethingWithEmployee(new YearSelector(1956, 2000), (employee, phone_num) -> System.out.println("employee" + phone_num + ":" + employee));

        int yearStart = 1956;
        int yearEnd = 2000;
        company.doSomethingWithEmployee(new SelectorEmployees() {
            @Override
            public boolean isNeedEmployee(Employee employee) {
                return employee.getLd().getYear() >= yearStart && employee.getLd().getYear() <= yearEnd;
            }
        }, new HandleEmployees() {
            @Override
            public void handleEmployee(Employee employee, String phone_num) {
                System.out.println("======" + phone_num + "======");
                System.out.println(employee);
            }
        });
        ArrayList<Employee> selection = new ArrayList<>();
        company.doSomethingWithEmployee(employee -> employee.getLd().getYear() > 1967, ((employee, phone_num) -> selection.add(employee)) );
        System.out.println(selection);

        SelectorEmployees selector = employee -> employee.getLd().getYear() > 1967;
        company.doSomethingWithEmployee(selector, Main::doSome);
    }
    static void doSome(Employee employee, String phone_num){
        System.out.println("++++++" + phone_num + "++++++");
        System.out.println(employee);
    }
}
