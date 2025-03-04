package oopAbstractizareClasaAbstracta;

public abstract class Persoana {
    //Oclasa abstracta se recunoaste dupa cuvantul abstract;
    //Clasa abstracta poate sau nu sa contina metode abstracte;
    //O clasa abstracta se mosteneste;
    //Clasa care mosteneste o clasa abstracta trebuie sa implementeze toate metodele abstracte;
    //O metoda abstracta trebuie sa contina cuvantul abstract;
    //Metodele abstracte pot sa fie publice/protected.
    //O clasa abstracta poate sa implementeze o interfata
    //O clasa abstracta poate sa contina un constructor=>nu putem face un obiect ditr-o clasa abstracta

    private String nume;
    private String prenume;
    private int varsta;

    public Persoana(String nume, String prenume, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }
//metode abstracte pentru un angajat/elev/casnic
    public abstract void mergeLaLucru();

    public abstract void  primestiSalar();

    public abstract void pauzaDeMasa();

    public abstract void mergeInConcediu();

    public abstract void faceCurat();

    public abstract void mergeLaCumparaturi();

    public abstract void mergeLaScoala();//definire metoda abstracta

    public abstract void isiFaceTemele();

   public abstract void mergeInPauza();

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
