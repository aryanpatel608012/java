package student;

public class Student {
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public void displayStudent() {
        System.out.println(rollNo + " " + name);
    }
}
package exam;
import student.Student;

public class Result extends Student {
    int m1, m2, m3;

    public Result(int r, String n, int m1, int m2, int m3) {
        super(r, n);
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    public void displayResult() {
        displayStudent();
        int total = m1 + m2 + m3;
        System.out.println("Total: " + total);
        System.out.println("Average: " + (total / 3));
    }

    public static void main(String[] args) {
        Result r = new Result(1, "Aarav", 80, 70, 90);
        r.displayResult();
    }
}
