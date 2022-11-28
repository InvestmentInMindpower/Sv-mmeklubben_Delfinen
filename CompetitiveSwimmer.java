import java.util.ArrayList;

public class CompetitiveSwimmer extends Member
{
    private String trainer;

    //creating variables
    ArrayList<SvoemmeDisciplin> svoemmeDisciplinList = new ArrayList<>();

    public CompetitiveSwimmer(String cpr, AgeGroup ageGroup, boolean membershipStatus, String trainer) {
        super(cpr, ageGroup, membershipStatus);
        this.trainer = trainer;
    }

}
