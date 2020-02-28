/**
 * The Lab class represent a lab that we can enroll students in the lab
 * It holes lab details and some of student informations
 * *
 *
 * @author Erfan
 * @version 1
 */
public class Lab {

    // field //

    // the enrolled students information
    private Student[] students = new Student[10];
    // the average of students grade
    private int avg;
    // the day of this lab
    private String day;
    // the capacity of this lab
    private int capacity;
    // the size of this lab
    private int currentSize;
    // the sum of students grade
    private int sum ;

    // constructor //

    /**
     * Create a new lab with a given capacity and the day of lab
     * *
     *
     * @param cap capacity of lab
     * @param d day of the lab
     */
    public Lab(int cap, String d) {
        day = d;
        capacity = cap;
    }

    // method //

    /**
     * @param std the object of the enrolled student
     */
    public void enrollStudent(Student std) {
        if (currentSize < capacity) {
            students[currentSize] = std;
            currentSize++;
        } else {
            System.out.println("Lab is full!!!");
        }
    }

    /**
     * print the enrolled students name and grade and the average of the grades to the output terminal
     */
    public void print() {
        for (int j = 0 ; j<currentSize ; j++)
        {
            System.out.print(students[j].firstName + " ");
            System.out.print(students[j].lastName + " : ");
            System.out.println(students[j].grade);
        }
        System.out.println("avarage : " + avg);
    }

    /**
     * get the students array
     *
     * @return students array field
     */
    public Student[] getStudents() {
        return students ;
    }

    /**
     * @param stdnts set the student in array
     */
    public void setStudents(Student[] stdnts) {
        students=stdnts ;
    }

    /**
     * get the average of grades
     *
     * @return average of grdaes
     */
    public int getAvg() {
       return avg ;
    }

    /**
     * calculate the average of the students grade
     */
    public void calculateAvg() {
        for(int i=0; i<currentSize ; i++)
        {
            sum+=students[i].grade;
        }
        avg=sum/currentSize;
    }

    /**
     * get the day of lab
     *
     * @return day field
     */
    public String getDay() {
        return day ;
    }

    /**
     * @param day set the lab day
     */
    public void setDay(String day) {
        this.day=day;
    }

    /**
     * get the capacity of the lab
     *
     * @return capacity field
     */
    public int getCapacity() {
        return  capacity ;
    }

    /**
     * @param capacity set the capacity of the lab
     */
    public void setCapacity(int capacity) {
        this.capacity=capacity;
    }
}

