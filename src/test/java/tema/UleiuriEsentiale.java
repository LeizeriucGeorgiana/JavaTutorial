package tema;

import org.testng.annotations.Test;

public class UleiuriEsentiale {
    //definire variabile

    public String nume;
    public String extractie;
    public String proprietati;
    public char modUtilizare;
    public int gramaj;
    public boolean esteFotosensibil;
    public String beneficii;
    public boolean trebuieDiluat;
    public String ingredient;
    public float pret;
@Test
    //definim metoda
    public void prezentareUleiuri(){
        nume= "copaiba";
        extractie= "rasina";
        proprietati= "antiinflamator";
        modUtilizare='T'; //T=topic
        gramaj=15;
        esteFotosensibil= false;
        beneficii= " reduce durerea";
        trebuieDiluat=false;
        ingredient="beta_carofilena";
        pret=240.52f;

    //afisare date

        System.out.println("Numele uleiului esential este: " + nume);
        System.out.println("Extractia uleiului este din:" + extractie);
        System.out.println("Principala proprietate a uleiului este:" +proprietati);
        System.out.println("Se poate utiliza:" + modUtilizare);
        System.out.println("Gramajul este de:" + gramaj +"ml");
        System.out.println("Uleiul este fotosensibil? " + esteFotosensibil);
        System.out.println("Beneficii:"+ beneficii);
        System.out.println("Trebuie diluat? "+ trebuieDiluat);
        System.out.println("Principalul ingredient este:" + ingredient);
        System.out.println("Pretul este de " + pret+" lei");
}
}
