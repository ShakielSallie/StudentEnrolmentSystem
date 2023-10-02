package Course;

import People.Student;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class DegreeProgram {

    private String programID;
    private String programTitle;
    public ArrayList<Course> BComCourseList = new ArrayList<Course>();
    public ArrayList<Course> BscComputerScienceCourses = new ArrayList<Course>();
    public ArrayList<Course> BscScienceCourses = new ArrayList<Course>();
    private List<Course> requiredCourses;

    ArrayList<DegreeProgram> degreePrograms = new ArrayList<DegreeProgram>();
    private int credits;
    Course c = new Course();
    waitList wl = new waitList();


    public DegreeProgram(String programID, String programTitle, List<Course> requiredCourses, int credits) {
        this.programID = programID;
        this.programTitle = programTitle;
        this.requiredCourses = requiredCourses;
        this.credits = credits;
    }

    public DegreeProgram() {
    }



    public String getProgramTitle() {
        return programTitle;
    }



    public void BComGeneral() {


        BComCourseList.add(c.coursesList.get(7));
        BComCourseList.add(c.coursesList.get(8));
        BComCourseList.add(c.coursesList.get(9));

        System.out.println("The following courses are courses that you are required to take:\n" + BComCourseList);

        ArrayList<Course> OptionalBComCourseList = new ArrayList<Course>();
        OptionalBComCourseList.add(c.coursesList.get(10));
        OptionalBComCourseList.add(c.coursesList.get(11));

        System.out.println("The following courses are courses that are optional to take:\n" + OptionalBComCourseList);

        System.out.println("Please select the number of the corresponding optional course you would like to take:" +
                "(please not you must choose at least one optional course to take.)" +
                " \n" + "1: " + OptionalBComCourseList.get(0) + "\n2: " + OptionalBComCourseList.get(1) + "\n3: Both"
        );

        int choice = new Scanner(System.in).nextInt();
        switch (choice) {
            case 1:
                if (c.getSeatsAvailable("Mathematics") <= 100) {
                    System.out.println(OptionalBComCourseList.get(0) + "Have been added to your list of courses");
                    BComCourseList.add(OptionalBComCourseList.get(0));
                }else {
                    System.out.println("Sorry course is currently full: you can either:\n 1: select a new course\n2: Be added to the waiting list");
                    int select = new Scanner(System.in).nextInt();
                    switch (select) {
                        case 1:
                            BComGeneral();
                            break;
                        case 2:
                            wl.addToMathsWaitList();
                            break;
                        default:
                            System.out.println("Error! Please enter a valid choice");

                    }
                }
                break;
            case 2:
                if (c.getSeatsAvailable("Business Language") <= 100) {
                    System.out.println(OptionalBComCourseList.get(0) + "Have been added to your list of courses");
                    BComCourseList.add(OptionalBComCourseList.get(0));
                }else {
                    System.out.println("Sorry course is currently full: you can either:\n 1: select a new course\n2: Be added to the waiting list");
                    int select = new Scanner(System.in).nextInt();
                    switch (select) {
                        case 1:
                            BComGeneral();
                            break;
                        case 2:
                            wl.addToBusinessLanguageWaitList();
                            break;
                        default:
                            System.out.println("Error! Please enter a valid choice");

                    }
                }

                System.out.println(OptionalBComCourseList.get(2)+ "Have been added to your list of courses");
                BComCourseList.add(OptionalBComCourseList.get(2));
                break;
            case 3:
                if(c.getSeatsAvailable("Business Language") > 100 || c.getSeatsAvailable("Business Language")>100){
                    System.out.println("Sorry 1 or more of the courses you have selected are full. ");
                    BComGeneral();
                }else {
                    System.out.println(OptionalBComCourseList.get(0) + " and " + OptionalBComCourseList.get(1) + " have been added to your list of courses");
                    BComCourseList.add(OptionalBComCourseList.get(1));
                    BComCourseList.add(OptionalBComCourseList.get(2));
                }
                break;
            default:
                System.out.println("Please make sure you enter a valid option");

        }
    }


    public void enrollInBComGeneral(){
        Student student = new Student();
        ArrayList<Student> BComStudents = new ArrayList<Student>();
        BComStudents.add(student);
    }

    public void BScComputerScience() {

        BscComputerScienceCourses.add(c.coursesList.get(4));
        BscComputerScienceCourses.add(c.coursesList.get(5));
        BscComputerScienceCourses.add(c.coursesList.get(6));

        System.out.println("The following courses are courses that are optional to take:\n" + BscComputerScienceCourses);

        ArrayList<Course> OptionalBScComputerScienceCourses = new ArrayList<>();
        OptionalBScComputerScienceCourses.add(c.coursesList.get(12));
        OptionalBScComputerScienceCourses.add(c.coursesList.get(15));

        System.out.println("The following courses are courses that are optional to take:\n" + OptionalBScComputerScienceCourses);

        System.out.println("Please select the number of the corresponding optional course you would like to take:" +
                "(please not you must choose at least one optional course to take.)" +
                " \n" + "1: " + OptionalBScComputerScienceCourses.get(0) + "\n2: " + OptionalBScComputerScienceCourses.get(1) + "\n3: Both"
        );

        int choice = new Scanner(System.in).nextInt();
        switch (choice) {
            case 1:
                if (c.getSeatsAvailable("Computing") < 100) {
                    System.out.println(OptionalBScComputerScienceCourses.get(0) + "Have been added to your list of courses");
                    BscComputerScienceCourses.add(OptionalBScComputerScienceCourses.get(1));
                }else{
                    System.out.println("Sorry course is currently full: you can either:\n 1: select a new course\n2: Be added to the waiting list");
                    int select = new Scanner(System.in).nextInt();
                    switch (select) {
                        case 1:
                            BScComputerScience();
                            break;
                        case 2:
                            wl.addToComputingWaitList();
                            break;
                        default:
                            System.out.println("Error! Please enter a valid choice");

                    }
                }
                break;
            case 2:
                if(c.getSeatsAvailable("Multi Media") < 100) {
                    System.out.println(OptionalBScComputerScienceCourses.get(2) + "Have been added to your list of courses");
                    BscComputerScienceCourses.add(OptionalBScComputerScienceCourses.get(2));
                }else{
                    System.out.println("Sorry course is currently full: you can either:\n 1: select a new course\n2: Be added to the waiting list");
                    int select = new Scanner(System.in).nextInt();
                    switch (select) {
                        case 1:
                            BScComputerScience();
                            break;
                        case 2:
                            wl.addToMultiMediaWaitList();
                            break;
                        default:
                            System.out.println("Error! Please enter a valid choice");

                    }
                }
                break;
            case 3:
                if(c.getSeatsAvailable("Multi Media") < 100 || c.getSeatsAvailable("Computing") < 100) {
                    System.out.println(OptionalBScComputerScienceCourses.get(1) + " and " + OptionalBScComputerScienceCourses.get(2) + " have been added to your list of courses");
                    BscComputerScienceCourses.add(OptionalBScComputerScienceCourses.get(1));
                    BscComputerScienceCourses.add(OptionalBScComputerScienceCourses.get(2));
                }else{
                    System.out.println("Sorry 1 or more of the courses you have selected are full. ");
                    BComGeneral();
                }
                break;

            case 4:
                System.out.println("Please make sure you enter a valid option");
        }

    }

    public void enrollInBScComputerScience(){
        Student student = new Student();
        ArrayList<Student> BScComputerScienceStudents = new ArrayList<Student>();
        BScComputerScienceStudents.add(student);
    }

    public void BscScience() {

        BscScienceCourses.add(c.coursesList.get(1));
        BscScienceCourses.add(c.coursesList.get(2));
        BscScienceCourses.add(c.coursesList.get(3));

        System.out.println("The following courses are courses that are optional to take:\n" + BscScienceCourses);

        ArrayList<Course> OptionalBscScienceCourses = new ArrayList<>();
        OptionalBscScienceCourses.add(c.coursesList.get(13));
        OptionalBscScienceCourses.add(c.coursesList.get(14));

        System.out.println("The following courses are courses that are optional to take:\n" + OptionalBscScienceCourses);

        System.out.println("Please select the number of the corresponding optional course you would like to take:" +
                "(please not you must choose at least one optional course to take.)" +
                " \n" + "1: " + OptionalBscScienceCourses.get(1) + "\n2: " + OptionalBscScienceCourses.get(2) + "\n3: Both"
        );
        int choice = new Scanner(System.in).nextInt();
        switch (choice) {
            case 1:
                if(c.getSeatsAvailable("Bio Medical") < 100) {
                    System.out.println(OptionalBscScienceCourses.get(1) + "Have been added to your list of courses");
                    BscScienceCourses.add(OptionalBscScienceCourses.get(1));
                }else{
                    System.out.println("Sorry course is currently full: you can either:\n 1: select a new course\n2: Be added to the waiting list");
                    int select = new Scanner(System.in).nextInt();
                    switch (select) {
                        case 1:
                            BscScience();
                            break;
                        case 2:
                            wl.addToBioMedicalWaitList();
                            System.out.println("You hae been added to the Waiting list");
                            break;
                        default:
                            System.out.println("Error! Please enter a valid choice");

                    }
                }
                break;
            case 2:
                if(c.getSeatsAvailable("Environmental Science")< 100) {
                    System.out.println(OptionalBscScienceCourses.get(2) + "Have been added to your list of courses");
                    BscScienceCourses.add(OptionalBscScienceCourses.get(2));
                }else{
                    System.out.println("Sorry course is currently full: you can either:\n 1: select a new course\n2: Be added to the waiting list");
                    int select = new Scanner(System.in).nextInt();
                    switch (select) {
                        case 1:
                            BscScience();
                            break;
                        case 2:
                            wl.addToEnvironmentalScienceWaitList();
                            break;
                        default:
                            System.out.println("Error! Please enter a valid choice");

                    }
                }
                break;
            case 3:
                if(c.getSeatsAvailable("Bio Medical") < 100 || c.getSeatsAvailable("Environmental Science") < 100) {
                    System.out.println(OptionalBscScienceCourses.get(1) + " and " + OptionalBscScienceCourses.get(2) + " have been added to your list of courses");
                    BscScienceCourses.add(OptionalBscScienceCourses.get(1));
                    BscScienceCourses.add(OptionalBscScienceCourses.get(2));
                }else {
                    System.out.println("Sorry 1 or more of the courses you have selected are full");
                    BscScience();
                }
            default:
                System.out.println("Error!");
        }
    }

    public void enrollInBscScience(){
        Student student = new Student();
        ArrayList<Student> BscScienceStudents = new ArrayList<Student>();
        BscScienceStudents.add(student);

    }

    public void run(){
        System.out.println("Select witch degree program you wish to enroll for\n 1: Bcom General\n 2: Bsc Computer Science\n 3: Bsc Science\n");
        int choice = new Scanner(System.in).nextInt();
        switch (choice) {
            case 1:
                BComGeneral();
                enrollInBComGeneral();
                break;
            case 2:
                BScComputerScience();
                enrollInBScComputerScience();
                break;
            case 3:
                BscScience();
                enrollInBscScience();
                break;
            default:
                System.out.println("Error!");
                run();
        }
        System.out.println("You have been enrolled!");
    }






}
