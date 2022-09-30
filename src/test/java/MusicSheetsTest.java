import NonInstruments.MusicSheets;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicSheetsTest {
    private MusicSheets musicSheets;

    @Before
    public void setUp(){
        musicSheets = new MusicSheets(100.00, 120.00,"RNB");
    }
    @Test
    public void hasBuyPrice(){
        assertEquals(100.00, musicSheets.getBuyPrice(),0.0);
    }
    @Test
    public void hasSellPrice(){
        assertEquals(120.00, musicSheets.getSellPrice(),0.0);
    }
    @Test
    public void canSell(){
        assertEquals(true, musicSheets.canSell());
    }
    @Test
    public void getMarkup(){
        assertEquals(20.00, musicSheets.calculateMarkup(),0.0);
    }
}
