import java.util.*;

public class Resource {

    String resourceId;
    int capacity;
    int currentUsers;

    int firstHourCost;
    int additionalHourCost;

    public Resource(String resourceId, int capacity, int firstHourCost, int additionalHourCost) {
        this.resourceId = resourceId;
        this.capacity = capacity;
        this.firstHourCost = firstHourCost;
        this.additionalHourCost = additionalHourCost;
        this.currentUsers = 0;
    }

    public boolean isAvailable() {
        return currentUsers < capacity;
    }

    public void startUsage() {
        currentUsers++;
    }

    public void stopUsage() {
        currentUsers--;
    }
}