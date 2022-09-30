import Instruments.Guitar;
import Instruments.Piano;
import Instruments.Saxophone;
import Instruments.Violin;
import NonInstruments.DrumSticks;
import NonInstruments.MusicSheets;
import TypesOfInstruments.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    private Shop shop;
    private Guitar guitar;
    private Piano piano;
    private Saxophone saxophone;
    private Violin violin;
    private MusicSheets musicSheets;
    private DrumSticks drumSticks;

    @Before
    public void setUp() {
        shop = new Shop(1000.00);
        drumSticks = new DrumSticks(30.00, 50.00, "Wooden Drumsticks");
        guitar = new Guitar("wooden", "brown", TypeOfInstrument.STRING, 200.00, 350.00, 4, TypeOfGuitar.ACOUSTIC);
        piano = new Piano("wooden", "white", TypeOfInstrument.KEYBOARD, 1500.00, 2000.00, TypeOfPiano.ACOUSTIC);
        saxophone = new Saxophone("gold", "gold", TypeOfInstrument.BRASS, 450.00, 600.00, 5, TypeOfSaxophone.ALTO);
        musicSheets = new MusicSheets(100.00, 120.00, "RNB");
        violin = new Violin("wooden", "magohany", TypeOfInstrument.STRING, 500.00, 700.00, TypeOfViolin.ACOUSTIC);
    }

    @Test
    public void shopHasMoney() {
        assertEquals(1000.00, shop.getTill(), 0.0);
    }

    @Test
    public void shopHasNoInstruments() {
        assertEquals(0, shop.checkStockOfInstruments());
    }

    @Test
    public void addStockToInstruments() {
        shop.buyInstrument(guitar);
        assertEquals(800.00, shop.getTill(), 0.0);
        assertEquals(1, shop.checkStockOfInstruments());
    }

    @Test
    public void addStockToNonInstruments() {
        shop.buyNonInstrument(musicSheets);
        assertEquals(1, shop.checkStockNonInstruments());
        assertEquals(900.00, shop.getTill(), 0.0);
    }

    @Test
    public void sellInstrumentFromStock() {
        shop.buyInstrument(guitar);
        shop.sellInstrument(guitar);
        assertEquals(0, shop.checkStockOfInstruments());
        assertEquals(1150, shop.getTill(), 0.0);
    }

    @Test
    public void sellNonInstrumentFromStock(){
        shop.buyNonInstrument(musicSheets);
        shop.sellNonInstrument(musicSheets);
        assertEquals(0, shop.checkStockNonInstruments());
        assertEquals(1020, shop.getTill(),0.0);
    }

    @Test
    public void checkShopCanSellBoth(){
        shop.buyInstrument(guitar);
        shop.sellInstrument(guitar);
        shop.buyNonInstrument(drumSticks);
        shop.sellNonInstrument(drumSticks);
        shop.buyNonInstrument(musicSheets);
        assertEquals(1, shop.checkStockNonInstruments());
        assertEquals(0, shop.checkStockOfInstruments());
        assertEquals(1070, shop.getTill(),0.0);
    }

}
