package structuri;

import org.testng.annotations.Test;

public class StructuriRepetitive {

    // Structuri repetitive= for, while

    @Test
    public void metodaTest() {
        afisareNrfor(50);
        afisareNrfordesc(50);
        afisaremnumerePare();
        afisareNrWhile(20);

    }

    //afisam primele n numere
    public void afisareNrfor(int capat) {
        for (int index=0; index<=capat; index++) {
            System.out.println("Numarul afisat este:" + index);
        }
    }

    //Afisam nr while

    public void afisareNrWhile(int capat){
        int index=0;
        while(index<=capat){
            System.out.println("numarul afisat este :" + index);
            index++;

        }
    }

    public void afisareNrfordesc(int capat) {
        for (int index =capat;index==0;index--) {
            System.out.println("Numarul afisat este:" +index);
        }
    }


    public void afisaremnumerePare(){
        for(int index=0; index<=50;index++){
            if (index%2==0) {
                System.out.println("Numarul par este:" + index);
            }
        }
    }

}
