import java.util.ArrayList;
import java.util.List;

public class EmployeeGroup {
    List<Employee> employees = new ArrayList<>();
    public void saveEmployee(Employee employee){
        employees.add(employee);
    }
}
