public class Instructor extends User {
    private String[] students = { "- Std1", "- Std2", "- Std3", "- Std4" };

    Instructor(String username, String password) {
        super(username, password);
    }

    public void showStudents() {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}
