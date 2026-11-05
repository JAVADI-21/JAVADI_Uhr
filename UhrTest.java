

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class UhrTest
{
    @Test
    public void testDurchmesser1()
    {
        Uhr uhr = new Uhr("Casio", 1, false);
        assertEquals(1, uhr.getDurchmesser());
    }
    
    @Test
    public void testDurchmesser100()
    {
        Uhr uhr = new Uhr("Casio", 100, false);
        assertEquals(100, uhr.getDurchmesser());
    }
    
    @Test
    public void testDurchmesser0()
    {
        Uhr uhr = new Uhr("Casio", 0, false);
        assertEquals(1, uhr.getDurchmesser());
    }

    @Test
    public void testDurchmesser101()
    {
        Uhr uhr = new Uhr("Casio", 101, false);
        assertEquals(1, uhr.getDurchmesser());
    }

    @Test
    public void testDurchmesser50()
    {
        Uhr uhr = new Uhr("Casio", 50, false);
        assertEquals(50, uhr.getDurchmesser());
    }
    
    public UhrTest()
    {
    }

    @BeforeEach
    public void setUp()
    {
    }

    @AfterEach
    public void tearDown()
    {
    }
}