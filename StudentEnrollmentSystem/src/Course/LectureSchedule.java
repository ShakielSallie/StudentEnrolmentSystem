package Course;

import java.time.DayOfWeek;
import java.time.temporal.ChronoField;
import java.time.LocalTime;
import java.util.Date;
import java.util.Random;

public class LectureSchedule {
    String course;
    private String instructor;
    Date StartDate = new Date(2023 - 1900, 2, 1);
    Date endDate = new Date(2023 - 1900, 10 - 1, 1);
    Random random = new Random();
    int hour = random.nextInt(8) + 8;
    int minute = 0;
    LocalTime randomTime = LocalTime.of(hour, minute);

    public LectureSchedule() {
    }

    public void biologyLectureSchedule() {
        hour = random.nextInt(8) + 8;
        minute = 0;
        randomTime = LocalTime.of(hour, minute);
        while (randomTime.get(ChronoField.DAY_OF_WEEK) != DayOfWeek.SATURDAY.getValue() || randomTime.get(ChronoField.DAY_OF_WEEK) != DayOfWeek.SUNDAY.getValue()) {
            LocalTime randomTime = LocalTime.of(hour, minute);
        }
        System.out.println("Your Lecture Schedule for Biology is:\n");
        System.out.println(randomTime);

    }

    public void chemLectureSchedule() {
        hour = random.nextInt(8) + 8;
        minute = 0;
        randomTime = LocalTime.of(hour, minute);
        while (randomTime.get(ChronoField.DAY_OF_WEEK) != DayOfWeek.SATURDAY.getValue() || randomTime.get(ChronoField.DAY_OF_WEEK) != DayOfWeek.SUNDAY.getValue()) {
            LocalTime randomTime = LocalTime.of(hour, minute);
        }
        System.out.println("Your Lecture Schedule for Chemistry is:\n");
        System.out.println(randomTime);

    }

    public void physicsLectureSchedule() {
        hour = random.nextInt(8) + 8;
        minute = 0;
        randomTime = LocalTime.of(hour, minute);
        while (randomTime.get(ChronoField.DAY_OF_WEEK) != DayOfWeek.SATURDAY.getValue() || randomTime.get(ChronoField.DAY_OF_WEEK) != DayOfWeek.SUNDAY.getValue()) {
            LocalTime randomTime = LocalTime.of(hour, minute);
        }
        System.out.println("Your Lecture Schedule for Physics is:\n");
        System.out.println(randomTime);

    }

    public void compSciLectureSchedule() {
        hour = random.nextInt(8) + 8;
        minute = 0;
        randomTime = LocalTime.of(hour, minute);
        while (randomTime.get(ChronoField.DAY_OF_WEEK) != DayOfWeek.SATURDAY.getValue() || randomTime.get(ChronoField.DAY_OF_WEEK) != DayOfWeek.SUNDAY.getValue()) {
            LocalTime randomTime = LocalTime.of(hour, minute);
        }
        System.out.println("Your Lecture Schedule for Computer Science is:\n");
        System.out.println(randomTime);

    }

    public void softDevLectureSchedule() {
        hour = random.nextInt(8) + 8;
        minute = 0;
        randomTime = LocalTime.of(hour, minute);
        while (randomTime.get(ChronoField.DAY_OF_WEEK) != DayOfWeek.SATURDAY.getValue() || randomTime.get(ChronoField.DAY_OF_WEEK) != DayOfWeek.SUNDAY.getValue()) {
            LocalTime randomTime = LocalTime.of(hour, minute);
        }
        System.out.println("Your Lecture Schedule for Software Development is:\n");
        System.out.println(randomTime);

    }

    public void ITLectureSchedule() {
        hour = random.nextInt(8) + 8;
        minute = 0;
        randomTime = LocalTime.of(hour, minute);
        while (randomTime.get(ChronoField.DAY_OF_WEEK) != DayOfWeek.SATURDAY.getValue() || randomTime.get(ChronoField.DAY_OF_WEEK) != DayOfWeek.SUNDAY.getValue()) {
            LocalTime randomTime = LocalTime.of(hour, minute);
        }
        System.out.println("Your Lecture Schedule for IT is:\n");
        System.out.println(randomTime);

    }

    public void busManLectureSchedule() {
        hour = random.nextInt(8) + 8;
        minute = 0;
        randomTime = LocalTime.of(hour, minute);
        while (randomTime.get(ChronoField.DAY_OF_WEEK) != DayOfWeek.SATURDAY.getValue() || randomTime.get(ChronoField.DAY_OF_WEEK) != DayOfWeek.SUNDAY.getValue()) {
            LocalTime randomTime = LocalTime.of(hour, minute);
        }
        System.out.println("Your Lecture Schedule for Business Management is:\n");
        System.out.println(randomTime);

    }

    public void ecoLectureSchedule() {
        hour = random.nextInt(8) + 8;
        minute = 0;
        randomTime = LocalTime.of(hour, minute);
        while (randomTime.get(ChronoField.DAY_OF_WEEK) != DayOfWeek.SATURDAY.getValue() || randomTime.get(ChronoField.DAY_OF_WEEK) != DayOfWeek.SUNDAY.getValue()) {
            LocalTime randomTime = LocalTime.of(hour, minute);
        }
        System.out.println("Your Lecture Schedule for Economics is:\n");
        System.out.println(randomTime);

    }

    public void marketingLectureSchedule() {
        hour = random.nextInt(8) + 8;
        minute = 0;
        randomTime = LocalTime.of(hour, minute);
        while (randomTime.get(ChronoField.DAY_OF_WEEK) != DayOfWeek.SATURDAY.getValue() || randomTime.get(ChronoField.DAY_OF_WEEK) != DayOfWeek.SUNDAY.getValue()) {
            LocalTime randomTime = LocalTime.of(hour, minute);
        }
        System.out.println("Your Lecture Schedule for Marketing is:\n");
        System.out.println(randomTime);

    }

    public void mathLectureSchedule() {
        hour = random.nextInt(8) + 8;
        minute = 0;
        randomTime = LocalTime.of(hour, minute);
        while (randomTime.get(ChronoField.DAY_OF_WEEK) != DayOfWeek.SATURDAY.getValue() || randomTime.get(ChronoField.DAY_OF_WEEK) != DayOfWeek.SUNDAY.getValue()) {
            LocalTime randomTime = LocalTime.of(hour, minute);
        }
        System.out.println("Your Lecture Schedule for Mathematics is:\n");
        System.out.println(randomTime);

    }

    public void busLangLectureSchedule() {
        hour = random.nextInt(8) + 8;
        minute = 0;
        randomTime = LocalTime.of(hour, minute);
        while (randomTime.get(ChronoField.DAY_OF_WEEK) != DayOfWeek.SATURDAY.getValue() || randomTime.get(ChronoField.DAY_OF_WEEK) != DayOfWeek.SUNDAY.getValue()) {
            LocalTime randomTime = LocalTime.of(hour, minute);
        }
        System.out.println("Your Lecture Schedule for Business Language is:\n");
        System.out.println(randomTime);

    }

    public void compLectureSchedule() {
        hour = random.nextInt(8) + 8;
        minute = 0;
        randomTime = LocalTime.of(hour, minute);
        while (randomTime.get(ChronoField.DAY_OF_WEEK) != DayOfWeek.SATURDAY.getValue() || randomTime.get(ChronoField.DAY_OF_WEEK) != DayOfWeek.SUNDAY.getValue()) {
            LocalTime randomTime = LocalTime.of(hour, minute);
        }
        System.out.println("Your Lecture Schedule for Computing is:\n");
        System.out.println(randomTime);

    }

    public void bioMedLectureSchedule() {
        hour = random.nextInt(8) + 8;
        minute = 0;
        randomTime = LocalTime.of(hour, minute);
        while (randomTime.get(ChronoField.DAY_OF_WEEK) != DayOfWeek.SATURDAY.getValue() || randomTime.get(ChronoField.DAY_OF_WEEK) != DayOfWeek.SUNDAY.getValue()) {
            LocalTime randomTime = LocalTime.of(hour, minute);
        }
        System.out.println("Your Lecture Schedule for Bio Medical is:\n");
        System.out.println(randomTime);

    }

    public void enviroLectureSchedule() {
        hour = random.nextInt(8) + 8;
        minute = 0;
        randomTime = LocalTime.of(hour, minute);
        while (randomTime.get(ChronoField.DAY_OF_WEEK) != DayOfWeek.SATURDAY.getValue() || randomTime.get(ChronoField.DAY_OF_WEEK) != DayOfWeek.SUNDAY.getValue()) {
            LocalTime randomTime = LocalTime.of(hour, minute);
        }
        System.out.println("Your Lecture Schedule for Environmental Science is:\n");
        System.out.println(randomTime);

    }

    public void multiMedLectureSchedule() {
        hour = random.nextInt(8) + 8;
        minute = 0;
        randomTime = LocalTime.of(hour, minute);
        while (randomTime.get(ChronoField.DAY_OF_WEEK) != DayOfWeek.SATURDAY.getValue() || randomTime.get(ChronoField.DAY_OF_WEEK) != DayOfWeek.SUNDAY.getValue()) {
            LocalTime randomTime = LocalTime.of(hour, minute);
        }
        System.out.println("Your Lecture Schedule for Multi Media is:\n");
        System.out.println(randomTime);

    }

    public void run() {
        DegreeProgram dp = new DegreeProgram();
        if (dp.getProgramTitle() == "BcomGeneral") {
            System.out.println("Here is the Lecture Schedule for the Bcom degree program:\n Please take note of when your elective courses are:  \n");
            busManLectureSchedule();
            ecoLectureSchedule();
            marketingLectureSchedule();
            mathLectureSchedule();
            busLangLectureSchedule();

        } else if (dp.getProgramTitle() == "BscComputer Science") {
            System.out.println("Here is the Lecture Schedule for the BscComputer Science degree program:\n Please take note of when your elective courses are:  \n ");
            compSciLectureSchedule();
            softDevLectureSchedule();
            ITLectureSchedule();
            compLectureSchedule();
            multiMedLectureSchedule();
        } else if (dp.getProgramTitle() == "BscScience") {
            biologyLectureSchedule();
            chemLectureSchedule();
            physicsLectureSchedule();
            bioMedLectureSchedule();
            enviroLectureSchedule();
        }
    }
}





