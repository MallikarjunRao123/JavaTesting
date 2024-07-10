public class EmployinterfaceClass implements InterfaceExample,EmployeeExmap{
    @Override
    public void empFirstname() {
        System.out.println("cahndu");
    }

    @Override
    public void empLastName() {
        System.out.println("oruganti");

    }

    @Override
    public void employyeLocation() {
        System.out.println("Hyderabd");
    }

    @Override
    public void empId() {
        System.out.println("33333");

    }

    @Override
    public void empDesignation() {
        System.out.println("QAeniginer");

    }

    @Override
    public void empSalary(int salary) {


    }

    public static void main(String[] args) {
        EmployinterfaceClass empI = new EmployinterfaceClass();
        empI.empDesignation();
        empI.empFirstname();
        empI.empId();
        empI.empSalary(40000);

    }
}
