import java.util.*;

public class Intern extends Candidate {
    ArrayList<String> InternList = new ArrayList<String>();

    private String majors;
    private String semesters;
    private String universityName;

    public Intern() {

    }

    public Intern(String majors, String semesters, String universityName, String id, String firstName, String lastName,
            int birthDate, String address, String phone,
            String email, int typeOfCandidate) {
        super(id, firstName, lastName, birthDate, address, phone, email, typeOfCandidate);
        this.majors = majors;
        this.semesters = semesters;
        this.universityName = universityName;
    }

    /**
     * @return String return the majors
     */
    public String getMajors() {
        return majors;
    }

    /**
     * @param majors the majors to set
     */
    public void setMajors(String majors) {
        this.majors = majors;
    }

    /**
     * @return int return the semesters
     */
    public String getSemesters() {
        return semesters;
    }

    /**
     * @param semesters the semesters to set
     */
    public void setSemesters(String semesters) {
        this.semesters = semesters;
    }

    /**
     * @return String return the universityName
     */
    public String getUniversityName() {
        return universityName;
    }

    /**
     * @param universityName the universityName to set
     */
    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

}