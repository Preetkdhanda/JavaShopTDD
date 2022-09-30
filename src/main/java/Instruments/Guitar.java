package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;
import TypesOfInstruments.TypeOfGuitar;
import TypesOfInstruments.TypeOfInstrument;

public class Guitar extends Instrument implements IPlay, ISell {

    private int howManyStrings;
    private TypeOfGuitar typeOfGuitar;

    public Guitar(String material, String color, TypeOfInstrument typeOfInstrument, double buyPrice, double sellPrice, int howManyStrings, TypeOfGuitar typeOfGuitar) {
        super(material, color, typeOfInstrument, buyPrice, sellPrice);
        this.howManyStrings = howManyStrings;
        this.typeOfGuitar = typeOfGuitar;
    }

    public int getHowManyStrings() {
        return howManyStrings;
    }

    public void setHowManyStrings(int howManyStrings) {
        this.howManyStrings = howManyStrings;
    }

    public TypeOfGuitar getTypeOfGuitar() {
        return typeOfGuitar;
    }

    public void setTypeOfGuitar(TypeOfGuitar typeOfGuitar) {
        this.typeOfGuitar = typeOfGuitar;
    }



    public String canPlay(){
        return "Strum";
    }
}
