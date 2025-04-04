package oop;

import java.util.List;

public class Audi extends Masina {
   // public List<String> dotariExterioare;
    //public List<String> dotariInterioare;
    private List<String> dotariExterioare;
    private List<String> dotariInterioare;




    public Audi(String marca, String model, String culoare, int an, List<String>dotariExterioare, List<String>dotariInterioare) {
        super(marca, model, culoare, an);
        this.dotariExterioare= dotariExterioare;
        this.dotariInterioare=dotariInterioare;
    }

    public Audi (String marca, String model, String culoare, int an, double pret, List<String> dotariInterioare, List<String> dotariExterioare) {
        super(marca, model, culoare, an, pret);
        this.dotariInterioare = dotariInterioare;
        this.dotariExterioare = dotariExterioare;
    }


    public void infoAudi() {
        infoMasina();
        System.out.println("Dotarile exterioare sunt: " + dotariExterioare);
        System.out.println("Dotarile interioare sunt: " + dotariInterioare);
    }
//Polimorfism dinamic

    public void pornesteMasina(){
        System.out.println("Masinile audi pornesc automat");
        super.pornesteMasina();

    }
    public List<String> getDotariExterioare() {
        return dotariExterioare;
    }

    public void setDotariExterioare(List<String> dotariExterioare) {
        this.dotariExterioare = dotariExterioare;
    }

    public List<String> getDotariInterioare() {
        return dotariInterioare;
    }

    public void setDotariInterioare(List<String> dotariInterioare) {
        this.dotariInterioare = dotariInterioare;
    }
}
