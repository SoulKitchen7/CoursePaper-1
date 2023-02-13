import java.util.Arrays;

public class Main {
    static Employee[] employee = new Employee[10];

    public static void main(String[] args) {
        employee[0] = new Employee("Иванов Серегей Николаевич", 1, 85_000);
        employee[1] = new Employee("Петрова Лариса Олеговна", 2, 105_000);
        employee[2] = new Employee("Сидорова Ирина Игоревна", 3, 75_000);
        employee[3] = new Employee("Аршавин Андрей Алексеевич", 4, 110_000);
        employee[4] = new Employee("Кержаков Алекснадр Петрович", 5, 150_000);
        employee[5] = new Employee("Быстров Владимир Иванович", 1, 87_000);
        employee[6] = new Employee("Сергеев Андрей Александрович", 2, 94_000);
        employee[7] = new Employee("Захарова Ольга Дмитриевна", 3, 115_000);
        employee[8] = new Employee("Петров Александр Евгеньевич", 4, 95_000);
        employee[9] = new Employee("Бойцов Максим Викторович", 5, 86_000);

        printEmployee();
        System.out.println("");
        System.out.println("Сумма затрат на зарплату в месяц - " + sumSalary() + " рублей");
        System.out.println("");
        employeeWithMinSalary();
        System.out.println("");
        employeeWithMaxSalary();
        System.out.println("");
        averageSalary();
        System.out.println("");
        printName();
        System.out.println("");
        indexSalary();
        System.out.println("");
        employeeWithMinSalaryInDepartment();




    }

    // Метод а - распечатать данные всех сотрудников
    public static void printEmployee() {
        for (Employee e : employee) {
            System.out.println(e);
        }
    }

    // Метод b - посчитать сумму затрат на зарплаты в месяц
    public static double sumSalary() {
        int sum = 0;
        for (Employee i : employee) {
            sum += i.getSalary();
        }
        return sum;
    }
    // Метод с - найти сотрудника с минимальной зарплатой

    public static void employeeWithMinSalary() {
        int minSalary = employee[0].getSalary();
        String name = employee[0].getName();
        for (Employee i : employee) {
            final int current = i.getSalary();
            final String employeeWithMinSalary = i.getName();
            if (current < minSalary) {
                minSalary = current;
                name = employeeWithMinSalary;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой - " + name + " - " + minSalary + " рублей");
    }

    // Метод d - найти сотрудника с максимальной зарплатой
    public static void employeeWithMaxSalary() {
        int maxSalary = employee[0].getSalary();
        String name = employee[0].getName();
        for (Employee i : employee) {
            final int current = i.getSalary();
            final String employeeWithMaxSalary = i.getName();
            if (current > maxSalary) {
                maxSalary = current;
                name = employeeWithMaxSalary;
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой - " + name + " - " + maxSalary + " рублей");
    }

    // Метод e - посчитать среднюю зарплату в месяц
    public static void averageSalary() {
        double averageSalary = sumSalary() / employee.length;
        System.out.println("Средняя зарплата в месяц составляет - " + averageSalary + " рублей");
    }

    // Метод f - напечатать ФИО сотрудников
    public static void printName() {
        for (Employee i : employee) {
            System.out.println(i.getId() + " - " + i.getName());
        }
    }

    // Повышенная сложность - Метод индексации зарплаты на 10%
    public static void indexSalary() {
        for (Employee i : employee) {
            int index = 10;
            double indexSalary = i.getSalary() * (1 + index/100d);
            indexSalary = Math.round(indexSalary*10);
            indexSalary = indexSalary/10;
            System.out.println(i.getName() +" " +indexSalary);
        }
    }

    // Повышенная сложность - Метод поиска сотрудника с минимальной зарплатой по отделу
    public static void employeeWithMinSalaryInDepartment() {
        int minSalary = employee[0].getSalary();
        String name = employee[0].getName();
        int department = 2;
        for (Employee i : employee) {
            if (i.getDepartment() == department) {
                final int current = i.getSalary();
                final String employeeWithMinSalary = i.getName();
                if (current < minSalary) {
                    minSalary = current;
                    name = employeeWithMinSalary;
                }
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой в отделе - " + department + " - "  + name + " - " + minSalary + " рублей");
    }
}