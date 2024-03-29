import java.util.ArrayList;
import java.util.List;

public class Student {
    private final String firstName;
    private final String lastName;
    List<Exam> exams;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Exam> getExams() {
        return exams;
    }

    public void registerExam(Exam exam) {
        this.exams.add(exam);
    }   //exams è list  // exam è l'oggetto della classe Exam

    public double computeAverageGrade() {   // media voti
        double averageGrade = 0;

        for( Exam exam : this.exams)
            averageGrade += exam.getGrade();
        averageGrade /= exams.size();

        return averageGrade;

    }
}