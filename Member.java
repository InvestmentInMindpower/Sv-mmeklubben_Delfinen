
public abstract class Member implements MemberInterface
{
   //declaring variables

    private String cpr;
    private AgeGroup ageGroup;
    private boolean membershipStatus;
    private int subscriptionFee;
    private int debt;
    private int age;





    //creating constructors
    public Member(String cpr, AgeGroup ageGroup, boolean membershipStatus, int subscriptionFee, int debt, int age)
    {
        this.cpr = cpr;
        this.ageGroup = ageGroup;
        this.membershipStatus = membershipStatus;
        this.subscriptionFee = subscriptionFee;
        this.debt = debt;
        this.age = age;
    }

    //creating methods

    public String getCpr()
    {
        return cpr;
    }

    public boolean isMembershipStatus()
    {
        return membershipStatus;
    }

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

    public void setDebt(int fee) {debt = debt + fee;}

    public String toString()
    {
        return "CPR: " + cpr + "\nAgeGroup: " + ageGroup + "\nMembershipStatus: " + membershipStatus;
    }
}
