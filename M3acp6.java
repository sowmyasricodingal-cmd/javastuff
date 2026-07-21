import java.util.ArrayList;

class MemberInfo {
    private String name;
    private int gradYear;
    private boolean hasGoodStanding;

    public MemberInfo(String name, int gradYear, boolean hasGoodStanding) {
        this.name = name;
        this.gradYear = gradYear;
        this.hasGoodStanding = hasGoodStanding;
    }

    public int getGradYear() {
        return gradYear;
    }

    public boolean inGoodStanding() {
        return hasGoodStanding;
    }

    public String toString() {
        return name + " (" + gradYear + ", " + hasGoodStanding + ")";
    }
}

class ClubMembers {
    private ArrayList<MemberInfo> memberList;

    public ClubMembers() {
        memberList = new ArrayList<MemberInfo>();
    }

    // Part (a)
    public void addMembers(String[] names, int gradYear) {
        for (String name : names) {
            memberList.add(new MemberInfo(name, gradYear, true));
        }
    }

    // Part (b)
    public ArrayList<MemberInfo> removeMembers(int year) {
        ArrayList<MemberInfo> graduated = new ArrayList<MemberInfo>();

        for (int i = memberList.size() - 1; i >= 0; i--) {
            MemberInfo member = memberList.get(i);

            if (member.getGradYear() <= year) {
                if (member.inGoodStanding()) {
                    graduated.add(member);
                }
                memberList.remove(i);
            }
        }

        return graduated;
    }

    public void printMembers() {
        for (MemberInfo member : memberList) {
            System.out.println(member);
        }
    }
}

public class M3acp6 {
    public static void main(String[] args) {

        ClubMembers club = new ClubMembers();

        // Part (a)
        String[] names = {"SMITH, JANE", "FOX, STEVE", "XIN, MICHAEL", "GARCIA, MARIA"};
        club.addMembers(names, 2018);

        System.out.println("Members after addMembers:");
        club.printMembers();

        // Remove members
        ArrayList<MemberInfo> removed = club.removeMembers(2018);

        System.out.println("\nRemaining Members:");
        club.printMembers();

        System.out.println("\nReturned Members:");
        for (MemberInfo m : removed) {
            System.out.println(m);
        }
    }
}
