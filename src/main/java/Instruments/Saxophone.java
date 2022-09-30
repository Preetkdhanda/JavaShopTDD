package Instruments;

import TypesOfInstruments.TypeOfInstrument;
import TypesOfInstruments.TypeOfSaxophone;

public class Saxophone extends Instrument {

    private int noOfValves;
    private TypeOfSaxophone typeOfSaxophone;

    public Saxophone(String material, String color, TypeOfInstrument typeOfInstrument, double buyPrice, double sellPrice, int noOfValves, TypeOfSaxophone typeOfSaxophone) {
        super(material, color, typeOfInstrument, buyPrice, sellPrice);
        this.noOfValves = noOfValves;
        this.typeOfSaxophone = typeOfSaxophone;
    }

    public int getNoOfValves() {
        return noOfValves;
    }

    public void setNoOfValves(int noOfValves) {
        this.noOfValves = noOfValves;
    }

    public TypeOfSaxophone getTypeOfSaxophone() {
        return typeOfSaxophone;
    }

    public void setTypeOfSaxophone(TypeOfSaxophone typeOfSaxophone) {
        this.typeOfSaxophone = typeOfSaxophone;
    }

    public String canPlay(){ return "Woo Lisa Simpson" ;} ;
}
