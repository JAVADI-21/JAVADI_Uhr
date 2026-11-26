public class Uhr_15_Formel
{
    public int berechne(int x, int y)
    {
        int z = x * y + x + y;
        return z;
    }
    
    public int berechne(int a, int b, int c)
    {
        int e = berechne(a, b) + berechne(b, c) + berechne(c, a);
        return e;
    }
}