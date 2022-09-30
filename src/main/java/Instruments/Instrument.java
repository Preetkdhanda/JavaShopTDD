package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;
import TypesOfInstruments.TypeOfInstrument;


abstract public class Instrument {
    private String material;
    private String color;
    private TypeOfInstrument typeOfInstrument;
    private double buyPrice;
    private double sellPrice;

    public Instrument(String material, String color, TypeOfInstrument typeOfInstrument, double buyPrice, double sellPrice) {
        this.material = material;
        this.color = color;
        this.typeOfInstrument = typeOfInstrument;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public TypeOfInstrument getTypeOfInstrument() {
        return typeOfInstrument;
    }

    public void setTypeOfInstrument(TypeOfInstrument typeOfInstrument) {
        this.typeOfInstrument = typeOfInstrument;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public String canPlay(){
        return "I can play";
    }
    public boolean canSell(){
        return true;
    }

    public double calculateMarkup() {
        return getSellPrice() - getBuyPrice();
    }
}
