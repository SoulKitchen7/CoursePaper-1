public class Employee {
    private String name;
    private int department;
    private int salary;
    private static int counter;
    private int id;
    public Employee(String name, int department, int salary) {
        id = ++ counter;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
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
        return + id + " - Ф.И.О.: " + name + "/ Отдел: " + department + "/ Зарплата: " + salary + " рублей";
    }

    }

