
import java.util.*;

public class Main {

    public static void main(String[] args) {

        BillingService service = new BillingService();

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n1 Add Resource");
            System.out.println("2 Start Usage");
            System.out.println("3 Stop Usage");
            System.out.println("4 Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter resourceId capacity firstHourCost additionalHourCost");

                    String id = sc.next();
                    int cap = sc.nextInt();
                    int f = sc.nextInt();
                    int a = sc.nextInt();

                    service.addResource(id, cap, f, a);

                    System.out.println("Resource added");

                    break;

                case 2:

                    System.out.println("Enter userId resourceId");

                    service.startUsage(sc.next(), sc.next());

                    break;

                case 3:

                    System.out.println("Enter userId");

                    service.stopUsage(sc.next());

                    break;

                case 4:
                    return;
            }
        }
    }
}