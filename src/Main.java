import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Vino vino = new Vino("Rossiyskii", "Krasnyi","Russia",LocalDate.of(2021,2,1));
        Vino vino1 = new Vino("Kyrgyzstan ", "White ","Kyrgyzstan",LocalDate.of(2020,6,8));
        Vino vino2 = new Vino("Rossiyskii", "Krasnyi","Russia",LocalDate.of(2021,5,3));

        Vinodel vinodel = new Vinodel("Krasnyi",9,"Russia",Vino);
        Vinodel vinodel1 = new Vinodel("White",10,"Kyrgyzstan");
        Vinodel vinodel2 = new Vinodel("Krasnyi",8,"Russia");



        Vino [] vinos =  {vino,vino1,vino2};
        for (Vino a : vinos ) {
            System.out.println(a.toString());
        }


    }
}