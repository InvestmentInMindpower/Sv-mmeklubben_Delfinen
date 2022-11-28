
public class Member implements MemberInterface
{
   private AgeGroup ageGroup;

   private boolean membershipStatus;


   public Member(AgeGroup ageGroup, boolean membershipStatus)
   {
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
