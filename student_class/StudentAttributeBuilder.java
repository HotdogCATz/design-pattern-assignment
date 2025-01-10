package student_class;

public class StudentAttributeBuilder extends StudentBuilder {
    public StudentAttributeBuilder(Student student) {
        super(student.name, student.university);
        this.student = student;
    }

    public StudentAttributeBuilder withAge(int age) {
        student.age = age;
        return this;
    }
}
