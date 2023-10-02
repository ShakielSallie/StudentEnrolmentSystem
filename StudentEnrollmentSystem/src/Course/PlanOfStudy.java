package Course;

import Course.Course;

import java.util.ArrayList;
import java.util.Scanner;

public class PlanOfStudy {

    ArrayList<Course> courses = new ArrayList<>();
    DegreeProgram dg = new DegreeProgram();
    Course course = new Course();



    public void addNewCourse(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the course name: ");
        String courseName = input.nextLine();
        System.out.println("Enter the course ID: ");
        String courseCode = input.nextLine();
        System.out.println("Enter the course description: ");
        String description = input.nextLine();
        course.setTitle(courseName);
        course.setCourseID(courseCode);

        if(course.coursesList.contains(courseName)){
            System.out.println("you are already taking this course");
        }else {
            if(course.getSeatsAvailable(courseName) == 100){
                System.out.println(
                                "Sorry the class has reached full capacity." +
                               " You will be added to the waiting list. " +
                                "If space becomes available you will be notified. "
                );
            } else {
                courses.add(course);
            }
        }
    }

    public void removeCourse() {
        System.out.println("Enter the name of the course you would like to remove: ");
        String courseName = new Scanner(System.in).nextLine();
        if(!courses.contains(courseName)){
            courses.remove(courseName);
            System.out.println("Course removed");
        }else{
            System.out.println("Course not found");
            removeCourse();
        }
    }

    public void run() {
        System.out.println("Would you like to;\n1: Add a new course to your study plan\n2: remove a course from your study plan\n3: view study plan");
        int choice = new Scanner(System.in).nextInt();
        switch (choice) {
            case 1:
                addNewCourse();
                break;
            case 2:
                removeCourse();
                break;
            case 3:
                System.out.println("Select the correct option:\n1: BCom General\n2: Bsc Computer Science\n3: Bsc Science ");
                int choice2 = new Scanner(System.in).nextInt();
                switch (choice2) {

                    case 1:

                        System.out.println(dg.BComCourseList);
                        break;
                    case 2:
                        System.out.println(dg.BscComputerScienceCourses);
                        break;
                    case 3:
                        System.out.println(dg.BscScienceCourses);
                        break;
                    default:
                        System.out.println("Invalid choice");
                        run();
                        break;
                }
                break;
            default:
                System.out.println("Invalid choice");
                run();
                break;
        }
    }


}


