public class StaevneResultat {

    //declaring variables
    private String cpr;
    private String lokation;
    private int placering;
    private double tid;

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

}
