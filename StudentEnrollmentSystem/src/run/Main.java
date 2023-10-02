package run;

import People.FacultyAdvisor;
import People.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
       }

       public void run() {
           System.out.println("Welcome to the Universities Student Enrollment System");
           System.out.println("Please select an option:\n1: student\n2: Faculty Advisor\n3: exit");
           int choice = new Scanner(System.in).nextInt();
           boolean using = true;
           while (using) {
               switch (choice) {
                   case 1:
                       Student student = new Student();
                       student.run();
                       break;
                   case 2:
                       FacultyAdvisor facultyAdvisor = new FacultyAdvisor();
                       facultyAdvisor.run();
                       break;
                   case 3:
                       System.out.println("Goodbye");
                       using = false;
                   default:
                       System.out.println("Invalid choice");
               }
           }
       }
}