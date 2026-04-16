// This class represents a course in the UA Smart Campus System
// Developed by Unnati Agrawal

//crete a class 

public class UaCourse {

    int uaCourseId;
    String uaCourseName;
    double uaFee;

    // Constructor -
     public UaCourse(int uaCourseId, String uaCourseName, double uaFee) {
        this.uaCourseId = uaCourseId;
        this.uaCourseName = uaCourseName;
        this.uaFee = uaFee;
    }

    // Display method
    void displayCourse() {
        System.out.println("CourseID: " + uaCourseId +
                " Name: " + uaCourseName +
                " Fee: " + uaFee);
    }
}