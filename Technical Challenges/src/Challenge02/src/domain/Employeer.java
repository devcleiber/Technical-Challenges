package Challenge02.src.domain;

public class Employeer {
    private String name;
    private int age;
    private double salary;
    private String function;

    public Employeer() {
        this.name = "";
        this.age = 0;
        this.salary = 0.0;
        this.function = "";
    }

    public Employeer(String name, String function) {
        setName(name);
        setFunction(function);
    }
    public Employeer(String name, int age, double salary) {
        setName(name);
        setAge(age);
        setSalary (salary);
    }
    public Employeer(String name, int age, double salary, String function) {
        setName(name);
        setAge(age);
        setSalary(salary);
        setFunction(function);
    }

    // Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name== null || name.trim().isEmpty()) {
            System.out.println("Name cannot be empty");
            return;
        }
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Age cannot be negative");
            return;
        }else if (age < 18) {
            System.out.println("Age must be at least 18");
            return;
        }
        this.age = age;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary){
        if (salary < 0){
            System.out.println("Salary cannot be negative");
            return;
        }
        this.salary = salary;
    }
    public String getFunction() {
        return function;
    }
    public void setFunction(String function) {
        if (function == null || function.trim().isEmpty()) {
            System.out.println("Function cannot be empty");
            return;
        }
        this.function = function;
    }
    public void displayInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Salary: " + this.salary);
        System.out.println("Function: " + this.function);
    }
    public void addedAmount (double amount) {
        if (amount <= 0) {
            System.out.println("Amount cannot be negative");
            return;
        } else {
            this.salary = this.salary + (this.salary * amount / 100);
        }
    }
    public boolean isAdult() {
        return this.age >= 18;
    }

}
