public class Profesor extends Person {
    private int employmentYear;

    public double getGrade() {
        return this.employmentYear;
    }

    public void setGrade(Integer employmentYear) {
        this.employmentYear = employmentYear;
    }

    public Profesor(String firstName, String lastName, String cnp, int employmentYear) {
        super(firstName, lastName, cnp);
        this.employmentYear = employmentYear;
    }

    public String toString() {
        StringBuilder sbFullName = new StringBuilder();
        sbFullName.append(this.firstName);
        sbFullName.append(" ");
        sbFullName.append(this.lastName);
        return sbFullName.toString();
    }

    public String getInfo() {
        StringBuilder sbInfo = new StringBuilder(this.toString());
        sbInfo.append(": ");
        sbInfo.append(this.employmentYear);
        return sbInfo.toString();
    }

}

