import java.util.ArrayList;

public class CompetitiveSwimmer extends Member
{
    // creating variables
    private String trainer;

    public boolean getIsCrawl()
    {
        return isCrawl;
    }

    private boolean isCrawl;

    public boolean getIsBrystSvoemning()
    {
        return isBrystSvoemning;
    }

    private boolean isBrystSvoemning;

    public boolean getIsButterfly()
    {
        return isButterfly;
    }

    private boolean isButterfly;

    public boolean getIsRygcrawl()
    {
        return isRygcrawl;
    }

    private boolean isRygcrawl;
    double crawlResultat;
    double brystsoevmningResultat;
    double butterflyResultat;
    double rygCrawlResultat;

    public void setCrawl(boolean crawl)
{
    isCrawl = crawl;
}
    public void setBrystSvoemning(boolean brystSvoemning)
    {
        isBrystSvoemning = brystSvoemning;
    }
    public void setButterfly(boolean butterfly)
{
    isButterfly = butterfly;
}
    public void setRygcrawl(boolean rygcrawl)
    {
        isRygcrawl = rygcrawl;
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

    // creating constructors
    public CompetitiveSwimmer(String swimmerType, String cpr, AgeGroup ageGroup, boolean membershipStatus, int subscriptionFee, int debt, int age, String trainer)
    {
        super(swimmerType, cpr, ageGroup, membershipStatus, subscriptionFee, debt, age);
        this.trainer = trainer;
    }


    //constructor for when created from database
    public CompetitiveSwimmer(String swimmerType, String cpr, AgeGroup ageGroup, boolean membershipStatus, int subscriptionFee, int debt, int age, double crawlResultat, double brystsoevmningResultat, double butterflyResultat,double rygCrawlResultat, String trainer, boolean isCrawl, boolean isBrystSvoemning, boolean isButterfly, boolean isRygcrawl)
    {
        super(swimmerType, cpr, ageGroup, membershipStatus, subscriptionFee, debt, age);
        this.trainer = trainer;
        this.isCrawl = isCrawl;
        this.isBrystSvoemning = isBrystSvoemning;
        this.isButterfly = isButterfly;
        this.isRygcrawl = isRygcrawl;
        this.crawlResultat = crawlResultat;
        this.brystsoevmningResultat = brystsoevmningResultat;
        this.butterflyResultat = butterflyResultat;
        this.rygCrawlResultat = rygCrawlResultat;
    }

    public String outputMembersToDatabase()
    {
        return super.getSwimmerType() + "," + super.getCpr() + "," + super.getAgeGroup() + "," + super.getMembershipStatus() + "," + super.getSubscriptionFee() + "," + super.getDebt() + "," + super.getAge() + "," + getCrawlResultat() + "," + getBrystsoevmningResultat() + "," + getButterflyResultat() + "," + getRygCrawlResultat() + "," + trainer + "," + isCrawl + "," + isBrystSvoemning + "," + isButterfly + "," + isRygcrawl;
    }

    public String toString()
    {
        return "\nSvimmerType: " + super.getSwimmerType() + "\nCPR: " + super.getCpr() + "\nAgeGroup: " + super.getAgeGroup() + "\nMembershipStatus: " + super.getMembershipStatus() + "\nSubscriptionFee: " + super.getSubscriptionFee() + "\nDebt: " + super.getDebt() + "\nAge: " + getAge() + "\nCrawlResultat: " + crawlResultat + "\nBrystResultat :" + brystsoevmningResultat + "\nButterflyResultat: " + butterflyResultat +"\nRygcrawlResultat: "+ rygCrawlResultat;
    }

}
