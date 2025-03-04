package obiectConstructor;

public class Student {
    // constructor=are ca rol sa initializeze variabilele unei clase;
    //Intr-o clasa recunoastem un Constructor ca fiind o metoda publica care are exact acelasi nume cu clasa.
    //Pentru moment, un Constructor este public (poate fi si priviat- singletone)
    //Intr-o clasa putem avea mai multi Constructori diferentiati prin numarul sau tipul de parametrii
    //Exista 2 tipuri de constructori:Default (este in fiecare clasa, fara sa fie definit de noi) si cu Parametrii
    //Daca avem un parametru un Constructor care are acelasi nume cu o variabila din clasa=>le initializam folosind "This"
    //Obiecte= instanta unei clase
    //Dintr-o clasa putem defini o multime de obiecte
    //Aceste obiecte se diferentiaza prin numele lor
    //In momentul cand se initializaza un obiect, se apeleaza constructorul din clasa acestuia
    //Un obiect se initializeaza prin folosirea lui "new";
    //In momentul in care se creeaza un obiect, se aloca un spatiu dedicat in memorie pentru acesta care are structura clasei

    //declarare variabile
    public  String nume;
    public String prenume;
    public int varsta;
    public String facultate;
    public int an;

    //realizarea constructorului - are acelasi nume cu clasa
    public Student(int varsta, String nume, String prenume, String facultate, int an) {
        this.varsta = varsta;
        this.nume = nume;
        this.prenume = prenume;
        this.facultate = facultate;
        this.an = an;
    }

    public Student(String nume, String prenume, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public void prezentareStudent(){
        System.out.println("Numele studentului este: " + nume);
        System.out.println("Prenumele studentului este: " + prenume);
        System.out.println("Varsta studentului este: "+ varsta);

        if(varsta>35){
            System.out.println("Studentul nu va putea merge la facultate");}
        else
        { if(facultate!=null) {
                System.out.println("Facultatea studentului este: " + facultate);
                System.out.println("Anul in care este studentul este: " + an);
            }

        }


    }

}
