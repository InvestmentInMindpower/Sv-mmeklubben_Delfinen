import java.time.LocalDate;
import java.util.ArrayList;

public interface MemberHandlerInterface
{
    ArrayList<Member> memberList = null;
    UserData userData = null;
    ArrayList<StaevneResultat> staevneResultatList = null;
    public void updateSwimDisciplineRygcrawl();
    public void updateSwimDisciplineButterflySvoemning();
    public void updateSwimDisciplineBrystSvoemning();
    public void updateSwimDisciplineCrawl();
    public void getBestSwimmerData();
    public int calculateSubscriptionFee(AgeGroup ageGroup, String cpr, boolean active);
    public void UpdateMemberShipStatus();
    public void UpdateMemberAgeGroup();
    public void UpdateMemberType();
    public LocalDate convertCprToLocalDate(String cpr);
    public int castCPRToAge(String cpr);
    public void CreateMember();
    public int findAge(LocalDate dob);
    public Member findMember();

    public void PrintMemberInformation();

    public void chargeMembers();

    public void payDebt();

    public void removeMember();

    public void printResidualMembers();

    public void addToMemberList(Member member);


}
