/**
 * The Student class represents a student in a student administration system. *
 * It holds the student details relevant in our context. *
 * *
 *
 * @author Erfan *
 * @version 1
 */
public class Student {

    // fields //

    // the student’s first name
    String firstName;
    // the student’s last name
    String lastName;
    // the student ID
    String id;
    //the grade
    int grade;

    // constructor //

    /**
     * Create a new student with a given name and ID number. *
     * *
     *
     * @param fName first name of student *
     * @param lname last name of student *
     * @param sID   student ID
     */
    public Student(String fName, String lname, String sID) {
        firstName = fName;
        lastName = lname;
        id = sID;
        grade = 0;
    }

    // method //

    /**
     * get the first name of student *
     *
     * @return firstName field
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param fName set first name of a student
     */
    public void setFirstName(String fName) {
        firstName = fName;
    }

    /**
     * get the student grade *
     *
     * @return grade field
     */
    public int getGrade() {
        return grade;
    }

    /**
     * @param grd set the student grade
     */
    public void setGrade(int grd) {
        grade = grd;
    }

    /**
     * Print the student’s last name and ID number to the output terminal.
     */
    public void print() {
        System.out.println(firstName + ", student ID: " + id + ", grade: " + grade);
    }
}










