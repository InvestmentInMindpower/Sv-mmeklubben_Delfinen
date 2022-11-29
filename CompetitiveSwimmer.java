import java.util.ArrayList;

public class CompetitiveSwimmer extends Member
{
    private String trainer;

    //creating variables
    ArrayList<SvoemmeDisciplin> svoemmeDisciplinList = new ArrayList<>();

    public CompetitiveSwimmer(String cpr, AgeGroup ageGroup, boolean membershipStatus, int subscriptionFee, int debt, int age, String trainer) {
        super(cpr, ageGroup, membershipStatus, subscriptionFee, debt, age);
        this.trainer = trainer;
    }

}
