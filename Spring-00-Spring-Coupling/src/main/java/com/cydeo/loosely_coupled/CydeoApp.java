package com.cydeo.loosely_coupled;

public class CydeoApp {
    public static void main(String[] args) {

        FullTimeMentor fullTime = new FullTimeMentor();
        PartTimeMentor partTime = new PartTimeMentor();

        MentorAccount mentor = new MentorAccount(fullTime);
        MentorAccount mentor1 = new MentorAccount(partTime);

        mentor.manageAccount();
        mentor1.manageAccount();

    }
}
