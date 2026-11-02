import java.io.*;
import java.util.*;

// ------------ MAIN CLASS ------------
public class JavaFx {

    private static final String FILE_NAME = "members.txt";
    private static ArrayList<Member> members = new ArrayList<>();

    public static void main(String[] args) {
        loadMembers();
        Scanner sc = new Scanner(System.in);
        cliMode(sc);
    }

    // ------------ CLI MENU ------------
    public static void cliMode(Scanner sc) {
        while (true) {
            System.out.println("\n=== Club Membership Portal ===");
            System.out.println("1. View Members");
            System.out.println("2. Verify Access");
            System.out.println("3. Extend Membership");
            System.out.println("4. Add Member");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    if (members.isEmpty()) {
                        System.out.println("No members found.");
                    } else {
                        members.forEach(System.out::println);
                    }
                    break;

                case 2:
                    System.out.print("Enter Member ID: ");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.println(AccessLogic.verifyAccess(id, members));
                    break;

                case 3:
                    System.out.print("Enter Member ID: ");
                    int mid = Integer.parseInt(sc.nextLine());
                    System.out.print("Enter extra days: ");
                    int days = Integer.parseInt(sc.nextLine());

                    boolean found = false;
                    for (Member m : members) {
                        if (m.getId() == mid) {
                            m.extendMembership(days);
                            System.out.println("Membership extended!");
                            found = true;
                        }
                    }
                    if (!found) System.out.println("Member not found!");
                    saveMembers();
                    break;

                case 4:
                    addMember(sc);
                    saveMembers();
                    break;

                case 5:
                    saveMembers();
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    // ------------ ADD MEMBER ------------
    public static void addMember(Scanner sc) {
        System.out.print("Enter ID: ");
        int id = Integer.parseInt(sc.nextLine());

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Tier (Gold/Silver/Bronze): ");
        String tier = sc.nextLine().toLowerCase();

        System.out.print("Enter Days Left: ");
        int days = Integer.parseInt(sc.nextLine());

        Member m;
        switch (tier) {
            case "gold":
                m = new GoldMember(id, name, days);
                break;
            case "silver":
                m = new SilverMember(id, name, days);
                break;
            default:
                m = new BronzeMember(id, name, days);
        }

        members.add(m);
        System.out.println("Member added successfully!");
    }

    // ------------ FILE I/O ------------
    public static void loadMembers() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] p = line.split(",");
                int id = Integer.parseInt(p[0]);
                String name = p[1];
                String tier = p[2];
                int daysLeft = Integer.parseInt(p[3]);

                Member m;
                switch (tier.toLowerCase()) {
                    case "gold":
                        m = new GoldMember(id, name, daysLeft);
                        break;
                    case "silver":
                        m = new SilverMember(id, name, daysLeft);
                        break;
                    default:
                        m = new BronzeMember(id, name, daysLeft);
                }
                members.add(m);
            }
        } catch (IOException e) {
            System.out.println("No file found. Starting fresh.");
        }
    }

    public static void saveMembers() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(FILE_NAME))) {
            for (Member m : members) {
                pw.println(m.toFileFormat());
            }
        } catch (IOException e) {
            System.out.println("Error saving file.");
        }
    }
}

// ------------ ABSTRACT MEMBER CLASS ------------
abstract class Member {
    protected int id;
    protected String name;
    protected int daysLeft;

    public Member(int id, String name, int daysLeft) {
        this.id = id;
        this.name = name;
        this.daysLeft = daysLeft;
    }

    public int getId() {
        return id;
    }

    public void extendMembership(int days) {
        daysLeft += days;
    }

    public boolean isActive() {
        return daysLeft > 0;
    }

    public abstract String getTier();

    public String toFileFormat() {
        return id + "," + name + "," + getTier() + "," + daysLeft;
    }

    public String toString() {
        return id + " | " + name + " | " + getTier() + " | Days Left: " + daysLeft;
    }
}

// ------------ MEMBER TYPES ------------
class GoldMember extends Member {
    public GoldMember(int id, String name, int daysLeft) {
        super(id, name, daysLeft);
    }

    public String getTier() {
        return "Gold";
    }
}

class SilverMember extends Member {
    public SilverMember(int id, String name, int daysLeft) {
        super(id, name, daysLeft);
    }

    public String getTier() {
        return "Silver";
    }
}

class BronzeMember extends Member {
    public BronzeMember(int id, String name, int daysLeft) {
        super(id, name, daysLeft);
    }

    public String getTier() {
        return "Bronze";
    }
}

// ------------ ACCESS LOGIC ------------
class AccessLogic {
    public static String verifyAccess(int id, ArrayList<Member> members) {
        for (Member m : members) {
            if (m.getId() == id) {
                if (m.isActive())
                    return "Access Granted (" + m.getTier() + ")";
                else
                    return "Membership Expired!";
            }
        }
        return "Member Not Found!";
    }
}