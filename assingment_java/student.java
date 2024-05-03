public class student extends User {

    public student(String username, String password) {
        super(username, password);
    }

    private String[] courses = { "- Java Programming", "- Web Development", "- Data Science", "- Machine Learning" };

    public void showCourses() {
        for (int i = 0; i < courses.length; i++) {
            System.out.println(courses[i]);
        }
    }
}
