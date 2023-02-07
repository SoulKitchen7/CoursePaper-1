public class Employee {
    private String name;
    private int department;
    private double salary;
    private static int counter;
    private int id;

    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public static int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(int id, String name, int department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = id;
    }

    @Override
    public String toString() {
        return + id + " - Ф.И.О.: " + name + "/ Отдел: " + department + "/ Зарплата: " + salary + " рублей";
    }

    }

