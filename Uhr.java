public class Uhr
{
    private String marke;
    private int durchmesser;
    private boolean digital;
    
    public Uhr(String neuMarke, int neuDurchmesser, boolean neuDigital)
    {
    setMarke(neuMarke);
    setDurchmesser(neuDurchmesser);
    setDigital(neuDigital);
    printUhr();
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
    
    public void setMarke(String neuMarke)
    {
        marke = neuMarke;
    }
    
    public void setDurchmesser(int neuDurchmesser)
    {
        durchmesser = neuDurchmesser;
    }
    
    public void setDigital(boolean neuDigital)
    {
        digital = neuDigital;
    }
    
    public void printUhr()
    {
    System.out.println(marke + " Uhr: " + durchmesser + " mm - " + digital);
    }
}