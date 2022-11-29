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
            int fee = calculateSubscriptionFee(ageGroup, cpr, active);
            int debt = 0;
            int age = castCPRToAge(cpr);
            WorkoutSwimmer workoutSwimmer = new WorkoutSwimmer(cpr, ageGroup, active, fee, debt, age);
            addToMemberList(workoutSwimmer);
        }
        else if(selection == 2)
        {
            OutputHandler.printTextBoxStart();
            String cpr = InputHandler.inputCPR();
            OutputHandler.printTextBoxEnd();
            AgeGroup ageGroup = findAgeGroup(cpr);
            boolean active = InputHandler.fromInputToBool();
            int fee = calculateSubscriptionFee(ageGroup, cpr, active);
            int debt = 0;
            int age = castCPRToAge(cpr);
            String trainer = InputHandler.inputString();
            CompetitiveSwimmer competitiveSwimmer = new CompetitiveSwimmer(cpr, ageGroup, active, fee, debt, age, trainer);
            addToMemberList(competitiveSwimmer);
        }

    }

    public int castCPRToAge(String cpr)
    {
        LocalDate dob = convertCprToLocalDate(cpr);
        int age = findAge(dob);
        return age;
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

    public Member findMember()
    {
        Member member;
        String cpr = InputHandler.inputCPR();

        for(int i=0; i<memberList.size(); i++)
        {
            if (memberList.get(i).getCpr().equals(cpr))
            {
                member = memberList.get(i);
                return member;
            }
        }
        return null;
    }
    public void PrintAllMemberInformation()
    {
        Member member = findMember();
        String information = member.toString();
        OutputHandler.printAllMemberInformation(information);

    }

    public int selectMembershipType()
    {
        int memberShipChoice = InputHandler.inputMenuChoice();
        return memberShipChoice;
    }

    public void chargeMembers()
    {
        for(Member member : memberList)
        {
            member.setDebt(calculateSubscriptionFee(member.getAgeGroup(),member.getCpr(), member.getMembershipStatus()));
        }
    }

    public int calculateSubscriptionFee(AgeGroup ageGroup, String cpr, boolean active)
    {
        int fee = 0;
        int age = castCPRToAge(cpr);

        if(active == true && ageGroup == AgeGroup.Junior)
        {
            fee = fee + 1000;
        }
        else if(active == true && ageGroup == AgeGroup.Senior)
        {
            fee = fee + 1600;
        }
        else if(active == true && age >= 60)
        {
            fee = fee + 1200;
        }
        else if(active == false)
        {
           fee = fee + 500;
        }
        return fee;
    }


    public void addToMemberList(Member member)
    {
        memberList.add(member);
        System.out.println(member.toString());
    }

}
