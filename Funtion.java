import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Funtion {
    public static int menu() {
        System.out.println("--------------------------------");
        System.out.println("-1. Experience                  -");
        System.out.println("-2. Fresher                     -");
        System.out.println("-3. Intership                   -");
        System.out.println("-4. Searching                   -");
        System.out.println("-5. Exit                        -");
        System.out.println("---------------------------------");
        System.out.println("----Enter your choice:___________");
        System.out.println("*********************************");
        int choice = checkValidData.checkInputIntLimit(1, 5);
        return choice;
    }

    public static void createCandidate(ArrayList<Candidate> candidates,
            int type) {

        while (true) {
            System.out.print("Enter id: ");
            String id = checkValidData.checkInputString();
            System.out.print("Enter first name: ");
            String firstName = checkValidData.checkInputString();
            System.out.print("Enter last name: ");
            String lastName = checkValidData.checkInputString();
            System.out.print("Enter birth date: ");
            int birthDate = checkValidData.checkInputIntLimit(1900,
                    Calendar.getInstance().get(Calendar.YEAR));
            System.out.print("Enter address: ");
            String address = checkValidData.checkInputString();
            System.out.print("Enter phone: ");
            String phone = checkValidData.checkPhoneNumber();
            System.out.print("Enter email: ");
            String email = checkValidData.checkEmail();
            Candidate candidate = new Candidate(id, firstName, lastName,
                    birthDate, address, phone, email, type);
            // check id exist or not
            if (checkValidData.checkIdExist(candidates, id)) {
                switch (type) {
                    case 0:
                        createExperience(candidates, candidate);
                        break;
                    case 1:
                        createFresher(candidates, candidate);
                        break;
                    case 2:
                        createInternship(candidates, candidate);
                        break;
                }
            } else {
                return;
            }
            System.out.print("Do you want to continue (Y/N): ");

            if (!checkValidData.checkInputYN()) {
                return;
            }
        }
    }

    public static void createExperience(ArrayList<Candidate> candidates,
            Candidate candidate) {
        System.out.print("Enter year of experience: ");
        int yearExperience = checkValidData.checkYearOfExperience(candidate.getBirthDate());
        System.out.print("Enter professional skill: ");
        String professionalSkill = checkValidData.checkInputString();
        candidates.add(new Experience(yearExperience, professionalSkill,
                candidate.getId(), candidate.getFirstName(), candidate.getLastName(),
                candidate.getBirthDate(), candidate.getAddress(),
                candidate.getPhone(), candidate.getEmail(), candidate.getTypeOfCandidate()));
        System.err.println("Create success.");
    }

    public static void createFresher(ArrayList<Candidate> candidates,
            Candidate candidate) {
        System.out.print("Enter graduation date: ");
        String graduationDate = checkValidData.checkInputString();
        System.out.print("Enter graduation rank: ");
        String graduationRank = checkValidData.checkInputGraduationRank();
        candidates.add(new Fresher(graduationDate, graduationRank, candidate.getId(),
                candidate.getFirstName(), candidate.getLastName(),
                candidate.getBirthDate(), candidate.getAddress(),
                candidate.getPhone(), candidate.getEmail(),
                candidate.getTypeOfCandidate()));
        System.err.println("Create success.");
    }

    public static void createInternship(ArrayList<Candidate> candidates,
            Candidate candidate) {
        System.out.print("Enter major: ");
        String major = checkValidData.checkInputString();
        System.out.print("Enter semester: ");
        String semester = checkValidData.checkInputString();
        System.out.print("Enter university: ");
        String university = checkValidData.checkInputString();
        candidates.add(new Intern(major, semester, university, candidate.getId(),
                candidate.getFirstName(), candidate.getLastName(),
                candidate.getBirthDate(), candidate.getAddress(),
                candidate.getPhone(), candidate.getEmail(),
                candidate.getTypeOfCandidate()));
        System.err.println("Create success.");
    }

    public static void searchCandidate(ArrayList<Candidate> candidates) {
        printListNameCandidate(candidates);
        System.out.print("Enter andidate name (First name or Last name): ");
        String nameSearch = checkValidData.checkInputString();
        System.out.print("Enter type of candidate: ");
        int typeCandidate = checkValidData.checkInputIntLimit(0, 2);
        for (Candidate candidate : candidates) {
            if (candidate.getTypeOfCandidate() == typeCandidate
                    && candidate.getFirstName().contains(nameSearch)
                    || candidate.getLastName().contains(nameSearch)) {
                System.out.println(candidate.toString());
            }
        }
    }

    public static void printListNameCandidate(ArrayList<Candidate> candidates) {
        System.err.println("Experience Candidate");
        for (Candidate candidate : candidates) {
            if (candidate instanceof Experience) {
                System.out.println(candidate.getFirstName() + " "
                        + candidate.getLastName());
            }
        }
        System.err.println("Fresher Candidate");
        for (Candidate candidate : candidates) {
            if (candidate instanceof Fresher) {
                System.out.println(candidate.getFirstName() + " "
                        + candidate.getLastName());
            }
        }
        System.err.println("Internship Candidate");
        for (Candidate candidate : candidates) {
            if (candidate instanceof Intern) {
                System.out.println(candidate.getFirstName() + " "
                        + candidate.getLastName());
            }
        }
    }

}