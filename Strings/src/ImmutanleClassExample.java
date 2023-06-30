final class Employee{
    final String SSN;

    public Employee(String SSN) {
        this.SSN = SSN;
    }

    public String getSSN() {
        return SSN;
    }
}
public class ImmutanleClassExample {
    public static void main(String[] args) {
        Employee employee = new Employee("123854");
        String s1 = employee.getSSN();
        System.out.println("SSN: "+ s1);
    }
}
/*
The above class is immutable because:

1) The instance variable of the class is final i.e. we cannot change the value of it after creating an object.
2) The class is final so we cannot create the subclass.
3) There is no setter methods i.e. we have no option to change the value of the instance variable.

These points makes this class as immutable.
*/
