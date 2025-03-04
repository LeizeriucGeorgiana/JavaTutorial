package practiceOOP;

public class Tenis extends Sportiv{
    private int pozitieClasament;
    private int trofee;

    public Tenis(String nume, String prenume, int varsta, String sport, int pozitieClasament, int trofee) {
        super(nume, prenume, varsta, sport);
        this.pozitieClasament = pozitieClasament;
        this.trofee = trofee;
    }

    public void infoSportiv(){
        super.infoSportiv();
        System.out.println(" Pozitia in clasament al sportivului este:" + pozitieClasament);
        System.out.println("Numarul de trofee castigate de sportiv este: "+trofee);
    }

}
