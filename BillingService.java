import java.util.*;

public class BillingService {

    Map<String, Resource> resources = new HashMap<>();
    Map<String, UsageSession> activeSessions = new HashMap<>();


    public void addResource(String id, int capacity, int firstHourCost, int additionalHourCost) {
        resources.put(id, new Resource(id, capacity, firstHourCost, additionalHourCost));
    }


    public void startUsage(String userId, String resourceId) {

        Resource r = resources.get(resourceId);

        if (r == null) {
            System.out.println("Resource not found");
            return;
        }

        if (!r.isAvailable()) {
            System.out.println("Resource full!");
            return;
        }

        UsageSession session = new UsageSession(userId, resourceId);

        activeSessions.put(userId, session);

        r.startUsage();

        System.out.println("Usage started for user " + userId);
    }


    public void stopUsage(String userId) {

        UsageSession session = activeSessions.get(userId);

        if (session == null) {
            System.out.println("No active session");
            return;
        }

        session.stop();

        Resource r = resources.get(session.resourceId);

        r.stopUsage();

        long minutes = session.getDurationMinutes();

        int hours = (int) Math.ceil(minutes / 60.0);

        int bill = r.firstHourCost;

        if (hours > 1) {
            bill += (hours - 1) * r.additionalHourCost;
        }

        System.out.println("Usage duration: " + minutes + " minutes");
        System.out.println("Total Bill: ₹" + bill);

        activeSessions.remove(userId);
    }
}