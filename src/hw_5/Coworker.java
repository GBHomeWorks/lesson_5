package hw_5;

public class Coworker {
    private String name, position, email, telephone;
    private int salary, age;

    public Coworker(String name, String position, String email, String telephone, int salary, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void info(){
        System.out.println("Name: " + name + ", position: " + position + ", email: " + email+ ", tel.: " + telephone + ", salary: " + salary + ", age: " + age);
    }
}
