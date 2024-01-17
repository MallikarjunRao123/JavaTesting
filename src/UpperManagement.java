import java.util.List;

public class UpperManagement {

    List<Employee> employeeList;
    Inventory inventory;




    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    @Override
    public String toString() {
        return "UpperManagement{" +
                "employeeList=" + employeeList +
                '}';
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
