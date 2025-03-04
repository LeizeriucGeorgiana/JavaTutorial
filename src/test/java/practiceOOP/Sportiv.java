package practiceOOP;

public class Sportiv {

    //def proprietatile unui sportiv pe care le customizam in functie de tipul sportului pe care il practica

    private String nume;
    private String prenume;
    private int varsta;
    private String sport;


    public Sportiv(String nume, String prenume, int varsta, String sport) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.sport = sport;

    }

    public void infoSportiv(){
        System.out.println("Sportivul are numele si prenumele: " + nume+" " +  prenume);
        System.out.println("Sportivul are varsta: "+ varsta);
        System.out.println("Sportul practicat este: "+ sport);

       //System.out.println("Sportivul face parte din echipa: "+ echipa);
       // System.out.println("Sportivul are rolul de: "+ rolulDinEchipa);
    }
}
