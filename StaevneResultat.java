public class StaevneResultat {

    //declaring variables
    String cpr;
    String lokation;
    int placering;
    double tid;

    //creating constructors
    public StaevneResultat(String cpr, String lokation, int placering, double tid)
    {
        this.cpr = cpr;
        this.lokation = lokation;
        this.placering = placering;
        this.tid = tid;
    }

    public String toString()
    {
        return "CPR: " + cpr + " - Lokation: " + lokation + " - Placering: " + placering + " - Tid: " + tid;
    }

    public String outputStaevneResultat()
    {
        return cpr + "," + lokation + "," + placering + "," + tid;
    }

    public String getCPR()
    {
        return cpr;
    }

}
