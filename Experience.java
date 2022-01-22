public class Experience extends Candidate {
    private int yearExperience;
    private String professionalSkill;

    public Experience() {
        super();
    }

    public Experience(int yearExperience, String professionalSkill, String id, String firstName, String lastName,
            int birthDate, String address, String phone,
            String email, int typeOfCandidate) {
        super(id, firstName, lastName, birthDate, address, phone, email, typeOfCandidate);
        this.yearExperience = yearExperience;
        this.professionalSkill = professionalSkill;
    }

    /**
     * @return int return the yearExperience
     */
    public int getExperienceYear() {
        return yearExperience;
    }

    /**
     * @param yearExperience the yearExperience to set
     */
    public void setExperienceYear(int yearExperience) {
        this.yearExperience = yearExperience;
    }

    /**
     * @return String return the graduationRank
     */
    public String getProfessionSkill() {
        return professionalSkill;
    }

    /**
     * @param graduationRank the graduationRank to set
     */
    public void setProfessionSkill(String graduationRank) {
        this.professionalSkill = professionalSkill;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}