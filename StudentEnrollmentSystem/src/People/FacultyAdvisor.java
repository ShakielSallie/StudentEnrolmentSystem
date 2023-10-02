package People;

import run.Main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FacultyAdvisor {

    private String advisorID;
    private String advisorName;
    private String advisorPassword;
    private String advisorContactDetails;
    Map<String, String> advisors = new HashMap<>();

    public FacultyAdvisor() {
    }


    public FacultyAdvisor(String advisorID, String advisorName, String advisorPassword, String advisorContactDetails) {
        this.advisorID = advisorID;
        this.advisorName = advisorName;
        this.advisorContactDetails = advisorContactDetails;
        this.advisorPassword = advisorPassword;
    }

    public String getAdvisorID() {
        return advisorID;
    }

    public String getAdvisorPassword() {
        return advisorPassword;
    }

    public void setAdvisorPassword(String advisorPassword) {
        this.advisorPassword = advisorPassword;
    }

    public void setAdvisorID(String advisorID) {
        this.advisorID = advisorID;
    }

    public String getAdvisorName() {
        return advisorName;
    }

    public void setAdvisorName(String advisorName) {
        this.advisorName = advisorName;
    }

    public String getAdvisorContactDetails() {
        return advisorContactDetails;
    }

    public void setAdvisorContactDetails(String advisorContactDetails) {
        this.advisorContactDetails = advisorContactDetails;
    }

    public void addAdvisors(){

        System.out.println("Enter your name: ");
        String AdvisorName = new Scanner(System.in).nextLine();
        setAdvisorName(AdvisorName);
        System.out.println("Enter your password: ");
        String AdvisorPassword = new Scanner(System.in).nextLine();
        setAdvisorPassword(AdvisorPassword);
        System.out.println("Enter your Advisor ID");
        String AdvisorID = new Scanner(System.in).nextLine();
        setAdvisorID(AdvisorID);
        System.out.println("Enter your email address ");
        String AdvisorEmail = new Scanner(System.in).nextLine();
        setAdvisorContactDetails(AdvisorEmail);

        advisors.put(AdvisorName, AdvisorEmail);
        System.out.println("New advisor added");



    }

    public void AdvisorLogin(){

        System.out.println("Enter your name: ");
        String AdvisorName = new Scanner(System.in).nextLine();
        if(!advisors.containsValue(AdvisorName)){
            System.out.println("Advisor not found");
            AdvisorLogin();
        }else {
            System.out.println("Enter your password");
            String AdvisorPassword = new Scanner(System.in).nextLine();
            if(advisors.get(AdvisorName).equals(AdvisorPassword)){
                System.out.println("Login successful");
                advisors.put(AdvisorName, AdvisorPassword);
                Main m = new Main();
                m.run();
            }else {
                System.out.println("Login failed");
                AdvisorLogin();
            }
        }
    }

    public void printOutAdvisor(){
        System.out.println("Here is a list of our student advisors and their email addresses");
        System.out.println(advisors);
    }

    public void run(){
        System.out.println("Would you like to:\n1: Log into an existing Faculty Advisor account\n2: create a new Faculty Advisor account");
        int choice = new Scanner(System.in).nextInt();
        switch(choice){
            case 1:
                AdvisorLogin();
                break;
            case 2:
                addAdvisors();
                break;
        }


    }
}
