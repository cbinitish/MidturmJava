package json.parser;

public class Employee {

    private String empEmail;
    private String empName;
    private String salary;
    private String department;

    public Employee() {
    }

    public static void main(String[] args) {

    }

    public Employee(String empEmail, String empName, String salary, String department) {
        this.empEmail = empEmail;
        this.empName = empName;
        this.salary = salary;
        this.department = department;
    }

    public String getEmpEmail() {
        String email = "Cbinitish@gmail.com";
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEmpName() {
        String name = "Nitish";
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getSalary() {
        String salary = "$7000";
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        String Department = "23-34,256st";
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;

    }
}
