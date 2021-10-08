import java.lang.reflect.Constructor;

public class Dyr {

    int antalBen = 8;
    double kropsTemperatur = 3.4;
    boolean levende = false;
    String navn = "halløj";
    int antalOjne = 2;
    int[] spisetider = {2,5,9,9,7};

    public Dyr() {
    }

    public Dyr(int antalBen){
        this.antalBen =antalBen;
    }

    public Dyr(double kropsTemperatur) {
        this.kropsTemperatur = kropsTemperatur;
    }

    public Dyr(boolean levende) {
        this.levende = levende;
    }

    public Dyr(String navn) {
        this.navn = navn;
    }

    public Dyr(int antalBen, int antalOjne) {
        this.antalBen = antalBen;
        this.antalOjne = antalOjne;
    }

    public Dyr(int[] spisetider) {
        this.spisetider = spisetider;
    }

    public static void main(String[] args) {

        Dyr x1 = new Dyr(5);
        Dyr x2 = new Dyr(5.9);
        Dyr x3 = new Dyr(true);
        Dyr x4 = new Dyr("Jensen");
        Dyr x5 = new Dyr(3,2);
    //    Dyr x6[] = new Dyr(2,3,5,6,6);
    }

}

