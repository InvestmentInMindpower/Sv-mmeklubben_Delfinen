public class WorkoutSwimmer extends Member
{
    public WorkoutSwimmer(String swimmerType, String cpr, AgeGroup ageGroup, boolean membershipStatus, int subscriptionFee, int debt, int age) {
        super(swimmerType, cpr, ageGroup, membershipStatus, subscriptionFee, debt, age);
    }

    // constructor to create from database
    public WorkoutSwimmer(String swimmerType, String cpr, AgeGroup ageGroup, boolean membershipStatus, int subscriptionFee, int debt, int age, double crawlResultat, double brystsoevmningResultat,double butterflyResultat,double rygCrawlResultat) {
        super(swimmerType, cpr, ageGroup, membershipStatus, subscriptionFee, debt, age,crawlResultat,brystsoevmningResultat,butterflyResultat,rygCrawlResultat);
    }
}

