package service;

import java.util.LinkedList;
import java.util.Iterator;

public class AppointmentService {

    private LinkedList<String> appointments = new LinkedList<>();

    public void initializeAppointments() {
        appointments.add("Consultation: Math");
        appointments.add("Consultation: Physics");
        appointments.add("Consultation: Programming");

        appointments.addFirst("URGENT Consultation");
        System.out.println("Appointments initialized");
    }

    public void cancelLast() {
        if (!appointments.isEmpty()) {
            System.out.println("Cancelled: " + appointments.remove());
        } else {
            System.out.println("No appointments to cancel.");
        }
    }

    public void showFirstAndLast() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments available.");
            return;
        }
        System.out.println("First appointment: " + appointments.getFirst());
        System.out.println("Last appointment: " + appointments.getLast());
    }

    public void printAppointments() {
        System.out.println("\nAppointments List:");

        Iterator<String> iterator = appointments.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
