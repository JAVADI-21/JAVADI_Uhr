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
        if (neuDurchmesser >= 1 && neuDurchmesser <= 100)
        {
            durchmesser = neuDurchmesser;
        }
        else
        {
            System.out.println("Fehler: Der Durchmesser muss zwischen 1 und 100 liegen.");
            durchmesser = 1;
        }
    }
    
    public void setDigital(boolean neuDigital)
    {
        digital = neuDigital;
    }
    
    public void printUhr()
    {
        if (digital==true)
        {
        System.out.println(marke + " Uhr: " + durchmesser + " mm -  digital ");
        }
        else
        {
        System.out.println(marke + " Uhr: " + durchmesser + " mm -  analog ");
        }
    }
}