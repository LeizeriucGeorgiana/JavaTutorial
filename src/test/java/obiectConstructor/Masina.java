package obiectConstructor;

public class Masina {
    public String marca;
    public String monitorizare;
    public int an;
    public int pret;

    public Masina(String marca, String monitorizare, int an, int pret) {
        this.marca = marca;
        this.monitorizare = monitorizare;
        this.an = an;
        this.pret = pret;
    }

    public Masina(String marca, String monitorizare, int an) {
        this.marca = marca;
        this.monitorizare = monitorizare;
        this.an = an;
    }

    public void afisezDetalii(){
        System.out.println("Marca masinii este: " + marca);
        System.out.println("Motorizarea masinii este: " + monitorizare);
        System.out.println("Pretul masinii este: " + pret);
        if(an==0)
        {
            System.out.println("Nu are anul stabilit. ");
        }
        else
        {
            System.out.println("Anul masinii este: " + an);
        }

    }
}