public class Main {
    public static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Лыткин Сергей", 1, 45_000);
        employees[1] = new Employee("Осипова Елена", 1, 52_000);
        employees[2] = new Employee("Чернова Светлана", 1, 74_000);
        employees[3] = new Employee("Волков Кирилл", 1, 35_000);
        employees[4] = new Employee("Веселова Ирина", 1, 63_000);
        employees[5] = new Employee("Сидорова Екатерина", 1, 55_000);
        employees[6] = new Employee("Костин Михаил", 1, 41_000);
        employees[7] = new Employee("Абрамова Дарья", 1, 58_000);
        employees[8] = new Employee("Носов Владимир", 1, 79_000);
        employees[9] = new Employee("Коммисаров Иван", 1, 60_000);

        printEmployeeList();
        System.out.println(calculateMonthlyOfficeSalary());
        System.out.println(findMinSalaryEmployee().toString());
        System.out.println(findMaxSalaryEmployee().toString());
        System.out.println(calculateAvgSalary());
        printEmployeeNames();
    }

    public static void printEmployeeList() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
        }
    }

    public static int calculateMonthlyOfficeSalary() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum = sum + employees[i].getSalary();
        }
        return sum;
    }

    public static Employee findMinSalaryEmployee() {
        Employee minSalEmp = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (minSalEmp.getSalary() > employees[i].getSalary()) {
                minSalEmp = employees[i];
            }
        }
        return minSalEmp;
    }

    public static Employee findMaxSalaryEmployee() {
        Employee maxSalEmp = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (maxSalEmp.getSalary() < employees[i].getSalary()) {
                maxSalEmp = employees[i];
            }
        }
        return maxSalEmp;
    }

    public static int calculateAvgSalary() {
        return calculateMonthlyOfficeSalary() / employees.length;
    }

    public static void printEmployeeNames() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getFullName());
        }
    }
}