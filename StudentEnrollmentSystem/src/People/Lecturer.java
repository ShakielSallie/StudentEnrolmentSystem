package People;

import AcademicRecord.AcademicRecord;

import java.util.Scanner;

public class Lecturer {

    private String name;
    private String department;
    Student student = new Student();
    AcademicRecord ac = new AcademicRecord();

    public Lecturer() {
    }

    public Lecturer(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void addMarks(){
        System.out.println("Enter the name of the student who you would like to add Marks to: ");
        String StudentName = new Scanner(System.in).nextLine();
        student.getName();
        if (!student.studentAndStudentNumber.containsKey(StudentName)){
            System.out.println("Student does not exist\nTry again");
            addMarks();
        }else{

        }

    }

    public void removeMarks(){
        System.out.println("Enter the name of the student who you would like to remove Marks from: ");
        String StudentName = new Scanner(System.in).nextLine();
        student.getName();
        if (!student.studentAndStudentNumber.containsKey(StudentName)){
            System.out.println("Student does not exist\nTry again");
            removeMarks();
        }else{

        }
        System.out.println("Enter the name of the course that you would like to remove marks from:");
        System.out.println(student.academicRecord);
        String course = new Scanner(System.in).nextLine();
        if (!student.academicRecord.contains(course)){
            System.out.println("This course does not exi");
        }
    }

    public void displayMarks(){

    }

    public void run(){
        System.out.println("Enter name");
        String name = new Scanner(System.in).nextLine();
        setName(name);
        System.out.println("Enter department\n1: Business\n2: Science\n3: IT");
        int choice = new Scanner(System.in).nextInt();
        switch (choice){
            case 1:
                setDepartment("Business");
                break;
            case 2:
                setDepartment("Science");
                break;
            case 3:
                setDepartment("IT");
                break;
            default:
                System.out.println("Error");
                run();
                break;
        }
        System.out.println("Would you like to: \n1: add marks\n2: remove marks\n3: display marks");
        int choice2 = new Scanner(System.in).nextInt();
        switch (choice2){
            case 1:
                addMarks();
                break;
            case 2:
                removeMarks();
                break;
            case 3:
                displayMarks();
                break;
            default:
                System.out.println("Error");
                run();
                break;
        }
    }
}
