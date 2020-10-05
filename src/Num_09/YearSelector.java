package Num_09;

public class YearSelector implements SelectorEmployees {
    private int yearStart, yearEnd;

    public YearSelector(int yearStart, int yearEnd) {
        this.yearStart = yearStart;
        this.yearEnd = yearEnd;
    }

    @Override
    public boolean isNeedEmployee(Employee employee) {
        return employee.getLd().getYear() >= yearStart && employee.getLd().getYear() <= yearEnd;
    }
}
