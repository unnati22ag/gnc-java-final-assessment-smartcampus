// Student class
// Developed by Unnati Agrawal

public class UaStudent {

    int uaStudentId;
    String uaName;
    String uaEmail;

     public UaStudent(int uaStudentId, String uaName, String uaEmail) {
        this.uaStudentId = uaStudentId;
        this.uaName = uaName;
        this.uaEmail = uaEmail;
    }

    void displayStudent() {
        System.out.println("ID: " + uaStudentId +
                " Name: " + uaName +
                " Email: " + uaEmail);
    }
}