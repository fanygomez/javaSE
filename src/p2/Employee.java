package p2;

public class Employee {
    String name;
    boolean contract;
    double salary;

    Employee(){
        //ln1
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", contract=" + contract +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        //ln2
//        e.name = "Jose";
//        e.contract = true;
//        e.salary = 100;
//        this.name = new String( "Jose");
//        this.contract = true;
//        this.salary = 100;

        System.out.println(e);
    }
}
