public class Student extends Person{
    private double grade;

    public double getGrade() {
        return this.grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public Student(String firstName, String lastName, String cnp) {
        super(firstName, lastName, cnp);
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
        sbInfo.append(this.grade);
        return sbInfo.toString();
    }

}
