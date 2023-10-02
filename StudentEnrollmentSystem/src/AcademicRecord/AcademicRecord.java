package AcademicRecord;

import People.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AcademicRecord {

    Map<String, Integer> coursesAndGrades = new HashMap<String, Integer>();


    public void getGrade(String course){
        System.out.println(coursesAndGrades.get(course));
    }

    public void viewAcademicRecord(Map<String, Integer> coursesAndGrades){
        Student student = new Student();
        System.out.println("Here is your academic record: " + coursesAndGrades);
    }




}
