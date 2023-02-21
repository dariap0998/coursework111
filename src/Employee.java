public class Employee  {
     public static int id = 0;
    private String fullName;
    private int department;
    private int salary;
    private int count;


    public Employee (String fullName, int department, int salary) {
        this.count = id++;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;

    }
    public String getFullName() {
        return fullName;
    }

    public int getCount() {
        return count;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "ФИО сотрудника - " + fullName + ". Отдел - " + department + ". Зарплата сотрудника - " + salary;
    }

}
