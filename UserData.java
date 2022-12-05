import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class UserData
{
    ArrayList<Member> memberList;
    ArrayList<StaevneResultat> staevneResultatList;
    public UserData(ArrayList<Member> memberList, ArrayList<StaevneResultat> staevneResultatList)
    {
        this.memberList = memberList;
        this.staevneResultatList = staevneResultatList;
    }

    String memberPath = "members.txt";
    String memberLine = "";
    String staevnePath = "staevneresultater.txt";
    String staevneLine = "";
    public void bootUserData() throws FileNotFoundException
    {
        InputHandler.InputMemberDataFromFile(memberList, memberPath);
        InputHandler.InputStaeveneDataFromFile(staevneResultatList, staevnePath);
    }

    public void outputToMemberDatabase()
    {
        String memberFileName = "members.txt";
        OutputHandler.writeToMemberDataBase(memberList, memberFileName);

    }

    public void createStaevneResultat()
    {
        OutputHandler.printTextBoxStart();
        String cpr = "";
        String lokation = "";
        int placering = 0;
        double tid = 0;

        boolean happy = false;
        while(!happy)
        {
            cpr = InputHandler.inputCPR();
            OutputHandler.printProvideLocation();
            lokation = InputHandler.inputString();
            OutputHandler.printProvidePlacement();
            placering = InputHandler.inputInt();
            OutputHandler.printProvideTime();
            tid = InputHandler.inputDouble();

            OutputHandler.printStaevneForm(cpr, lokation, placering, tid);
            OutputHandler.printIsInformationCorrect();
            happy = InputHandler.fromInputToBool();
        }
        OutputHandler.printTextBoxEnd();
        staevneResultatList.add(new StaevneResultat(cpr, lokation, placering, tid));
        outputToStaevneResultatDatabase();
    }
    public void outputToStaevneResultatDatabase()
    {
        String staevneFileName = "staevneResultater.txt";
        OutputHandler.writeToStaevneDataBase(staevneResultatList, staevneFileName);
    }

    public ArrayList<CompetitiveSwimmer> createCompetitiveSwimmerList()
    {
        ArrayList<CompetitiveSwimmer> competitiveSwimmerList = new ArrayList<>();
        for(Member member: memberList)
        {
            if(member instanceof CompetitiveSwimmer)
            {
                competitiveSwimmerList.add((CompetitiveSwimmer) member);
            }
        }
        return competitiveSwimmerList;
    }

    public void fetchBestCrawlResultat()
    {
        ArrayList<CompetitiveSwimmer> competitiveSwimmerList = createCompetitiveSwimmerList();
        Collections.sort(competitiveSwimmerList, new Comparator<Member>()
        {
            @Override
            public int compare(Member o1, Member o2)
            {
                return Double.toString(o1.getCrawlResultat()).compareTo(Double.toString(o2.getCrawlResultat()));
            }
        });
        OutputHandler.printBestTimesFor("Crawlsvoemning");

        if(competitiveSwimmerList.size() < 5)
        {
            for(int i=0; i<competitiveSwimmerList.size(); i++)
            {
                System.out.println(competitiveSwimmerList.get(i).getCpr() +" "+ competitiveSwimmerList.get(i).getCrawlResultat());
            }
        }
        else
        {
            for(int i=0; i<5; i++)
            {

                System.out.println(competitiveSwimmerList.get(i).getCpr() +" "+ competitiveSwimmerList.get(i).getCrawlResultat());
            }
        }


    }

    public void fetchBestButterflyResultat()
    {
        ArrayList<CompetitiveSwimmer> competitiveSwimmerList = createCompetitiveSwimmerList();
        Collections.sort(competitiveSwimmerList, new Comparator<Member>()
        {
            @Override
            public int compare(Member o1, Member o2)
            {
                return Double.toString(o1.getButterflyResultat()).compareTo(Double.toString(o2.getButterflyResultat()));
            }
        });
        OutputHandler.printBestTimesFor("Butterflysvoemning");
        if(competitiveSwimmerList.size() < 5)
        {
            for(int i=0; i<competitiveSwimmerList.size(); i++)
            {

                System.out.println(competitiveSwimmerList.get(i).getCpr() +" "+ competitiveSwimmerList.get(i).getButterflyResultat());
            }
        }
        else
        {
            for(int i=0; i<5; i++)
            {

                System.out.println(competitiveSwimmerList.get(i).getCpr() +" "+ competitiveSwimmerList.get(i).getButterflyResultat());
            }
        }

    }

    public void fetchBestRygCrawlResultat()
    {
        ArrayList<CompetitiveSwimmer> competitiveSwimmerList = createCompetitiveSwimmerList();
        Collections.sort(competitiveSwimmerList, new Comparator<Member>()
        {
            @Override
            public int compare(Member o1, Member o2)
            {
                return Double.toString(o1.getRygCrawlResultat()).compareTo(Double.toString(o2.getRygCrawlResultat()));
            }
        });
        OutputHandler.printBestTimesFor("Rygcrawlsvoemning");

        if(competitiveSwimmerList.size() < 5)
        {
            for(int i=0; i<competitiveSwimmerList.size(); i++)
            {
                System.out.println(competitiveSwimmerList.get(i).getCpr() +" "+ competitiveSwimmerList.get(i).getRygCrawlResultat());
            }
        }
        else
        {
            for(int i=0; i<5; i++)
            {

                System.out.println(competitiveSwimmerList.get(i).getCpr() +" "+ competitiveSwimmerList.get(i).getRygCrawlResultat());
            }
        }
    }

    public void fetchBestBrystsvoemning()
    {
        ArrayList<CompetitiveSwimmer> competitiveSwimmerList = createCompetitiveSwimmerList();
        Collections.sort(competitiveSwimmerList, new Comparator<Member>()
        {
            @Override
            public int compare(Member o1, Member o2)
            {
                return Double.toString(o1.getBrystsoevmningResultat()).compareTo(Double.toString(o2.getBrystsoevmningResultat()));
            }
        });

        OutputHandler.printBestTimesFor("Brystsvoemning");

        if(competitiveSwimmerList.size() < 5)
        {
            for(int i=0; i<competitiveSwimmerList.size(); i++)
            {
                System.out.println(competitiveSwimmerList.get(i).getCpr() +" "+ competitiveSwimmerList.get(i).getBrystsoevmningResultat());
            }
        }
        else
        {
            for(int i=0; i<5; i++)
            {

                System.out.println(competitiveSwimmerList.get(i).getCpr() +" "+ competitiveSwimmerList.get(i).getBrystsoevmningResultat());
            }
        }
    }
}
