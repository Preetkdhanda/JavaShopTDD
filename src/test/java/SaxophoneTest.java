import Instruments.Saxophone;
import TypesOfInstruments.TypeOfInstrument;
import TypesOfInstruments.TypeOfSaxophone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    private Saxophone saxophone;

    @Before
    public void setUp(){
        saxophone = new Saxophone("gold", "gold", TypeOfInstrument.BRASS, 450.00, 600.00,5, TypeOfSaxophone.ALTO);

    }
    @Test
    public void hasMaterial(){
        assertEquals("gold", saxophone.getMaterial());
    }
    @Test
    public void hasColor(){
        assertEquals("gold", saxophone.getColor());
    }
    @Test
    public void hasBuyPrice(){
        assertEquals(450.00, saxophone.getBuyPrice(),0.0);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(600.00, saxophone.getSellPrice(),0.0);
    }

    @Test
    public void hasValves(){
        assertEquals(5, saxophone.getNoOfValves());
    }

    @Test
    public void canMarkup(){
        assertEquals(150.00, saxophone.calculateMarkup(),0.0);
    }

    @Test
    public void canPlay(){ assertEquals("Woo Lisa Simpson", saxophone.canPlay());}

}
