package chapter12;

import java.util.Map;

public class GradeBook {

    public static void main(String[] args){
        Map<String, Integer> gradeBook = TestResults.getOriginalGrades();
        Map<String, Integer> exam2 = TestResults.getMakeUpGrades();

        for(var student: exam2.entrySet()){
            Integer firstExam = gradeBook.get(student.getKey());
            Integer secondExam = exam2.get(student.getKey());

            if(secondExam > firstExam){
                gradeBook.put(student.getKey(),secondExam);
            }

        }

        print("Final Grades: ");
        gradeBook.forEach(
                (key,val) -> print("Student: "+key+", Grade: "+val)
        );

    }

    public static void print(String txt){
        System.out.println(txt);
    }

    public static void print(Object obj){
        System.out.println(obj);
    }

}
