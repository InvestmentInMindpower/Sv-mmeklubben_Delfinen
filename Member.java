
public abstract class Member {
   //declaring variables



    private String swimmerType;
    private String cpr;
    private AgeGroup ageGroup;
    private boolean membershipStatus;
    private int subscriptionFee;
    private int debt;
    private int age;



    //creating constructors
    public Member(String swimmerType, String cpr, AgeGroup ageGroup, boolean membershipStatus, int subscriptionFee, int debt, int age)
    {

        this.swimmerType = swimmerType;
        this.cpr = cpr;
        this.ageGroup = ageGroup;
        this.membershipStatus = membershipStatus;
        this.subscriptionFee = subscriptionFee;
        this.debt = debt;
        this.age = age;

    }
    // constructor used to created from database

    //creating methods

    public String getCpr()
    {
        return cpr;
    }

    public void setCpr(String cpr) { this.cpr = cpr;}

    public void setSwimmerType(String swimmerType) {this.swimmerType = swimmerType;}

    public boolean isMembershipStatus()
    {
        return membershipStatus;
    }

    public String getSwimmerType() {return swimmerType;}

    public void setAgeGroup(AgeGroup ageGroup)
    {
        this.ageGroup = ageGroup;
    }
    public AgeGroup getAgeGroup()
    {
        return ageGroup;
    }

    public int getAge() {return age;}
    public void setMembershipStatus(boolean membershipStatus)
    {
        this.membershipStatus = membershipStatus;
    }
    public boolean getMembershipStatus()
    {
        return membershipStatus;
    }





    public int getSubscriptionFee() {return subscriptionFee;}
    public int getDebt()
    {
        return debt;
    }
    public void setDebt(int fee) {debt = fee;}
    public void addDebt(int fee) {debt = debt + fee;}

    public String toString()
    {
        return "\nSwimmerType: " + swimmerType + "\nCPR: " + cpr + "\nAgeGroup: " + ageGroup + "\nMembershipStatus: " + membershipStatus + "\nSubscriptionFee: " + subscriptionFee + "\nDebt: " + debt + "\nAge: " + getAge();
    }

    public String residualsString()
    {
        return "\nCPR: " + cpr + "\nDebt: " + debt + "\nSubscriptionFee " + subscriptionFee;
    }

    public String outputMembersToDatabase()
    {
        return swimmerType + "," + cpr + "," + ageGroup + "," + membershipStatus + "," + subscriptionFee + "," + debt + "," + age;
    }

}
