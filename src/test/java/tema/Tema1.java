package tema;

import org.testng.annotations.Test;

public class Tema1 {

    @Test

    public void afisare(){
        hello();
        varsta();
        nume();
        salut();
        concatenare();
        sir();
        salariuAndrei();
        salariuPopescu();


    }
    //afisare mesaj
    public void hello() {
        String mesaj = "Hello world";
        System.out.println(mesaj);
        System.out.println(mesaj+ " Poti pleca acasa dupa ce iti termini munca");;
    }
    //afisare varsta
    public void varsta() {
        int varsta;
        varsta = 33;
        System.out.println("Vartsta de: " + varsta);
        System.out.println("Vartsta de: " + varsta+ " Poti pleca acasa dupa ce iti termini munca ");
    }
    //afisare nume si prenume
    public void nume() {
        String nume;
        String prenume;
        nume = "Leizeriuc";
        prenume = "Georgiana";
        System.out.println("Numele si prenumele este:" + nume + " " + prenume);
        System.out.println("Numele si prenumele este:" + nume + " " + prenume + " Poti pleca acasa dupa ce iti termini munca");
    }
//afisare mesaj "salut" cu adaugarea caract. "M" la finalul cuvantului
    public void salut() {
        String sir1 = "Salut";
        String sir2 = "M";
        String sir3 = sir1.concat(sir2);
        System.out.println(sir3);
        System.out.println(sir3 +" Poti pleca acasa dupa ce iti termini munca");
    }
// afisare mesaj " Hello"  cu adaugarea caracterului "H" la inceputul cuvantului
    public void concatenare() {

        String sir4 = "Hello";
        String sir5 = "H";
        String sir6 = sir5.concat(sir4);
        System.out.println(sir6);
        System.out.println(sir6+" Poti pleca acasa dupa ce iti termini munca");

    }
    //adaugarea caracterului "r" la finalul fiecarei cuvant ce se termina intr-o vocala
    public void sir () {
        String fraza = "Ana are mere, pere, prune";

        // Impartim fraza in cuvinte
        String[] cuvinte = fraza.split(" ");

        // Parcurgem fiecare cuvant
        for (int i = 0; i < cuvinte.length; i++) {
            // Verificam daca ultimul caracter al cuvantului este o vocala
            if (esteVocala(cuvinte[i].charAt(cuvinte[i].length() - 1))) {
                // Adaugam caracterul 'z' la finalul cuvantului
                cuvinte[i] = cuvinte[i] + "z";
            }
        }

        // Construim fraza modificata
        String frazaModificata = String.join(" ", cuvinte);

        // Afisam rezultatul
        System.out.println(frazaModificata);
    }

    public static boolean esteVocala(char c) {
        char[] vocale = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for (char v : vocale) {
            if (c == v) {
                return true;
            }
        }
        return false;
    }


    //Afisam salariul unui angajat daca acesta are prenumele Andrei
    public static void salariuAndrei() {
        String prenumeAngajat = "Andrei";  // Prenumele angajatului
        float salariul = 2000;  // Salariul angajatului

        if (prenumeAngajat.equals("Andrei")) {
            System.out.println("Angajatul " + prenumeAngajat +" are salariul de: " + salariul);
        } else {
            System.out.println("Prenumele nu este Andrei.");
        }
    }
//afisam id si salariul daca numele este Popescu
    public static void salariuPopescu() {
        String NumeAngajat = "Popescu";  // Prenumele angajatului
        float salariul = 2500;  // Salariul angajatului
        int id= 112;

        if (NumeAngajat.equals("Popescu")) {
            System.out.println("Angajatul " + NumeAngajat + " are ID:  "+id+" si salariul de: " + salariul);
        } else {
            System.out.println("Numele nu este Popescu.");
        }
    }
//Afisam numarul departamentului daca acesta este mai mare decat 287
    public void departament() {
        int nrdepartament = 300;
        if (nrdepartament > 287) {
            System.out.println("Numarul departamentului este: " + nrdepartament);
        } else {
            System.out.println(" Numarul departamentului este mai mic");
        }
    }
    //rezolvarea ecuatie
    public  void ecuatie() {
        double rezultat = (2 + (3 * 4) - 3) / 3.0;
        System.out.println("Rezultatul ecuatiei este: " + rezultat);
    }


}
