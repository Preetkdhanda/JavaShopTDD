package Instruments;

import TypesOfInstruments.TypeOfInstrument;
import TypesOfInstruments.TypeOfViolin;

public class Violin extends Instrument {

    private TypeOfViolin typeOfViolin;

    public Violin(String material, String color, TypeOfInstrument typeOfInstrument, double buyPrice, double sellPrice, TypeOfViolin typeOfViolin) {
        super(material, color, typeOfInstrument, buyPrice, sellPrice);
        this.typeOfViolin = typeOfViolin;
    }

    public TypeOfViolin getTypeOfViolin() {
        return typeOfViolin;
    }

    public void setTypeOfViolin(TypeOfViolin typeOfViolin) {
        this.typeOfViolin = typeOfViolin;
    }

    @Override
    public String canPlay() {
        return "StringString";
    }
}
