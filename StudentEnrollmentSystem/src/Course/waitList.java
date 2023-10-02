package Course;

import People.Student;

import java.util.ArrayList;

public class waitList {

    ArrayList<String> biologyWaitList = new ArrayList<String>();
    ArrayList<Student> chemwaitList = new ArrayList<Student>();
    ArrayList<Student> physicsWaitList = new ArrayList<Student>();
    ArrayList<Student> compSciWaitList = new ArrayList<Student>();
    ArrayList<Student> softDevWaitList = new ArrayList<Student>();
    ArrayList<Student> ITWaitList = new ArrayList<Student>();
    ArrayList<Student> busMangeWaitList = new ArrayList<Student>();
    ArrayList<Student> econWaitList = new ArrayList<Student>();
    ArrayList<Student> markWaitList = new ArrayList<Student>();
    ArrayList<Student> mathWaitList = new ArrayList<Student>();
    ArrayList<Student> busLangWaitList = new ArrayList<Student>();
    ArrayList<Student> compWaitList = new ArrayList<Student>();
    ArrayList<Student> bioMedWaitList = new ArrayList<Student>();
    ArrayList<Student> enviroWaitList = new ArrayList<Student>();
    ArrayList<Student> multiMediaWaitList = new ArrayList<>();

    Course course = new Course();

    private String positionInList;
    ArrayList<String> BComGeneralWaitList = new ArrayList<>();
    ArrayList<String> BscComputerScienceWaitList = new ArrayList<>();
    ArrayList<String> BscScienceWaitList = new ArrayList<>();
    Student student = new Student();

    public waitList() {
    }

    public waitList(String positionInList) {
        this.positionInList = positionInList;
    }

    public String getPositionInList() {
        return positionInList;
    }

    public void setPositionInList(String positionInList) {
        this.positionInList = positionInList;
    }

    public void addToBComGeneralWaitList(){
        BComGeneralWaitList.add(student.getName());
        System.out.println("added To BComGeneral WaitList");
    }
    public void addToBscComputerScienceWaitList(){
        BscComputerScienceWaitList.add(student.getName());
        System.out.println("added To BscComputerScience WaitList");
    }

    public void addToBscScienceWaitList(){
        BscScienceWaitList.add(student.getName());
        System.out.println("added To BscScience WaitList");
    }

    public void removeFromWaitList(){

    }

    public void addToBiologyWaitList(){
        if(course.getSeatsAvailable(course.getTitle())<=0){
            biologyWaitList.add(student.getName());
            System.out.println("added to biology WaitList");
        }
    }

    public void addToChemistryWaitList(){
        if(course.getSeatsAvailable(course.getTitle())<=0){
            chemwaitList.add(student);
            System.out.println("Added to chemistry WaitList");

        }
    }

    public void addToPhysicsWaitList(){
        if(course.getSeatsAvailable(course.getTitle())<=0){
            physicsWaitList.add(student);
            System.out.println("Added to physics WaitList");

        }
    }

    public void addToComputerScienceWaitList(){
        if(course.getSeatsAvailable(course.getTitle())<=0){
            compSciWaitList.add(student);
            System.out.println("Added to Computer Science WaitList");

        }
    }

    public void addToSoftwareDevelopmentWaitList(){
        if(course.getSeatsAvailable(course.getTitle())<=0){
            softDevWaitList.add(student);
            System.out.println("Added to Software Development WaitList");

        }
    }

    public void addToITWaitList(){
        if(course.getSeatsAvailable(course.getTitle())<=0){
            ITWaitList.add(student);
            System.out.println("Added to IT WaitList");

        }
    }

    public void addToBusinessManagementWaitList(){
        if(course.getSeatsAvailable(course.getTitle())<=0){
            busMangeWaitList.add(student);
            System.out.println("Added to Business Management WaitList");

        }
    }

    public void addToEconomicsWaitList(){
        if(course.getSeatsAvailable(course.getTitle())<=0){
            econWaitList.add(student);
            System.out.println("Economics WaitList");

        }
    }

    public void addToMarketingWaitList(){
        if(course.getSeatsAvailable(course.getTitle())<=0){
            markWaitList.add(student);
            System.out.println("Added to Marketing WaitList");

        }
    }

    public void addToMathsWaitList(){
        if(course.getSeatsAvailable(course.getTitle())<=0){
            mathWaitList.add(student);
            System.out.println("Added to Mathematics WaitList");

        }
    }

    public void addToBusinessLanguageWaitList(){
        if(course.getSeatsAvailable(course.getTitle())<=0){
            busLangWaitList.add(student);
            System.out.println("Added to Business Language WaitList");

        }
    }

    public void addToComputingWaitList(){
        if(course.getSeatsAvailable(course.getTitle())<=0){
            compWaitList.add(student);
            System.out.println("Added to Computing WaitList");

        }
    }

    public void addToBioMedicalWaitList(){
        if(course.getSeatsAvailable(course.getTitle())<=0){
            bioMedWaitList.add(student);
            System.out.println("Added to Bio Medical WaitList");

        }
    }

    public void addToEnvironmentalScienceWaitList(){
        if(course.getSeatsAvailable(course.getTitle())<=0){
            enviroWaitList.add(student);
            System.out.println("Added to Environmental Science WaitList");

        }
    }

    public void addToMultiMediaWaitList(){
        if(course.getSeatsAvailable(course.getTitle())<=0){
            multiMediaWaitList.add(student);
            System.out.println("Added to Multi Media WaitList");

        }
    }
}
