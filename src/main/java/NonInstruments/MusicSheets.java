package NonInstruments;

import Behaviours.ISell;

public class MusicSheets extends NonInstruments  {

    private String music;

    public MusicSheets(double buyPrice, double sellPrice, String music) {
        super(buyPrice, sellPrice);
        this.music = music;
    }

    public String getMusic() {
        return music;
    }

    public void setMusic(String music) {
        this.music = music;
    }


}
