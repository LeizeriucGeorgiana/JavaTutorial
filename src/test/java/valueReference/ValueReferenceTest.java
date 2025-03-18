package valueReference;

import org.testng.annotations.Test;

public class ValueReferenceTest {
    //variabilele pot fi primitive si nonprimitive
    //primitive= un tip de data predefinit care poate doar sa primeasca o valoare specifica
    //exemple primitive:int,double, float,char,boolean,byte
    //exemple de nonprimitive:string,orice instantiere care se face cu "new"(liste,multimi..)
    //wrapper class este o noua implementare ce este construita pe implementarea veche
    //ex wrapper class= Integer,Double, Float,Character,Boolean


    public Integer varsta=10; //valoare primitiva
    public String nume="Georgiana"; //valoare non-primitiva
    //definire
    public StringBuilder prenume= new StringBuilder("Georginana");

    @Test
    public void testMethod(){
        System.out.println("Valoarea initiala este: "+ varsta);
        calcul(varsta);
        //dupa aceasta functie , parametrul varsta revine la valoarea definita anterior
        System.out.println("Valoarea initiala este: "+ varsta);
        System.out.println();

        System.out.println("Valoarea initiala este: "+ nume);
        concatenare(nume);
        System.out.println("Valoarea initiala este: "+ nume);
        System.out.println();

        System.out.println("Valoarea initiala este: "+ prenume);
        concatenare(prenume);
        System.out.println("Valoarea initiala este: "+ prenume);//nonprimitiva salveaza valoarea modificata din metoda
        System.out.println();

        double a=12.34;
        System.out.println(Integer.valueOf((int)a));
        //(int)a =Aceasta este o conversie a obiectului a într-un tip primitiv int.
        //Integer.valueOf((int)a = este o metodă statică a clasei Integer care primește un int și returnează un obiect de tip Integer.
    }

    public void calcul(Integer val){
        val = val +5;
        System.out.println("Valoarea noua este: " +val);
    }

    public void concatenare(String value){
        value = value +" Leizeriuc ";
        System.out.println("Valoarea noua este: " +value);
    }

    public void concatenare(StringBuilder val){
        val.append(" Dorha");//adauga un sir de caractere la sfarsitul string-ului existent
        System.out.println("Valoarea noua este: " +val);
    }
}
