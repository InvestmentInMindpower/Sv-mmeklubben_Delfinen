
public class Member implements MemberInterface
{
   //declaring variables
    private int memberID;
    private int cpr;
    private AgeGroup ageGroup;
    private boolean membershipStatus;

    //creating constructors
    public Member(int memberID, int cpr, AgeGroup ageGroup, boolean membershipStatus)
    {
        this.memberID = memberID;
        this.cpr = cpr;
        this.ageGroup = ageGroup;
        this.membershipStatus = membershipStatus;
    }

    //creating methods
    public void setAgeGroup(AgeGroup ageGroup)
    {
        this.ageGroup = ageGroup;
    }
    public AgeGroup getAgeGroup()
    {
        return ageGroup;
    }
    public void setMembershipStatus(boolean membershipStatus)
    {
        this.membershipStatus = membershipStatus;
    }
    public boolean getMembershipStatus()
    {
        return membershipStatus;
    }

    public String toString()
    {
        return "Member ID: " + memberID + "\nCPR: " + cpr + "\nAgeGroup: " + ageGroup + "\nMembershipStatus: " + membershipStatus;
    }
}
