public class Uhr_09_MultipleConstructor
{
    private String marke = "UNKN";
    private boolean digital = false;
    private boolean wasserdicht = false;
    private int durchmesser = 1;
    private int preis = 90;

    public Uhr_09_MultipleConstructor(String neuMarke, boolean neuDigital, boolean neuWasserdicht, int neuDurchmesser, int neuPreis)
    {
        setMarke(neuMarke);
        setDigital(neuDigital);
        setWasserdicht(neuWasserdicht);
        setDurchmesser(neuDurchmesser);
        setPreis(neuPreis);
    }
    
    public Uhr_09_MultipleConstructor(String neuMarke, boolean neuDigital, int neuDurchmesser)
    {
        setMarke(neuMarke);
        setDigital(neuDigital);
        setDurchmesser(neuDurchmesser);
    }
    
    public Uhr_09_MultipleConstructor(String neuMarke, boolean neuDigital)
    {
        setMarke(neuMarke);
        setDigital(neuDigital);
    }
    
    public Uhr_09_MultipleConstructor(String neuMarke, int neuDurchmesser, boolean neuWasserdicht)
    {
        setMarke(neuMarke);
        setDurchmesser(neuDurchmesser);
        setWasserdicht(neuWasserdicht);
    }
    
    public Uhr_09_MultipleConstructor(String neuMarke)
    {
        setMarke(neuMarke);
    }
    
    public Uhr_09_MultipleConstructor()
    {
    }
    
    public String getMarke()
    {
        return marke;
    }
    
    public boolean getDigital()
    {
        return digital;
    }
    
    public boolean getWasserdicht()
    {
        return wasserdicht;
    }
    
    public int getDurchmesser()
    {
        return durchmesser;
    }
    
    public int getPreis()
    {
        return preis;
    }
    
    public void setMarke(String neuMarke)
    {
        marke = neuMarke;
    }
    
    public void setDigital(boolean neuDigital)
    {
        digital = neuDigital;
    }
    
    public void setWasserdicht(boolean neuWasserdicht)
    {
        wasserdicht = neuWasserdicht;
    }
    
    public void setDurchmesser(int neuDurchmesser)
    {
        durchmesser = neuDurchmesser;
    }
    
    public void setPreis(int neuPreis)
    {
        preis = neuPreis;
    }
    
    public void printUhr()
    {
    }
}
