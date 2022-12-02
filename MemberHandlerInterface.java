import java.time.LocalDate;

public interface MemberHandlerInterface
{

    public int findAge(LocalDate dob);
    public Member findMember();

    public void PrintAllMemberInformation();

    public void chargeMembers();


}
