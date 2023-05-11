package assignment_4.app;

import assignment_4.Course;
import assignment_4.Gender;
import assignment_4.Student;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Application {

    static Student[] students = new Student[]{


            Student.of("bashar" , 23 , Gender.male ,  true, Course.java , Course.c ,Course.arabic),
            Student.of("ahmad" , 20 , Gender.male ,  false,  Course.c ,Course.arabic, Course.english),

            Student.of("fatema" , 21 , Gender.female ,  false, Course.java  ,Course.arabic),

            Student.of("hanan" , 25 , Gender.female ,  true, Course.java , Course.math ),
            Student.of("mohammad" , 18 , Gender.male ,  true, Course.arabic , Course.math, Course.english ),
            Student.of("ruba" , 17 , Gender.female ,  true, Course.c , Course.english ),



    };



    public static void main(String[] args) {

        List<Integer> studentsAge = Stream.of(students).map(s -> s.getAge()).collect(Collectors.toList());
        System.out.println("studentsAge = " + studentsAge);

        System.out.println("-------------------------------------");
        Map<Boolean,List<Student>> ageCategories=Stream.of(students)
                .collect(Collectors.groupingBy(s->s.getAge()>=20));

        List<Student> students20AndOver = ageCategories.get(true);
        List<Student> studentsUnder20 = ageCategories.get(false);


        print(students20AndOver , 1);
        counter=0;
        print(studentsUnder20 , 2);




    }

        static int counter =0;
        public static <T> void print (List<T> t , int i){

        if (counter == t.size()){
        }
        else{
            if(i==1)
                System.out.println("Students 20 and over: " + t.get(counter++));
            else
                System.out.println("Students under 20: " + t.get(counter++));

            print(t , i);
        }


        }




            
        }














