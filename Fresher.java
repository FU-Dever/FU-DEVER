import java.util.*;

public class Fresher extends Candidate {
    ArrayList<String> FresherList = new ArrayList<String>();
    private String graduatedTime;
    private String rankOfGraduation;

    public Fresher() {
    }

    public Fresher(String graduatedTime, String rankOfGraduation, String id, String firstName,
            String lastName, int birthDate, String address, String phone,
            String email, int typeOfCandidate) {
        super(id, firstName, lastName, birthDate, address, phone, email, typeOfCandidate);
        this.graduatedTime = graduatedTime;
        this.rankOfGraduation = rankOfGraduation;

    }

    /**
     * @return String return the graduatedTime
     */
    public String getGraduatedTime() {
        return graduatedTime;
    }

    /**
     * @param graduatedTime the graduatedTime to set
     */
    public void setGraduatedTime(String graduatedTime) {
        this.graduatedTime = graduatedTime;
    }

    /**
     * @return String return the rankOfGraduation
     */
    public String getRankOfGraduation() {
        return rankOfGraduation;
    }

    /**
     * @param rankOfGraduation the rankOfGraduation to set
     */
    public void setRankOfGraduation(String rankOfGraduation) {
        this.rankOfGraduation = rankOfGraduation;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}