class Employee {
    void displayDetails() {
        System.out.println("Employee Details");
    }
}

class Manager extends Employee {
    @Override
    void displayDetails() {
        System.out.println("Manager Details with Team Info");
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();
        Manager m = new Manager();

        e.displayDetails();
        m.displayDetails();
    }
}
