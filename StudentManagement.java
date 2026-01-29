import java.util.*;

class Student {
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}

public class StudentManagement {
    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1.Add  2.View  3.Update  4.Delete  5.Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> viewStudents();
                case 3 -> updateStudent();
                case 4 -> deleteStudent();
                case 5 -> System.exit(0);
                default -> System.out.println("Invalid choice");
            }
        }
    }

    static void addStudent() {
        System.out.print("ID: ");
        int id = sc.nextInt();
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Marks: ");
        int marks = sc.nextInt();

        students.add(new Student(id, name, marks));
        System.out.println("Student Added Successfully");
    }

    static void viewStudents() {
        for (Student s : students) {
            System.out.println(s.id + " " + s.name + " " + s.marks);
        }
    }

    static void updateStudent() {
        System.out.print("Enter ID to update: ");
        int id = sc.nextInt();

        for (Student s : students) {
            if (s.id == id) {
                System.out.print("New Name: ");
                s.name = sc.next();
                System.out.print("New Marks: ");
                s.marks = sc.nextInt();
                System.out.println("Updated Successfully");
                return;
            }
        }
        System.out.println("Student not found");
    }

    static void deleteStudent() {
        System.out.print("Enter ID to delete: ");
        int id = sc.nextInt();

        students.removeIf(s -> s.id == id);
        System.out.println("Deleted Successfully");
    }
}