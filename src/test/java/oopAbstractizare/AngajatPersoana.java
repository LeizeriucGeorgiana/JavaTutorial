package oopAbstractizare;

public class AngajatPersoana extends Persoana implements Angajat{

    private String firma;
    private String experienta;
    private int salar;

    public AngajatPersoana(String nume, String prenume, int varsta, String firma, String experienta, int salar) {
        super(nume, prenume, varsta);
        this.firma=firma;
        this.experienta=experienta;
        this.salar=salar;
    }

    public void infoAngajat(){
        infoPersoana();
        System.out.println("Firma la care lucreaza angajatul este: "+ firma);
        System.out.println(" Experienta pe care o are angajatul este: " + experienta);
        System.out.println("Salariul angajatului este: "+ salar);
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getExperienta() {
        return experienta;
    }

    public void setExperienta(String experienta) {
        this.experienta = experienta;
    }

    public int getSalar() {
        return salar;
    }

    public void setSalar(int salar) {
        this.salar = salar;
    }

    @Override
    public void mergeLaLucru() {

    }

    @Override
    public void primestiSalar() {

    }

    @Override
    public void pauzaDeMasa() {

    }

    @Override
    public void mergeInConcediu() {

    }
}
