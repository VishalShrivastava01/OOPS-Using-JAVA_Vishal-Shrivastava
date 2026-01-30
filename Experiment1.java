class Student {
    int rollNo;
    String name;

    Student() {
        rollNo=101;
        name="Vishal";
    }

    Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    void display() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
    }
}

public class Experiment1 {
    public static void main(String[] args) {

        Student s1 = new Student();

        Student s2 = new Student(101, "Vishal");

        System.out.println("Student 1 Details:");
        s1.display();

        System.out.println("Student 2 Details:");
        s2.display();
    }
}
