
public abstract class Member implements MemberInterface
{
   //declaring variables

    private String cpr;
    private AgeGroup ageGroup;
    private boolean membershipStatus;



    public String getCpr()
    {
        return cpr;
    }

    public boolean isMembershipStatus()
    {
        return membershipStatus;
    }

    //creating constructors
    public Member(String cpr, AgeGroup ageGroup, boolean membershipStatus)
    {
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
        return "CPR: " + cpr + "\nAgeGroup: " + ageGroup + "\nMembershipStatus: " + membershipStatus;
    }
}
