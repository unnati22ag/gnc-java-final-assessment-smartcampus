import java.util.*;

public class UaMain {

    public static void main(String[] args) {

        Scanner uaInput = new Scanner(System.in);
        UaEnrollmentManager uaManager = new UaEnrollmentManager();

        while (true) {

            System.out.println("\nUA SMART CAMPUS MENU ");
            System.out.println("1. Add Student");
            System.out.println("2. Add Course");
            System.out.println("3. Enroll Student");
            System.out.println("4. View Students");
            System.out.println("5. View Courses");
            System.out.println("6. View Enrollments");
            System.out.println("7. Process Enrollment (Thread)");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            int uaChoice = uaInput.nextInt();

            switch (uaChoice) {

                // CASE 1: ADD STUDENT
                case 1:

                    System.out.print("Enter Student ID: ");
                    int uaStudentId = uaInput.nextInt();

                    uaInput.nextLine(); 

                    System.out.print("Enter Name: ");
                    String uaName = uaInput.nextLine(); 

                    System.out.print("Enter Email: ");
                    String uaEmail = uaInput.nextLine(); 

                    UaStudent uaStudent = new uaStudent(uaStudentId, uaName, uaEmail);

                    uaManager.addUaStudent(uaStudent);

                    break;

                // CASE 2: ADD COURSE
                case 2:

                    try {
                        System.out.print("Enter Course ID: ");
                        int uaCourseId = uaInput.nextInt();

                        uaInput.nextLine();

                        System.out.print("Enter Course Name: ");
                        String uaCourseName = uaInput.nextLine(); 

                        System.out.print("Enter Fee: ");
                        double uaFee = uaInput.nextDouble();

                        UaCourse uaCourse = new uaCourse (uaCourseId, uaCourseName, uaFee);

                        uaManager.addUaCourse(uaCourse);

                    } catch (UaCustomException e) {
                        System.out.println("Error: " + e.getMessage());
                    }

                    break;

                // CASE 3: ENROLL STUDENT
                case 3:

                    System.out.print("Enter Student ID: ");
                    int uaStuId = uaInput.nextInt();

                    System.out.print("Enter Course ID: ");
                    int uaCourseId = uaInput.nextInt();

                    uaManager.enrollUaStudent(uaStuId, uaCourseId);

                    break;

                // CASE 4: VIEW STUDENTS
                case 4:
                    uaManager.viewUaStudents();
                    break;

                // CASE 5: VIEW COURSES
                case 5:
                    uaManager.viewUaCourses();
                    break;

                // CASE 6: VIEW ENROLLMENTS
                case 6:
                    uaManager.viewUaEnrollments();
                    break;

                // CASE 7: THREAD
                case 7:
                    UaEnrollmentProcessor uaThread = new UaEnrollmentProcessor();
                    uaThread.start();
                    break;

                // CASE 8: EXIT
                case 8:
                    System.out.println("Exiting system...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}