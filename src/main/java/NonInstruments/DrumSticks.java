package NonInstruments;

public class DrumSticks extends NonInstruments {
    private String drumsticks;

    public DrumSticks(double buyPrice, double sellPrice, String drumsticks) {
        super(buyPrice, sellPrice);
        this.drumsticks = drumsticks;
    }

    public String getDrumsticks() {
        return drumsticks;
    }

    public void setDrumsticks(String drumsticks) {
        this.drumsticks = drumsticks;
    }
}
