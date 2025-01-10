package student_class;

public class App {
    public static void main(String[] args) {
        // student has Age
        StudentBuilder sb1 = new StudentBuilder("Alice", "Harvard");
        Student student1 = sb1
            .attributes()
            .withAge(20)
            .build();
        System.out.println(student1);

        // student has no Age
        StudentBuilder sb2 = new StudentBuilder("Bob", "MIT");
        Student student2 = sb2.build();
        System.out.println(student2);
    }
}
