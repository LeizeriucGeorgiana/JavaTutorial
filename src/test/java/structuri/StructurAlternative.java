package structuri;

import org.testng.annotations.Test;

public class StructurAlternative {
    //Exista doua tipuri de structuri in programare:Alternative sau repetitive
    //structuri alternative: if...else; Swich...case;

    @Test
    public void metodaTest() {
        afisamNrMaiMare(10,14);
        afisamNrMaiMare(15,10);
        afisamNrMaiMare(10,10);
        verificamNumarDivizibil5(50);
        verificamNumarDivizibil5(55);

        afisamZileleSatpamanii(4);
    }

//afisam numarul mai mare dintre doua valori;

    public void afisamNrMaiMare(int nr1, int nr2) {
     if(nr1==nr2){
         System.out.println("Cele doua numere sunt egale.");
     } else if(nr1>nr2) {
         System.out.println("Numarul mai mare este:" + nr1);}

     else
     {System.out.println("Numarul mai mare este :" + nr2);
     }
    }

    //verificam ca un numar este divizibil cu 5
    public void verificamNumarDivizibil5(int nr){
        if(nr%5==0)
        { System.out.println("Numarul este divizibil cu 5");}
    }

    //afisam zilele saptamanii
    public void afisamZileleSatpamanii(int zi){
        switch (zi){
            case 1:
                System.out.println("Astazi este luni");
                break;
            case 2:
                System.out.println("Astazi este marti");
                break;
            case 3:
                System.out.println("Astazi este miercuri");
                break;
            case 4:
                System.out.println("Astazi este joi");
                break;
            case 5:
                System.out.println("Astazi este vineri");
                break;
            case 6:
                System.out.println("Astazi este sambata");
                break;
            case 7:
                System.out.println("Astazi este Duminica");
                break;
        }
    }

}