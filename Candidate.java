public class Candidate {

    protected String firstName;
    protected String lastName;
    protected String address;
    protected String email;
    protected String phone;
    protected String id;
    protected int typeOfCandidate;
    protected int birthDate;

    public Candidate() {

    }

    public Candidate(String id, String firstName, String lastName, int birthDate, String address, String phone,
            String email, int typeOfCandidate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.typeOfCandidate = typeOfCandidate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return String return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return String return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return String return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return String return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return String return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return int return the typeOfCandidate
     */
    public int getTypeOfCandidate() {
        return typeOfCandidate;
    }

    /**
     * @param typeOfCandidate the typeOfCandidate to set
     */
    public void setTypeOfCandidate(int typeOfCandidate) {
        this.typeOfCandidate = typeOfCandidate;
    }

    /**
     * @return int return the birthDate
     */
    public int getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return this.firstName + this.lastName + "   |   " + this.birthDate + "    |    " + this.address + "    |    "
                + this.phone + "    |    " + this.email + "    |    " + this.typeOfCandidate;
    }

}