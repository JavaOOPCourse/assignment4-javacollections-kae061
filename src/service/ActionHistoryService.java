package service;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ActionHistoryService {

    private ArrayDeque<String> actions = new ArrayDeque<>();

    public void initializeActions() {
        actions.add("Submitted Assignment");
        actions.add("Dropped Course");
        actions.add("Registered Course");
        actions.add("Updated Profile");
        System.out.println("Actions initialized");
    }

    public void undoLastAction() {
        if (!actions.isEmpty()) {
            System.out.println("Undo action: " + actions.removeLast());
        } else {
            System.out.println("No actions to undo.");
        }
    }

    public void addRequestedTranscript() {
        actions.add("Requested Transcript");
        System.out.println("Requested Transcript added ✅");
    }

    public void showFirstAndLast() {
        if (actions.isEmpty()) {
            System.out.println("No actions available.");
            return;
        }
        System.out.println("First action: " + actions.peekFirst());
        System.out.println("Last action: " + actions.peekLast());
    }

    public void printHistory() {

        System.out.println("\nAction History:");

        Iterator<String> iterator = actions.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
