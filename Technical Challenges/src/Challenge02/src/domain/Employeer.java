package Challenge02.src.domain;

public class Employeer {
    private String name;
    private int age;
    private double salary;
    private String function;
    private double amount;

    public Employeer() {
        this.name = "";
        this.age = 0;
        this.salary = 0.0;
        this.function = "";
    }

    public Employeer(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Employeer(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public Employeer(String name, int age, double salary, String function) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.function = function;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        if (name== null) {
            System.out.println("Name cannot be empty");
            System.out.println("Name dont's vazio");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        if (age < 0) {
            System.out.println("Age cannot be negative");
            this.age = 0;
        }else if (age < 18) {
            System.out.println("Age must be at least 18");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Function: " + function);
    }
    public void addedAmount (double amount) {
        if (amount < 0) {
            System.out.println("Amount cannot be negative");
        } else {
            this.salary += (this.salary * amount / 100);
        }
    }
    public void newFunction(String function){
        this.function = function;

    }

}
