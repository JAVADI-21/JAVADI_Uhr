public class Uhr_09_MultipleConstructor
{
    private String marke = "UNKN";
    private boolean digital = false;
    private boolean wasserdicht = false;
    private int durchmesser = 1;
    private int preis = 90;
    
    public Uhr_09_MultipleConstructor(String neuMarke, boolean neuDigital, boolean neuWasserdicht, int neuDurchmesser, int neuPreis)
    {
        marke = neuMarke;
        digital = neuDigital;
        wasserdicht = neuWasserdicht;
        durchmesser = neuDurchmesser;
        preis = neuPreis;
    }
    
    public Uhr_09_MultipleConstructor(String neuMarke, boolean neuDigital, int neuDurchmesser)
    {
        marke = neuMarke;
        digital = neuDigital;
        durchmesser = neuDurchmesser;
    }
    
    public Uhr_09_MultipleConstructor(String neuMarke, boolean neuDigital)
    {
        marke = neuMarke;
        digital = neuDigital;
    }
    
    public Uhr_09_MultipleConstructor(String neuMarke, boolean neuWasserdicht, int neuDurchmesser)
    {
        marke = neuMarke;
        wasserdicht = neuWasserdicht;
        durchmesser = neuDurchmesser;
    }
    
    public Uhr_09_MultipleConstructor(String neuMarke, int neuDurchmesser, boolean neuWasserdicht)
    {
        marke = neuMarke;
        durchmesser = neuDurchmesser;
        wasserdicht = neuWasserdicht;
    }
    
    public Uhr_09_MultipleConstructor(String neuMarke)
    {
        marke = neuMarke;
    }
}
