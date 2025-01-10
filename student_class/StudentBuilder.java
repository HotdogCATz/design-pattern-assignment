package student_class;

public class StudentBuilder {
    protected Student student;

    public StudentBuilder(String name, String university) {
        student = new Student(name, university);
    }

    public StudentAttributeBuilder attributes() {
        return new StudentAttributeBuilder(student);
    }

    public Student build() {
        return student;
    }
}
