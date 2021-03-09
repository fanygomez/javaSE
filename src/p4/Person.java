package p4;

public class Person {
    String name;
    int age = 25;

    public  Person(String name){
        setName(name);
    }

    public Person(String name, int age){
        new Person(name);
        setAge(age);
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

    public String show(){
        return name + " "+ age;
    }
}
