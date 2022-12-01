
public class Member implements MemberInterface
{
   //declaring variables

    String swimmerType;
    private String cpr;
    private AgeGroup ageGroup;
    private boolean membershipStatus;
    private int subscriptionFee;
    private int debt;
    private int age;

    private double crawlResultat;
    private double brystsoevmningResultat;
    private double butterflyResultat;
    private double rygCrawlResultat;

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
    public void setDebt(int fee) {debt = debt + fee;}

    public String toString()
    {
        return "CPR: " + cpr + "\nAgeGroup: " + ageGroup + "\nMembershipStatus: " + membershipStatus + "\nCrawlResultat: " + crawlResultat + "\nBrystResultat :" + brystsoevmningResultat + "\nButterflyResultat: " + butterflyResultat +"\nRygcrawlResultat: "+ rygCrawlResultat;
    }

    public String outputMembersToDatabase()
    {
        return cpr + "," + ageGroup + "," + membershipStatus + "," + subscriptionFee + "," + debt + "," + age;
    }


    public void setCrawlResultat(double crawlResultat)
    {
        this.crawlResultat = crawlResultat;
    }

    public double getBrystsoevmningResultat()
    {
        return brystsoevmningResultat;
    }

    public void setBrystsoevmningResultat(double brystsoevmningResultat)
    {
        this.brystsoevmningResultat = brystsoevmningResultat;
    }

    public double getButterflyResultat()
    {
        return butterflyResultat;
    }

    public void setButterflyResultat(double butterflyResultat)
    {
        this.butterflyResultat = butterflyResultat;
    }

    public double getRygCrawlResultat()
    {
        return rygCrawlResultat;
    }

    public void setRygCrawlResultat(double rygCrawlResultat)
    {
        this.rygCrawlResultat = rygCrawlResultat;
    }

    public double getCrawlResultat() {
        return crawlResultat;
    }
}
