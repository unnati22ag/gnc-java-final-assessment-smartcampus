// This class demonstrates multithreading done by Unnati Agrawal

// create a class that extends Thread to simulate enrollment processing

public class UaEnrollmentProcessor extends Thread {

    public void run () {
        try {
            System.out.println("Processing enrollment...");

            // Simulate delay (like real system processing)
            Thread.sleep(2000);

            System.out.println("Enrollment completed!");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
