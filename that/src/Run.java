/**
 * The Run class made for make objects
 * It get results and print them
 * *
 *
 * @author Erfan
 * @version 1
 */
public class Run {

    // The start of the program

    public static void main(String[] args) {
        // Create some Student object
        Student std1 = new Student("Ehsan", "Edalat", "9031066" );
        Student std2 = new Student("Seyed", "Ahmadpanah", "9031806" );
        Student std3 = new Student("Ahmad", "Asadi", "9031054" );

        // Set grade for the student and print the result
        std1.print();
        std1.setGrade(15);
        std1.print();

        // Set grade for the student and print the result
        std2.print();
        std2.setGrade(11);
        std2.print();

        // Change the student name and print the result
        std3.print();
        std3.setFirstName("HamidReza");
        std3.print();

        // Create an object from Lab class
        Lab one = new Lab(10, "Monday");

        // Enroll some students in "one" object
        one.enrollStudent(std1);
        one.enrollStudent(std2);
        one.enrollStudent(std3);

        // calling the calculateAvg method for calculating the average
        one.calculateAvg();

        // calling the print method for printing the lab information
        one.print();
    }
}
