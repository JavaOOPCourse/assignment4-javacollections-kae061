package service;

import model.Issue;
import java.util.PriorityQueue;
import java.util.Iterator;

public class IssueService {

    private PriorityQueue<Issue> issues = new PriorityQueue<>();

    public void initializeIssues() {
        issues.add(new Issue("Lost Student ID", 3));
        issues.add(new Issue("Scholarship Problem", 1));
        issues.add(new Issue("Exam Conflict", 2));
        issues.add(new Issue("Schedule Error", 4));
        issues.add(new Issue("Payment Issue", 2));
        System.out.println("Issues initialized");
    }

    public void showMostUrgent() {
        if (issues.isEmpty()) {
            System.out.println("No issues available.");
            return;}
        System.out.println("Most urgent issue:");
        System.out.println(issues.peek());
    }

    public void resolveIssues() {
        if (!issues.isEmpty()) {
            System.out.println("Resolved: " + issues.poll());}
        if (!issues.isEmpty()) {
            System.out.println("Resolved: " + issues.poll());}
    }

    public void printRemainingIssues() {
        System.out.println("\nRemaining Issues:");

        Iterator<Issue> iterator = issues.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void addNewIssue(String description, int urgency) {
        issues.add(new Issue(description, urgency));
        System.out.println("New issue added");
    }
}
