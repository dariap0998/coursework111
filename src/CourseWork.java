public class CourseWork {
    static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        fill();
        printAll();
        printNames();
        sumSalary();
        minSalary();
        maxSalary();
        avrSalary();
    }
    public static void fill() {
        employees[0] = new Employee("Мария Иванова", 2, 83000);
        employees[1] = new Employee("Марина Средняя", 4, 90000);
        employees[2] = new Employee("Екатерина Смелая", 2, 101000);
        employees[3] = new Employee("Владимир Сысоев", 1, 99000);
        employees[4]= new Employee("Дарья Понко", 5, 114000);
        employees[5] = new Employee("Алексей Редько", 5, 120000);
        employees[6] = new Employee("Филлип Бледный", 3, 98000);
        employees[7] = new Employee("Кристина Яковлева", 3, 86000);
        employees[8]= new Employee("Дмитрий Варшавин", 1, 70000);
        employees[9] =new Employee("Федор Бодров", 3, 73000);
    }

    private static void printAll() {
        System.out.println("Задание 1");
        for (Employee employee : employees) {
            System.out.println(employee); }

    }

    private static void printNames() {
        System.out.println("Задание 2");
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }

    private static int sumSalary() {
        System.out.println("Задание 3");
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        System.out.println(sum);
        return sum;
    }

    private static void minSalary() {
        System.out.println("Задание 4");
        int min = Integer.MAX_VALUE;
        for (Employee employee : employees) {
            if (min > employee.getSalary()) {
                min = employee.getSalary();
            }
        }
        System.out.println("Минамальная зарплата - " + min);
    }

    private static void maxSalary() {
        System.out.println("Задание 5");
        int max = Integer.MIN_VALUE;
        for (Employee employee : employees) {
            if (max < employee.getSalary()) {
                max = employee.getSalary();
            }
        }
        System.out.println("Максимальная зарплата - " + max);
    }
    private static void avrSalary() {
        System.out.println("Задание 6");
        int sum = sumSalary();
       double avr = sum / employees.length;
       System.out.println("Средняя зарплата сотрудников - " + avr);
      }
}


