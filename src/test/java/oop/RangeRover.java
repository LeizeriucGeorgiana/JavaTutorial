package oop;

import java.util.List;

//copilul Range Rover mosteneste constructorul din parintele Masina
public class RangeRover extends Masina {
    //public List<String>dotariExterioare;
    private List<String>dotariExterioare;

//dotarile ulterioare se adauga manual
    public RangeRover(String marca, String model, String culoare, int an, List<String>dotariExterioare) {
        super(marca, model, culoare, an);
        this.dotariExterioare= dotariExterioare;
    }

    public RangeRover(String marca, String model, String culoare, int an, double pret, List<String> dotariExterioare) {
        super(marca, model, culoare, an, pret);
        this.dotariExterioare = dotariExterioare;
    }

    public void infoRangeRover(){
        infoMasina();//apelam metoda info masina din parintele Masina - inlocuim functiile  trecute in acea metoda
        System.out.println("Dotarile exterioare sunt: " + dotariExterioare);
    }
    public void pornesteMasina(){
        System.out.println("Masinile Range Rover pornesc prin voice comand");
    }

    //polimorfism static

    public void promotii(){
        System.out.println("Din pacate nu avem promotii disponibile");
    }

    public void promotii(int discount){
        System.out.println("Va putem aplica un discount de :" + discount + "%");
    }

    public void promotii(String cupon){
        System.out.println("Va putem aplica urmatorul cupon :" + cupon);
    }



    public List<String> getDotariExterioare() {
        return dotariExterioare;
    }

    public void setDotariExterioare(List<String> dotariExterioare) {
        this.dotariExterioare = dotariExterioare;
    }
}
