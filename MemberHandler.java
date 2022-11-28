import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.time.*;
import java.util.*;
public class MemberHandler
{
    ArrayList<Member> memberList = new ArrayList<>();
//TODO: make it so this is dependant on the number of members in memberList on startup



    public void CreateMember()
    {
        OutputHandler.printTextBoxStart();
        System.out.println("Select either Workout Swimmer [1] or competitive swimmer [2]");
        int selection = selectMembershipType();
        OutputHandler.printTextBoxEnd();
        if(selection == 1)
        {
            OutputHandler.printTextBoxStart();
            String cpr = InputHandler.inputCPR();
            OutputHandler.printTextBoxEnd();
            AgeGroup ageGroup = findAgeGroup(cpr);
            boolean active = InputHandler.fromInputToBool();
            WorkoutSwimmer workoutSwimmer = new WorkoutSwimmer(cpr, ageGroup, active);
            addToMemberList(workoutSwimmer);
        }
        else if(selection == 2)
        {
            OutputHandler.printTextBoxStart();
            String cpr = InputHandler.inputCPR();
            OutputHandler.printTextBoxEnd();
            AgeGroup ageGroup = findAgeGroup(cpr);
            boolean active = InputHandler.fromInputToBool();
            String trainer = InputHandler.inputString();
            CompetitiveSwimmer competitiveSwimmer = new CompetitiveSwimmer(cpr, ageGroup, active, trainer);
            addToMemberList(competitiveSwimmer);
        }

    }

    public AgeGroup findAgeGroup(String cpr)
    {
        AgeGroup group;
        LocalDate dob = convertCprToLocalDate(cpr);
        int age = findAge(dob);
        System.out.println("You are: " + age);
        if(age >= 18)
        {
            group = AgeGroup.Senior;
        }
        else
        {
            group = AgeGroup.Junior;
        }
        System.out.println("You are: " + group);
        return group;
    }

    public int findAge(LocalDate dob)
    {
        int age = (int) ChronoUnit.YEARS.between(dob, LocalDate.now());
        return age;
    }

    public LocalDate convertCprToLocalDate(String cpr)
    {
        //splits cpr into day month year format by accessing the index from and to where they appear
        int day =  Integer.parseInt(cpr.substring(0, 2));
        int month = Integer.parseInt(cpr.substring(2, 4));
        int year = Integer.parseInt(cpr.substring(4, 8));
        System.out.println("day: " + day);
        System.out.println("month: " + month);
        System.out.println("year: " + year);
        //Assembles date format of the cpr YYYY-MM-DD
        LocalDate dob = LocalDate.of(year, month, day);
        return dob;
    }

    public Member findMember(int cpr)
    {
        //TODO: go through array and find member with CPR number, then return
        return null;
    }

    public int selectMembershipType()
    {
        int memberShipChoice = InputHandler.inputMenuChoice();
        return memberShipChoice;
    }


    public void addToMemberList(Member member)
    {
        memberList.add(member);
        System.out.println(member.toString());
    }


}
