import Instruments.Violin;
import TypesOfInstruments.TypeOfInstrument;
import TypesOfInstruments.TypeOfViolin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {
    private Violin violin;

    @Before
    public void setUp(){
        violin = new Violin("wooden","magohany", TypeOfInstrument.STRING,500.00, 700.00, TypeOfViolin.ACOUSTIC);
    }

    @Test
    public void hasMaterial(){
        assertEquals("wooden", violin.getMaterial());
    }
    @Test
    public void hasColor(){
        assertEquals("magohany", violin.getColor());
    }
    @Test
    public void hasBuyPrice(){
        assertEquals(500.00,violin.getBuyPrice(),0.0);
    }
    @Test
    public void hasSellPrice(){
        assertEquals(700.00, violin.getSellPrice(),0.0);
    }
    @Test
    public void canMarkup(){
        assertEquals(200.00, violin.calculateMarkup(),0.0);
    }
    @Test
    public void canPlay(){
        assertEquals("StringString", violin.canPlay());
    }
}
