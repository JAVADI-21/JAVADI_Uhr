import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class Uhr_12_JavaDoc_SubStringTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Uhr_12_JavaDoc_SubStringTest
{
    @Test
    public void testGetLand()
    {
        Uhr_12_JavaDoc_SubString uhr = new Uhr_12_JavaDoc_SubString("Schweiz Swatch", 40, true);
        
        assertEquals("Schweiz", uhr.getLand());
    }
    
    @Test
    public void testGetMarke()
    {
        Uhr_12_JavaDoc_SubString uhr = new Uhr_12_JavaDoc_SubString("Schweiz Swatch", 40, true);

        assertEquals("Swatch", uhr.getMarke());
    }
    
    // TEST Ohne Leerzeichnen 
    @Test
    public void testGetLandOhneLeerzeichen()
    {
        Uhr_12_JavaDoc_SubString uhr = new Uhr_12_JavaDoc_SubString("Swatch", 40, true);

        assertEquals("", uhr.getLand());
    }
    
    @Test
    public void testGetMarkeOhneLeerzeichen()
    {
        Uhr_12_JavaDoc_SubString uhr = new Uhr_12_JavaDoc_SubString("Swatch", 40, true);

        assertEquals("", uhr.getMarke());
    }
}