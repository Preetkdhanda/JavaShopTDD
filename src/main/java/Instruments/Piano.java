package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;
import TypesOfInstruments.TypeOfInstrument;
import TypesOfInstruments.TypeOfPiano;

public class Piano extends Instrument implements IPlay, ISell {

    private TypeOfPiano typeOfPiano;

    public Piano(String material, String color, TypeOfInstrument typeOfInstrument, double buyPrice, double sellPrice, TypeOfPiano typeOfPiano) {
        super(material, color, typeOfInstrument, buyPrice, sellPrice);
        this.typeOfPiano = typeOfPiano;
    }

    public TypeOfPiano getTypeOfPiano() {
        return typeOfPiano;
    }

    public void setTypeOfPiano(TypeOfPiano typeOfPiano) {
        this.typeOfPiano = typeOfPiano;
    }


    public String canPlay(){
        return "Bashing keys";
    }
}
