package Num_09;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {
    String name, surname, birthplace, phone_number;
    int salary;
    LocalDate ld;
    DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public Employee(String name, String surname, String birthplace, String phone_number, int salary, int year, int month, int day) {
        this.name = name;
        this.surname = surname;
        this.birthplace = birthplace;
        this.phone_number = phone_number;
        this.salary = salary;
        this.ld = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public int getSalary() {
        return salary;
    }

    public LocalDate getLd() {
        return ld;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthplace='" + birthplace + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", salary=" + salary +
                ", ld=" + f.format(ld) +
                '}';
    }
}
