import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class UserData
{
    ArrayList<Member> memberList;
    public UserData(ArrayList<Member> memberList)
    {
        this.memberList = memberList;
    }

    public void fetchBestBrystsvoemning()
    {
        Collections.sort(memberList, new Comparator<Member>()
        {
            @Override
            public int compare(Member o1, Member o2)
            {
                return Double.toString(o1.getBrystsoevmningResultat()).compareTo(Double.toString(o2.getBrystsoevmningResultat()));
            }
        });
        System.out.println("Bedste tider for Brystsvoemning:");
        for(int i=0; i<5; i++)
        {

            System.out.println(memberList.get(i).getCpr() +" "+ memberList.get(i).getBrystsoevmningResultat());
        }
    }


    public void fetchBestCrawlResultat()
    {
        Collections.sort(memberList, new Comparator<Member>()
        {
            @Override
            public int compare(Member o1, Member o2)
            {
                return Double.toString(o1.getCrawlResultat()).compareTo(Double.toString(o2.getCrawlResultat()));
            }
        });
        System.out.println("Bedste tider for Crawlsvoemning:");
        for(int i=0; i<5; i++)
        {

            System.out.println(memberList.get(i).getCpr() +" "+ memberList.get(i).getCrawlResultat());
        }
    }

    public void fetchBestButterflyResultat()
    {
        Collections.sort(memberList, new Comparator<Member>()
        {
            @Override
            public int compare(Member o1, Member o2)
            {
                return Double.toString(o1.getButterflyResultat()).compareTo(Double.toString(o2.getButterflyResultat()));
            }
        });
        System.out.println("Bedste tider for Butterflysvoemning:");
        for(int i=0; i<5; i++)
        {

            System.out.println(memberList.get(i).getCpr() +" "+ memberList.get(i).getButterflyResultat());
        }
    }

    public void fetchBestRygCrawlResultat()
    {
        Collections.sort(memberList, new Comparator<Member>()
        {
            @Override
            public int compare(Member o1, Member o2)
            {
                return Double.toString(o1.getRygCrawlResultat()).compareTo(Double.toString(o2.getRygCrawlResultat()));
            }
        });System.out.println("Bedste tider for Rygcrawlsvoemning:");
        for(int i=0; i<5; i++)
        {

            System.out.println(memberList.get(i).getCpr() +" "+ memberList.get(i).getRygCrawlResultat());
        }
    }

}
