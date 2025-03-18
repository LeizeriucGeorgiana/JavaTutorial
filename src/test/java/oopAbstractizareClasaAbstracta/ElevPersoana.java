package oopAbstractizareClasaAbstracta;

import oopAbstractizare.Elev;

public class ElevPersoana extends Persoana implements Elev {
    private String scoala;
    private int clasa;

    public ElevPersoana(String nume, String prenume, int varsta) {
        super(nume, prenume, varsta);
        this.scoala=scoala;
        this.clasa=clasa;
    }

    public void infoElev(){
        System.out.println("Elevul studiaza la scoala"+ scoala);
        System.out.println("Elevul este in clasa"+clasa);
    }

    public String getScoala() {
        return scoala;
    }

    public void setScoala(String scoala) {
        this.scoala = scoala;
    }

    public int getClasa() {
        return clasa;
    }

    public void setClasa(int clasa) {
        this.clasa = clasa;
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

    @Override
    public void faceCurat() {

    }

    @Override
    public void mergeLaCumparaturi() {

    }

    @Override
    public void mergeLaScoala() {

    }

    @Override
    public void isiFaceTemele() {

    }

    @Override
    public void mergeInPauza() {

    }
}
