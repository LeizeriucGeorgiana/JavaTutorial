package oop;

public class Masina {

    //OOP concepte: mostenire, incapsulare, polimorfism, abstractizare
    //Mostenire=conceptul prin care o clasa mosteneste o alta clasa
    // clasa care mosteneste , se numeste clasa copil
    //clasa care este mostenita , se numeste clasa parinte
    //in java, o clasa poate mosteni o singura clasa
    //cand copilul mosteneste parintele, trebuie sa apeleze constructorul din parinte cu  super()
    //cand copilul mosteneste parintele, copilul are acces la variabile/ metode din parinte (daca sunt publice/protectected)
    //Incapsulare- conceptul prin care restrictionam unele variabile/metode in momentul cand ies din zona din care au fost declarate
    //Restrictionarea se poate face folosind access control de tipul privated/protected
    //Polimorfism= conceptul prin care o metoda poate suferi modificari la nivel de continut sau definitie
    //Polimorfismul este doua feluri: dinamic (override) si static(overload)
    //Polimorfismul dinamic= int-o ierarhie de clase obtinute prin mostenire o metoda poate avea implementari diferite
    //Polimorfismul static: conceptul pe baza careia o metoda poate fi definita in functie de numarul / tipul de parametrii
    //Polimorfismul dinamic se aplica in momentul in care avem o legatura parinte copil
    //Polimorfismul static se aplica indiferent de circumstanta

   // public String marca;
    //public String model;
   // public String culoare;
   // public int an;
    //public double pret;

    private String marca; //access control dif de public, aceasta informatie va fi vizibila doar in locu in care am declarat-o.(capsulare)
    private String model;
    private String culoare;
    private int an;
    private double pret;

    public Masina(String marca, String model, String culoare, int an, double pret) {
        this.marca = marca;
        this.model = model;
        this.culoare = culoare;
        this.an = an;
        this.pret=pret;

    }

    public Masina(String marca, String model, String culoare, int an) {
        this.marca = marca;
        this.model = model;
        this.culoare = culoare;
        this.an = an;
    }

    public void infoMasina(){
        System.out.println("Marca masinii este: " + marca);
        System.out.println("Modelul masinii este: " + model);
        System.out.println("Culoarea masinii este: " + culoare);
        System.out.println("Anul masinii este: " + an);
        if(pret!=0) {
            System.out.println("Pretul masinii este: " + pret);
        }
    }

    //Polimorfism dinamic

    public void pornesteMasina(){
        System.out.println("Masina porneste cu cheie. ");

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }

    public double getPret() {
        return pret;
    }
}
