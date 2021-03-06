package grades;
import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName() {
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return total / grades.size();
    }

    public static void main(String[] args) {
        Student student = new Student("Sally");
        student.addGrade(80);
        student.addGrade(100);
        System.out.println(student.getGradeAverage());
    }


}
