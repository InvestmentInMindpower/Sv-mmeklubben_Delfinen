
public class Member implements MemberInterface
{
   //declaring variables

    private int memberID;

    private AgeGroup ageGroup;

    private boolean membershipStatus;


    public Member(int memberID, AgeGroup ageGroup, boolean membershipStatus)
    {
        this
        this.ageGroup = ageGroup;
        this.membershipStatus = membershipStatus;
    }

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
        return "AgeGroup: " + ageGroup + "\nMembershipStatus: " + membershipStatus;
    }
}
