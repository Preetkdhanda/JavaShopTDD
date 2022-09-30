import Instruments.Guitar;
import TypesOfInstruments.TypeOfGuitar;
import TypesOfInstruments.TypeOfInstrument;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    public Guitar guitar;

    @Before
    public void setUp(){

        guitar = new Guitar("wooden","brown", TypeOfInstrument.STRING, 200.00,350.00, 4, TypeOfGuitar.ACOUSTIC);

    }

    @Test
    public void canGetGuitarMaterial(){
        assertEquals("wooden", guitar.getMaterial());
    }

    @Test
    public void canGetGuitarColor(){
        assertEquals("brown", guitar.getColor());
    }

    @Test

    public void canGetGuiterBuyPrice(){
        assertEquals(200.00, guitar.getBuyPrice(),0.0);
    }

    @Test
    public void canGetGuitarSellPrice(){
        assertEquals(350.00, guitar.getSellPrice(),0.0);
    }

    @Test

    public void canGetGuitarMarkUp(){
        assertEquals(150.00, guitar.calculateMarkup(),0.0);
    }

    @Test

    public void guitarCanSell(){
        assertEquals(true, guitar.canSell());
    }

    @Test

    public void guitarCanPlay(){
        assertEquals("Strum", guitar.canPlay());
    }
}
