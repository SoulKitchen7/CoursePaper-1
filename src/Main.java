import java.util.Arrays;

public class Main {
    static Employee[] employee = new Employee[10];
    public static void main(String[] args) {
        employee[0] = new Employee(1, "Иванов Серегей Николаевич", 1, 85_000);
        employee[1] = new Employee(2, "Петрова Лариса Олеговна", 2, 105_000);
        employee[2] = new Employee(3, "Сидорова Ирина Игоревна", 3, 75_000);
        employee[3] = new Employee(4, "Аршавин Андрей Алексеевич", 4, 110_000);
        employee[4] = new Employee(5, "Кержаков Алекснадр Петрович", 5, 150_000);
        employee[5] = new Employee(6, "Быстров Владимир Иванович", 1, 87_000);
        employee[6] = new Employee(7, "Сергеев Андрей Александрович", 2, 94_000);
        employee[7] = new Employee(8, "Захарова Ольга Дмитриевна", 3, 115_000);
        employee[8] = new Employee(9, "Петров Александр Евгеньевич", 4, 95_000);
        employee[9] = new Employee(10, "Бойцов Максим Викторович", 5, 86_000);

        printEmployee();
        System.out.println("");
        System.out.println("Сумма затрат на зарплату в месяц - " + sumSalary(employee) + " рублей");
        System.out.println("");
        employeeWithMinSalary(employee);
        System.out.println("");
        employeeWithMaxSalary(employee);
        System.out.println("");
        averageSalary(employee);
        System.out.println("");
        printName(employee);


    }
    // Метод а - распечатать данные всех сотрудников
    public static void printEmployee() {
        for (Employee e : employee) {
            System.out.println(e);
        }
    }

    // Метод b - посчитать сумму затрат на зарплаты в месяц
    public static double sumSalary(Employee [] employee) {
    double sum = 0;
        for (Employee i : employee) {
            sum += i.getSalary();
        }
        return sum;
    }
    // Метод с - найти сотрудника с минимальной зарплатой

    public static void employeeWithMinSalary(Employee[] employee) {
        double minSalary = employee[0].getSalary();
        String name = employee [0].getName();
        for (Employee i : employee) {
            final double current = i.getSalary();
            final String employeeWithMinSalary = i.getName();
            if (current < minSalary) {
                minSalary = current;
                name = employeeWithMinSalary;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой - " + name + " - " + minSalary + " рублей");
    }
    // Метод d - найти сотрудника с максимальной зарплатой
    public static void employeeWithMaxSalary(Employee[] employee) {
        double maxSalary = employee[0].getSalary();
        String name = employee [0].getName();
        for (Employee i : employee) {
            final double current = i.getSalary();
            final String employeeWithMaxSalary = i.getName();
            if (current > maxSalary) {
                maxSalary = current;
                name = employeeWithMaxSalary;
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой - " + name + " - " + maxSalary + " рублей");
    }
    // Метод e - посчитать среднюю зарплату в месяц
    public static void averageSalary(Employee[] employee) {
        double averageSalary = sumSalary(employee) / employee.length;
        System.out.println("Средняя зарплата в месяц составляет - " + averageSalary+ " рублей");
    }

    // Метод f - напечатать ФИО сотрудников
    public static void printName(Employee[] employee) {
        for (Employee i : employee) {
            System.out.println(i.getName());
        }
    }
}