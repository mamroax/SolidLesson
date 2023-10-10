//SRP
public class Employee {
    private String name;
    private double salary = 200.0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void saveEmployee() {
        // Сохранение данных сотрудника в базу данных
    }
}

class Accounting {
    Employee employee1 = new Employee();
    public void calculateSalary() {
        // Подсчет заработной платы
    }
}

