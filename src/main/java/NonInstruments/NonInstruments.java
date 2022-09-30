package NonInstruments;

import Behaviours.ISell;

abstract public class NonInstruments implements ISell {
    private double buyPrice;
    private double sellPrice;

    public NonInstruments(double buyPrice, double sellPrice) {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
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

    @Override
    public double calculateMarkup() {
        return getSellPrice()-getBuyPrice();
    }

    @Override
    public boolean canSell() {
        return true;
    }

}
