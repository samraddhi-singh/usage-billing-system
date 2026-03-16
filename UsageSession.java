public class UsageSession {

    String userId;
    String resourceId;
    long startTime;
    long endTime;

    public UsageSession(String userId, String resourceId) {
        this.userId = userId;
        this.resourceId = resourceId;
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getDurationMinutes() {
        return (endTime - startTime) / (1000 * 60);
    }
}