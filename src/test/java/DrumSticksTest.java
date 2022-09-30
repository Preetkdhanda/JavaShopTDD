import NonInstruments.DrumSticks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {
    private DrumSticks drumSticks;

    @Before
    public void setUp(){
        drumSticks = new DrumSticks(30.00, 50.00, "Wooden Drumsticks");
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(30.00, drumSticks.getBuyPrice(),0.0);
    }
    @Test
    public void hasSellPrice(){
        assertEquals(50.00, drumSticks.getSellPrice(),0.0);
    }
    @Test
    public void hasMarkUp(){
        assertEquals(20.00, drumSticks.calculateMarkup(),0.0);
    }
}
