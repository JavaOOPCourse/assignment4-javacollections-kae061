import service.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        StudentService studentService = new StudentService();
        AppointmentService appointmentService = new AppointmentService();
        IssueService issueService = new IssueService();
        ActionHistoryService actionService = new ActionHistoryService();

        studentService.initializeStudents();
        studentService.removeLowGPA();
        studentService.insertAtIndex();

        appointmentService.initializeAppointments();
        appointmentService.cancelLast();

        issueService.initializeIssues();
        issueService.resolveIssues();

        actionService.initializeActions();
        actionService.undoLastAction();
        actionService.addRequestedTranscript();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== 🎓 Smart University Service System =====");
            System.out.println("1. Show Students");
            System.out.println("2. Show Appointments");
            System.out.println("3. Show Emergency Issues");
            System.out.println("4. Show Action History");
            System.out.println("5. Add New Issue");
            System.out.println("6. Undo Action");
            System.out.println("7. Exit");
            System.out.print("Choose option: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    studentService.printStudents();
                    studentService.findHighestGPA();
                    break;

                case 2:
                    appointmentService.showFirstAndLast();
                    appointmentService.printAppointments();
                    break;

                case 3:
                    issueService.showMostUrgent();
                    issueService.printRemainingIssues();
                    break;

                case 4:
                    actionService.showFirstAndLast();
                    actionService.printHistory();
                    break;

                case 5:
                    System.out.print("Enter issue description: ");
                    String desc = scanner.nextLine();

                    System.out.print("Enter urgency level (1-5): ");
                    int urgency = scanner.nextInt();
                    scanner.nextLine();

                    issueService.addNewIssue(desc, urgency);
                    break;

                case 6:
                    actionService.undoLastAction();
                    break;

                case 7:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option");
            }

        } while (choice != 7);

        scanner.close();
    }
}
