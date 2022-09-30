import Instruments.Instrument;
import NonInstruments.NonInstruments;

import java.util.ArrayList;

public class Shop {

    private ArrayList<Instrument> instruments;
    private ArrayList<NonInstruments> nonInstruments;

    private double till;

    public Shop(double till) {
        this.instruments = new ArrayList<>();
        this.nonInstruments = new ArrayList<>();
        this.till = 1000;
    }

    public ArrayList<Instrument> getInstruments() {
        return instruments;
    }

    public void setInstruments(ArrayList<Instrument> instruments) {
        this.instruments = instruments;
    }

    public ArrayList<NonInstruments> getNonInstruments() {
        return nonInstruments;
    }

    public void setNonInstruments(ArrayList<NonInstruments> nonInstruments) {
        this.nonInstruments = nonInstruments;
    }

    public double getTill() {
        return till;
    }

    public void setTill(double till) {
        this.till = till;
    }

    public int checkStockOfInstruments(){
        return instruments.size();
    }

    public void addInstrumentToStock(Instrument instrument){
        instruments.add(instrument);
    }

    public void addNonInstrumentToStock(NonInstruments nonInstrument){
        nonInstruments.add(nonInstrument);
    }

    public int checkStockNonInstruments(){
        return nonInstruments.size();
    }
    public void removeMoneyFromTill(double value){
      till -= value;
    }
    public void buyNonInstrument(NonInstruments nonInstrument){
        addNonInstrumentToStock(nonInstrument);
        removeMoneyFromTill(nonInstrument.getBuyPrice());
    }
    public void sellNonInstrument(NonInstruments nonInstrument){
        nonInstruments.remove(nonInstrument);
        updateSale(nonInstrument.getSellPrice());
    }
    public void buyInstrument(Instrument instrument){
        addInstrumentToStock(instrument);
        removeMoneyFromTill(instrument.getBuyPrice());
    }

    public void sellInstrument(Instrument instrument){
        instruments.remove(instrument);
        updateSale(instrument.getSellPrice());
    }
    public void updateSale(double value){
        till += value;
    }

}
