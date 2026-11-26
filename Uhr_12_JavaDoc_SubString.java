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
         return marke.substring(marke.indexOf(" ") + 1);
    }

     public int getDurchmesser()
    {
        return durchmesser;
    }

    public boolean getDigital()
    {
        return digital;
    }
    
    public void setMarke(String neueMarke)
    {
        marke = neueMarke;
    }

    public void setDurchmesser(int neuerDurchmesser)
    {
        durchmesser = neuerDurchmesser;
    }

    public void setDigital(boolean neuesDigital)
    {
        digital = neuesDigital;
    }
    
    public String getLand()
    {
             if (marke.indexOf(" ") == -1)
        {
            System.out.println("Fehler: Kein Leerzeichen vorhanden.");
            return "";
        }
            return marke.substring(0, marke.indexOf(" "));
    }
}