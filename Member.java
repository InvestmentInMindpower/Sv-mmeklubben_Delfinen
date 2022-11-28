
public class Member implements MemberInterface
{
   //declaring variables
    private int memberID;
    private AgeGroup ageGroup;
    private boolean membershipStatus;

    //creating constructors
    public Member(int memberID, AgeGroup ageGroup, boolean membershipStatus)
    {
        this.memberID = memberID;
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
    public boolean getMembershipStatus()
    {
        return membershipStatus;
    }
    public void setMembershipStatus(boolean membershipStatus)
    {
        this.membershipStatus = membershipStatus;
    }

    public String toString()
    {
        return "Member ID: " + memberID + "AgeGroup: " + ageGroup + "\nMembershipStatus: " + membershipStatus;
    }
}
