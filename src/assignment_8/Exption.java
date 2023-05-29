package assignment_8;

import assignment_4.Student;
import assignment_4.app.Application;

import java.util.List;
import java.util.stream.Stream;

public class Exption {


    public static Student getStudentByIdUnchecked(Student[]  students, int id) {

        for (Student student : students) {
            if (student.getID() == id)
                return student;
        }

        throw new RuntimeException("Student not found with ID: " + id);
    }


    public static Student getStudentByIdChecked(Student[]  students, int id) throws RuntimeException {


        for (Student student : students) {
            if (student.getID() == id)
                return student;
        }

        throw new RuntimeException("Student not found with ID: " + id);

}



    public static Student getStudentByIdOptional(Student[]  students, int id) {

        Student st1 = null;
        for (Student student : students) {
            if (student.getID() == id)
                st1 = student;
        }
        return st1;
    }

    public static void main(String[] args) {


        System.out.println(getStudentByIdUnchecked(Application.students , 7));
        System.out.println(getStudentByIdChecked(Application.students , 7));
        System.out.println(getStudentByIdOptional(Application.students, 7));





    }

}
