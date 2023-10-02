package Course;

import java.util.ArrayList;

public class Course {

    private String courseID;
    private String title;

    ArrayList<Course> coursesList;
    private int seatsAvailable;
    private String lecturer;





    public Course(String courseID, String title, int seatsAvailable, String lecturer) {
        this.courseID = courseID;
        this.title = title;
        this.seatsAvailable = seatsAvailable;
        this.lecturer = lecturer;
    }

    public Course() {
        coursesList = new ArrayList<Course>(0);
        CoursesList();
    }

    public String getCourseID() {
        return courseID;
    }
    public void CoursesList(){


        Course Biology = new Course("Bio123", "Biology",100,"Mrs Watson");
        coursesList.add(Biology); //1
        Course Chemistry = new Course("Chem123", "Chemistry",100,"Mr Flemming");
        coursesList.add(Chemistry);//2
        Course Physics = new Course("Phys123", "Physics",100,"Mrs Webb");
        coursesList.add(Physics);//3
        Course ComputerScience = new Course("CompSci123", "Computer Science",100,"Mr Smith");
        coursesList.add(ComputerScience);//4
        Course SoftwareDevelopment = new Course("SD123", "Software Development",100,"Mr Campbell");
        coursesList.add(SoftwareDevelopment);//5
        Course IT = new Course("IT123", "IT",100,"Mrs Sallie");
        coursesList.add(IT);//6
        Course BusinessManagement = new Course("BM123", "Business Management",100,"Mrs Lewis");
        coursesList.add(BusinessManagement);//7
        Course Economics = new Course("Econ123", "Economics",100,"Mr Lewis");
        coursesList.add(Economics);//8
        Course Marketing = new Course("Mark123", "Marketing",100,"Mrs Green");
        coursesList.add(Marketing);//9
        Course Mathematics = new Course("Math123", "Mathematics",100,"Mr de Kock");
        coursesList.add(Mathematics);//10
        Course BusinessLanguage = new Course("BL123", "Business Language", 100, "Mrs Parker");
        coursesList.add(BusinessLanguage);//11
        Course Computing = new Course("Comp123", "Computing", 100, "Mr Khumalo");
        coursesList.add(Computing);//12
        Course BioMedicalScience = new Course("BMS123", "BioMedical", 100, "Mrs Wright");
        coursesList.add(BioMedicalScience);//13
        Course EnvironmentalScience = new Course("ES123", "Environmental Science", 100, "Mrs Davids");
        coursesList.add(EnvironmentalScience);//14
        Course MultiMedia = new Course("MM123", "MultiMedia",100, "Mr Power");
        coursesList.add(MultiMedia);//15

    }

    @Override
    public String toString() {

        return ("Course: " + title + " Course ID: " + courseID + " Seats available: " + seatsAvailable + " Lecturer: " + lecturer + "\n");
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public <courses> int getSeatsAvailable(String courseName) {
        return seatsAvailable;
    }


}
