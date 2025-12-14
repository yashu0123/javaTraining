package comparator;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student  {
    int studentId;
    String studentName;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}
class studentSort implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o2.getStudentId() - o1.getStudentId();
    }
}
public class comparator1 {

    public static void main(String[] args) {
        List<Student> students= new ArrayList<>();

        students.add(new Student(1 , "ram"));

        students.add(new Student(2 , "ram1"));
        students.add(new Student(5 , "aam"));
        students.add(new Student(3 , "shyam"));
        students.add(new Student(4 , "jam"));

  //      Collections.sort(students ,new studentSort());
//        students.sort(new studentSort());

 //       students.sort((o1 , o2)-> o1.getStudentId() - o2.getStudentId());

   //     Collections.sort(students ,(o1 , o2)-> o2.getStudentId() - o1.getStudentId());


        Comparator<Student> sortById = Comparator.comparing(Student::getStudentId).reversed();

        Comparator<Student> sortByName = Comparator.comparing(Student::getStudentName);

  //      students.sort(sortById);
        students.sort(sortByName);
        for(Student x : students) {
            System.out.println(x.toString());

        }






    }
}
