import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

public class checkValidData {
    private static Scanner in = new Scanner(System.in);
    private static final String pattern = "^\\d{10}\\d*$";
    private static final String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@"
            + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$";

    // check for Date Of Birth, phone, email, year of experience, rank of
    // graduation.
    // o BirthDate : is number with length is 4 character(1900..Current Year)
    // o Phone: is number with minimum 10 characters
    // o Email: with format <account name>@<domain>. (eg: annguyen@fpt.edu.vn)
    // o Year of Experience : is number from 0 to 100
    // o Rank of Graduation: with one of4 values (Excellence, Good, Fair, Poor)
    // ------------------------------------------------------------------------------------------------
    // - From “Main Screen”, use select one item (1,2,3) to create candidate. After
    // each candidate is created, the system shows message: Do you want to continue
    // (Y/N)?. User chooses Y to continues, if you chooses N,
    // the program returns main screen and display all candidates who are created.
    checkValidData() {

    }

    public static int checkInputIntLimit(int min, int max) {

        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();

                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in rage [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }

    public static String checkInputString() {

        while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }

    public static boolean checkInputYN() {

        while (true) {
            String result = checkInputString();

            if (result.equalsIgnoreCase("Y")) {
                return true;
            }

            if (result.equalsIgnoreCase("N")) {
                return false;
            }
            System.err.println("Please input y/Y or n/N.");
            System.out.print("Enter again: ");
        }
    }

    public static void checkDateOfBirth() {
        Scanner in = new Scanner(System.in);
        System.out.println("Typer your date of birth");
        String date = in.next();

        if (checkDateOfBirth(date) == true) {
            System.out.println("Date valid");
        } else {
            System.out.println("Date invalid");
        }
    }

    public static boolean checkDateOfBirth(String date) {
        boolean status = false;
        if (checkDateOfBirth(date)) {
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
            dateFormat.setLenient(false);
            try {
                dateFormat.parse(date);
                status = true;
            } catch (Exception e) {
                status = false;
            }
        }
        return status;
    }

    public static boolean checkDate(String date) {
        String pattern = "(0?[1-9]|[12][0-9]|3[01])\\/(0?[1-9]|1[0-2])\\/([0-9]{4})";
        boolean flag = false;
        if (date.matches(pattern)) {
            flag = true;
        }
        return flag;
    }

    public static String checkPhoneNumber() {
        while (true) {
            String phonenum = checkInputString();
            if (phonenum.matches(pattern)) {
                return phonenum;
            } else {
                System.out.println("Wrong input!!");
                System.out.println("Enter again:");
            }
        }
    }

    public static String checkEmail() {
        while (true) {
            String result = checkInputString();

            if (result.matches(emailRegex))
                return result;
            else {
                System.out.println("Wrong input!!");
                System.out.println("Enter again:");
            }

        }
    }

    public static int checkYearOfExperience(int birthDate) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int age = currentYear - birthDate;
        int year = checkInputIntLimit(0, 100);
        if (year > age) {
            System.out.println("Experience larger than age !!!");
        } else
            System.out.println("Exeperience valid");
        return year;
    }

    public static String checkInputGraduationRank() {
        while (true) {
            String result = checkInputString();
            if (result.equalsIgnoreCase("Excellence")
                    || result.equalsIgnoreCase("Good")
                    || result.equalsIgnoreCase("Fair")
                    || result.equalsIgnoreCase("Poor")) {
                return result;
            } else {
                System.err.println("Please input string: Excellence, Good, Fair, Poor");
                System.out.println("Enter again: ");
            }
        }
    }

    public static boolean checkIdExist(ArrayList<Candidate> candidates, String id) {
        for (Candidate candidate : candidates) {
            if (candidate.getId().equalsIgnoreCase(id)) {
                System.err.println("Id exist.");
                return false;
            }
        }
        return true;
    }

}
