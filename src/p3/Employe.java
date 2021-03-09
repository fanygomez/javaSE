package p3;

public class Employe {
    private String name;
    private int age;
    private int salary;

    public Employe(String name, int age) {
        setName(name);
        setAge(age);
        setSalary(1000);
    }

    public Employe(String name, int age, int salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
        this(name,age);//this tiene prioridad

        setSalary(1000);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void printDetails(){
        System.out.println(name +" : "+ age +" : "+salary);
    }
}
