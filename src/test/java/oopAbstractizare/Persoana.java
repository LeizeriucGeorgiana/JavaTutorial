package oopAbstractizare;

public class Persoana {

    // Abstractizare=conceptul prin care putem defini comportamentul unei clase
    //Abstaractizarea se poate face in doua feluri: folosind Interfente sau Clase Abstracte
    //O Interfata contine doar metode abstracte( metode care nu au body- nu avem acolade)
    //Recunoastem o interfata pe baza cuvantului INTERFACE
    //Toate metodele din interfata sunt Publice
    //O interfata nu poate sa contina un Constructor=> nu putem face un obiect
    //O Interfata se IMPLEMENTEAZA
    //O clasa poate sa implementeze o Interfata=> trebuie sa implementeze toate metodele din interfata
    //O clasa poate implementya mai multe interfete
    //O Interfata poate extinde o alta Interfata
    //O clasa abstracta poate IMPLEMENTA o Interfata, insa Interfata nu poate EXTINDE o Clasa Abstracta


    private String nume;
    private String prenume;
    private int varsta;

    //constructor
    public Persoana(String nume, String prenume, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public void infoPersoana(){
        System.out.println("Numele persoanei este: " + nume);
        System.out.println("Prenumele persoanei este: " + prenume);
        System.out.println("Varsta persoanei este : " + varsta);
    }
   //get and set
    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }
}
