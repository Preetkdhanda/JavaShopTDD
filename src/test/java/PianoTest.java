import Instruments.Piano;
import TypesOfInstruments.TypeOfInstrument;
import TypesOfInstruments.TypeOfPiano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    private Piano piano;

    @Before
    public void setUp(){
        piano = new Piano("wooden","white", TypeOfInstrument.KEYBOARD, 1500.00, 2000.00, TypeOfPiano.ACOUSTIC);
    }

    @Test
    public void hasMaterial(){
        assertEquals("wooden", piano.getMaterial());
    }
    @Test
    public void hasColor(){
        assertEquals("white", piano.getColor());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(1500.00, piano.getBuyPrice(),0.0);
    }
    @Test
    public void hasSellPrice(){
        assertEquals(2000.00, piano.getSellPrice(),0.0);
    }
    @Test
    public void canFindMarkup(){
        assertEquals(500.00,piano.calculateMarkup(),0.0);
    }
    @Test
    public void canPlay(){assertEquals("Bashing keys", piano.canPlay());}

}
