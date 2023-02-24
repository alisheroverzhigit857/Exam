import java.time.LocalDate;
import java.time.Period;

public class Vinodel  implements Koshuu {
    private  String kandayVinoKylat;
    private int stazhy;
    private  String adress;
    private Vino [] vinos;

    public Vinodel(String kandayVinoKylat, int stazhy, String adress, Vino[] vinos) {
        this.kandayVinoKylat = kandayVinoKylat;
        this.stazhy = stazhy;
        this.adress = adress;
        this.vinos = vinos;
    }

    public String getKandayVinoKylat() {
        return kandayVinoKylat;
    }

    public void setKandayVinoKylat(String kandayVinoKylat) {
        this.kandayVinoKylat = kandayVinoKylat;
    }

    public int getStazhy() {
        return stazhy;
    }

    public void setStazhy(int stazhy) {
        this.stazhy = stazhy;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Vino[] getVinos() {
        return vinos;
    }

    public void setVinos(Vino[] vinos) {
        this.vinos = vinos;
    }

    @Override
    public void   janyVinoKoshuu() {
        System.out.println(LocalDate.now());
    }
}
