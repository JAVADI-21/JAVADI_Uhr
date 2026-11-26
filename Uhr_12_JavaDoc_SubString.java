public class Uhr_12_JavaDoc_SubString
{
    private String marke = "UNKN";
    private int durchmesser = 1;
    private boolean digital = false;
    
    public Uhr_12_JavaDoc_SubString(String neuMarke, int neuDurchmesser, boolean neuDigital)
    {
        marke = neuMarke;
        durchmesser = neuDurchmesser;
        digital = neuDigital;
    }
    
    public String getMarke()
    {
        return marke;
    }

    public int getDurchmesser()
    {
        return durchmesser;
    }

    public boolean getDigital()
    {
        return digital;
    }
}