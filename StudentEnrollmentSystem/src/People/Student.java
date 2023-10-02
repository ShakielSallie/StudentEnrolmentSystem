package People;

import Course.Course;
import Course.DegreeProgram;
import Course.PlanOfStudy;
import Course.LectureSchedule;


import java.util.*;

public class Student {

    private String name;
    private String email;
    private int studentNumber;
    private String password;

    ArrayList<String> academicRecord = new ArrayList<String>();
    private String username;
    Map<String, String> studentLoginDetails = new HashMap<String, String>();
    Map<String, Integer> studentAndStudentNumber = new HashMap<String, Integer>();




    public Student() {
    }


    public Student(String name, String email, int studentNumber) {
        this.name = name;
        this.email = email;
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getStudentNumber() {
        return studentNumber;
    }



    public void enrolInDegreeProgram(){
        DegreeProgram dp = new DegreeProgram();
        Course course = new Course();

        System.out.println(
                "Please select the degree program you would like to enroll in:" +
                "\n1: Bcom General\n2: Bsc Computer Science\n3: Bsc Science\n  "
        );

        int choice = new Scanner(System.in).nextInt();
        switch(choice){
            case 1:

                dp.BComGeneral();
                dp.enrollInBComGeneral();
                break;
            case 2:
                dp.BScComputerScience();
                dp.enrollInBScComputerScience();
                break;
            case 3:
                dp.BscScience();
                dp.enrollInBscScience();
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }


    }

    public void dropCourse(){

    }

    public void viewAcademicRecord(){

    }

    public void viewWaitListStatus(){

    }

    public void updatePlanOfStudy(){

    }

    public void requestFacultyAdvisor(){

    }

    public void Login(){
        System.out.println("Please enter your name: ");
        name = new Scanner(System.in).nextLine();
        setName(name);
        System.out.println("Enter your username");
        String username2 = new Scanner(System.in).nextLine();
        while (!username2.equals(username)){
            System.out.println("Error! wrong username");
        }
            System.out.println("Enter your password");
            String password2 = new Scanner(System.in).nextLine();
            while (!password2.equals(password)){
                System.out.println("Error! wrong password");
            }
                System.out.println("Login successful");

        }
    public void createStudentAccount(){
        System.out.println("please enter your full name: ");
        name = new Scanner(System.in).nextLine();
        setName(name);
        System.out.println("Enter a Username");
        username = new Scanner(System.in).nextLine();
        System.out.println("Enter a password");
        password = new Scanner(System.in).nextLine();
        System.out.println("Re-Enter password");
        String password2 = new Scanner(System.in).nextLine();
        if(password.equals(password2)){
            studentLoginDetails.put(username, password);
        }else if (!password.equals(password2)){
            System.out.println("Passwords do not match");
            createStudentAccount();
        }
        System.out.println("Enter email address");
        email = new Scanner(System.in).nextLine();
        email.toLowerCase();
        setEmail(email);
        Random random = new Random();
        studentNumber = random.nextInt();
        System.out.println("your student number is " + studentNumber);


        studentAndStudentNumber.put(name,studentNumber);


    }


    public void run(){

        System.out.println("1: Create a new student account\n2: Login to an already existing student account");
        int option = new Scanner(System.in).nextInt();
        switch (option) {
            case 1:
                createStudentAccount();
                DegreeProgram dp = new DegreeProgram();
                dp.run();
                break;
            case 2:
                Login();
                break;
            default:
                System.out.println("Error! Please enter a valid option");
        }

        System.out.println("Selected an option:\n1: Plan of Study\n2: view Lecture Schedule\n3: Message a Faculty Advisor");
        int choice = new Scanner(System.in).nextInt();
        switch(choice){
            case 1:
                PlanOfStudy pos = new PlanOfStudy();
                pos.run();
               break;
            case 2:
                LectureSchedule ls = new LectureSchedule();
                ls.run();

                break;
            case 3:
                FacultyAdvisor fa = new FacultyAdvisor();
                fa.printOutAdvisor();

        }
    }


}


