import java.time.LocalDate;

public class Vino {

    private String name ;
    private  String brand;
    private String madeOfCountry;
    private LocalDate togulgonUbaktysy;


    public Vino(String name, String brand, String madeOfCountry, LocalDate togulgonUbaktysy) {
        this.name = name;
        this.brand = brand;
        this.madeOfCountry = madeOfCountry;
        this.togulgonUbaktysy = togulgonUbaktysy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMadeOfCountry() {
        return madeOfCountry;
    }

    public void setMadeOfCountry(String madeOfCountry) {
        this.madeOfCountry = madeOfCountry;
    }

    public LocalDate getTogulgonUbaktysy() {
        return togulgonUbaktysy;
    }

    public void setTogulgonUbaktysy(LocalDate togulgonUbaktysy) {
        this.togulgonUbaktysy = togulgonUbaktysy;
    }

    @Override
    public String toString() {
        return "Vino{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", madeOfCountry='" + madeOfCountry + '\'' +
                ", togulgonUbaktysy=" + togulgonUbaktysy +
                '}';
    }
}


