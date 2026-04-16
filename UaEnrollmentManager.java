
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;

 public class UaEnrollmentManager {
    // ArrayLists instead of HashMap
    ArrayList<UaStudent> uaStudents = new ArrayList<>();
    ArrayList<UaCourse> uaCourses = new ArrayList<>();
    // Store enrollments as simple text (easy version)
    ArrayList<String> uaEnrollments = new ArrayList<>();
    // ADD STUDENT
    public void addUaStudent(UaStudent s) {
        uaStudents.add(s);
        System.out.println("Student added successfully");
    }
    // ADD COURSE
     public void addUaCourse(UaCourse c) throws UaCustomException {
        if (c.uaFee < 0) {
            throw new UaCustomException("Fee cannot be negative!");
        }
        uaCourses.add(c);
        System.out.println("Course added successfully");
    }
    // FIND STUDENT
    UaStudent findStudent(int id) {
        for (UaStudent s : uaStudents) {
            if (s.uaStudentId == id) return s;
        }
        return null;
    }
    // FIND COURSE
    UaCourse findCourse(int id) {
        for (UaCourse c : uaCourses) {
            if (c.uaCourseId == id) return c;
        }
        return null;
    }
    // ENROLL STUDENT
    public void enrollUaStudent(int sid, int cid) {
        UaStudent s = findStudent(sid);
        UaCourse c = findCourse(cid);
        if (s == null || c == null) {
            System.out.println("Invalid Student or Course ID");
            return;
        }
        uaEnrollments.add("Student " + sid + " enrolled in Course " + cid);
        System.out.println("Enrollment successful");
    }
    // VIEW STUDENTS
    public void viewUaStudents() {
        for (UaStudent s : uaStudents) {
            s.displayStudent();
        }
    }
    // VIEW COURSES
    public void viewUaCourses() {
        for (UaCourse c : uaCourses) {
            c.displayCourse();
        }
    }
    // VIEW ENROLLMENTS
    public void viewUaEnrollments() {
        for (String e : uaEnrollments) {
            System.out.println(e);
        }
    }
//  BONUS question done by UA: Save Data to File
    public void saveData() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("ua_enrollments.txt"))) {
            writer.println("--- SmartCampus Enrollment Records ---");
            for (String e : uaEnrollments) {
                writer.println(e);
            }
            System.out.println("Data successfully saved to ua_enrollments.txt");
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }
}