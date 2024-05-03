import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {

        student[] students = { new student("student1", "password1"), new student("student2", "password2") };
        Instructor[] instructors = { new Instructor("instructor1", "password1"),new Instructor("instructor2", "password2") };

        Scanner scanner = new Scanner(System.in);
        boolean valid = true;

        while (valid) {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            for (student student : students) {
                if (student.getUsername().equals(username) && student.getPassword().equals(password)) {
                    System.out.println("Student logged in successfully.");
                    student.showCourses();
                    valid = false;
                    break;
                }
            }

            if (valid) {
                for (Instructor instructor : instructors) {
                    if (instructor.getUsername().equals(username) && instructor.getPassword().equals(password)) {
                        System.out.println("Instructor logged in successfully.");
                        instructor.showStudents();
                        valid = false;
                        break;
                    }
                }
            }

            if (valid) {
                System.out.println("Invalid username or password. Please try again.");
            }
        }

    }
}
