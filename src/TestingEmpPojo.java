import java.util.Arrays;

public class TestingEmpPojo {

    public static void main(String[] args) {
        UpperManagement up =new UpperManagement();

        Inventory inventory=new Inventory();
        inventory.setNoOfLaptops(1000);
        inventory.setNoOfHouskeepingstaff(25);

        Employee employee=new Employee();
        employee.setAge(25);
        employee.setGender("Male");
        employee.setName("arjun");

        Employee employee2=new Employee();
        employee2.setAge(27);
        employee2.setGender("Female");
        employee2.setName("pooja");

        Employee employee3=new Employee();
        employee3.setAge(22);
        employee3.setGender("Female");
        employee3.setName("Diksha");

        up.setEmployeeList(Arrays.asList(employee,employee2,employee3));
        System.out.println(up.getEmployeeList().toString());






    }
}
