import java.io.*;
import java.util.*;

class Student {
    int id;
    String name;
    double marks;

    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}

class StudentManager {

    Scanner sc = new Scanner(System.in);

    void writeStudent() {
        try {

            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Student Marks: ");
            double marks = sc.nextDouble();

            Student s = new Student(id, name, marks);

            FileWriter fw = new FileWriter("students.txt", true);
            fw.write(s.id + " " + s.name + " " + s.marks + "\n");
            fw.close();

            System.out.println("Student record saved successfully.");

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter correct data.");
            sc.nextLine();
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }

    void readStudents() {
        try {

            File file = new File("students.txt");

            if (!file.exists()) {
                System.out.println("File does not exist.");
                return;
            }

            Scanner fileReader = new Scanner(file);

            System.out.println("\nStudent Records:");

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                System.out.println(line);
            }

            fileReader.close();

        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}

public class LabMst {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentManager sm = new StudentManager();

        int choice;

        while (true) {

            System.out.println("\n===== Student File Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    sm.writeStudent();
                    break;

                case 2:
                    sm.readStudents();
                    break;

                case 3:
                    System.out.println("Program exited.");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
