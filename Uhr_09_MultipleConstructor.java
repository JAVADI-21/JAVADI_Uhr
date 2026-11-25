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
}
