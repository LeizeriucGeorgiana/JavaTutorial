package variabilaMetoda;

import org.testng.annotations.Test;

public class Student {
    // clasa= sablon pe baza careia putem defini un exemplu din viata reala
    // intr-un fisier java recunoastem o clasa dupa cuvantul clasa
    // este obligatoriu pentru o clasa sa aibe nune
    // intr-un fisier java putem avea mai multe clase diferentiate prin numele acestora
    // nu este un best practice in java sa avem mai multe clase intr-un fisier
    // o clasa contine variabile si metode
    // variabila=  proprietatea unei clase
    //o variabila poate sau nu sa aibe o valoare
    //o variabila isi poate modifica valoarea
    // valoarea unei variabile se stabileste in functie de tipul de data
    // exista doua tipuri de variabile: globala si locala
    // O variabila globala se defineste specificand nivelul de vizibilitate (access control)
    // o variabila globala este vizibila in toata acea clasa
    //o variabila locala se defineste specificand tipul de data si un nume
    //o variabila locala este vizibila doar in locul in care am definit-o
    // metoda - actiunea specifica a unei clase
    // o clasa putem avea mai multe metode
    // exista doua tipuri de metode: void si return
    // recunoastem o metoda dupa: access control, tipul metodei,nume, (), {}
    // CTRL+ALT+L - cosmetizare text


    //DEFINIRE VARIABILA

    public String nume;
    public String prenume;
    public int varsta;
    public String adresa;
    public double inaltime;
    public float greutate;
    public char gen;
    public boolean areRestante;

      @Test  // comanda pentru a raliza o metoda de testare

      //DEFINIRE METODA

    public void prezentareStudent() {

        //definire valoare in functie de tipul de date

        nume = "Leizeriuc";
        prenume = "Georgiana";
        varsta = 33;
        adresa = "Strada sf. Maria, nr.45a";
        inaltime = 1.67;
        greutate = 60.5f;
        gen = 'F';
        areRestante = false;

        // afisarea datelor

        System.out.println("Prezentarea studentului este: " + nume + ' ' + prenume + ' ' + varsta);
        System.out.println("Adresa studentului este: " + adresa);
        System.out.println("Inaltimea studentului este: " + inaltime);
        System.out.println("Greutatea studentului este: " + greutate);
        System.out.println("Genul studentului este: " + gen);
        System.out.println("Studentul are restante? " + areRestante);
        calculMedie(6,7); // apelam metoda cu variabile locale
        calculMedie(9,5);
        calculMedie(7,10);
        calculMedie3(10,9,7);

      }

    //facem o metoda cu variabile locale
    public void calculMedie(double nota1, double nota2){

      double medie= (nota1 + nota2)/2;
      System.out.println("Media studentului este: " + medie);

    }
    public void calculMedie3(double nota1, double nota2,double nota3){

        double medie= (nota1 + nota2 +nota3)/3;
        System.out.println("Media studentului este: " + medie);

    }
}
