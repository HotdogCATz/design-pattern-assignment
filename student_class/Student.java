package student_class;

public class Student {
    // Required attributes
    public String name;
    public String university;

    // Optional attributes
    public Integer age;

    public Student(String name, String university) {
        this.name = name;
        this.university = university;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(name).append("\n");
        sb.append("University: ").append(university).append("\n");
        if (age != null) {
            sb.append("Age: ").append(age).append("\n");
        }
        return sb.toString();
    }
}
