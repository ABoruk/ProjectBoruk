package homework.Task15;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Вася", "Пупкин", 25, 3000);
        Employee employee2 = new Employee(2, "Коля", "Николаев", 26, 3500);
        Employee employee3 = new Employee(3, "Петя", "Петров", 27, 4000);
        Employee employee4 = new Employee(4, "Саша", "Александров", 28, 4500);
        Employee employee5 = new Employee(5, "Федя", "Федоров", 29, 5000);
        Employee employee6 = new Employee(6, "Захар", "Захаров", 30, 5500);
        Employee employee7 = new Employee(7, "Настя", "Борук", 31, 6000);
        Employee employee8 = new Employee(8, "Оля", "Ермолич", 32, 6500);

        Map<Employee, String> employees = new HashMap<>();
        employees.put(employee1, "Плотник");
        employees.put(employee2, "Строитель");
        employees.put(employee3, "Врач");
        employees.put(employee4, "Учитель");
        employees.put(employee5, "Столяр");
        employees.put(employee6, "Разработчик");
        employees.put(employee7, "Тестировщик");
        employees.put(employee8, "Экономист");
        raiseSalaryForProfession(employees, 200);
        System.out.println(employee1.getSalary());


    }

    private static void raiseSalaryForProfession(Map<Employee, String> employees, int amountOfIncrease) {

        Set<Map.Entry<Employee, String>> entries = employees.entrySet();
        for (Map.Entry<Employee, String> node : entries) {
            if (node.getValue().equals("Плотник")) {
                double newSalary = (node.getKey().getSalary() + amountOfIncrease);
                node.getKey().setSalary(newSalary);
            }
        }
    }
}
