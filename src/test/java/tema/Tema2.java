package tema;

import org.testng.annotations.Test;

import java.util.Scanner;

public class Tema2 {

    @Test
    public void afisaredate(){
        cuvant();
        numere();
        maxim(15,20);
        minim(4.5,3.25);
        sirParImpar(10);
        sirImpar(10);
        sirPar();
        div5versiunea1(20);
        div5primele3numere();
        suma();
        sumasir();
        produssir();
    }
    //afisarea unui cuvant de 5 ori pe acelasi rand cu un spatiu intre
    public void cuvant() {
        String cuvant = "DA";

        for (int i = 0; i < 5; i++) {
            System.out.print(cuvant);
            if (i <= 4) {
                System.out.print(" ");
            }
        }
    }
// Afisarea primelor 3 numere de la 1 la 3
    public static void numere() {
        System.out.println(" ");
        System.out.print("Primele trei numere sunt:");
        for (int x = 1; x <= 3; x++) {
            System.out.print( x);
        }
    }
    // Afisam numarul cel mai mare dintre 15 si 25
    public void maxim( int a,int b){

        if(a>b){
            System.out.println(" ");
            System.out.println("Cel mai mare numar este:"+a);
        }
        else
        {
            System.out.println(" ");
            System.out.println("Cel mai mare numar este:" +b);
        }
    }
    //afisarea numarulu minim
    public void minim(double c, double d){
        if(c<d){
            System.out.println(" ");
            System.out.println("Cel mai mic numar este:"+c);
        }
        else
        {
            System.out.println(" ");
            System.out.println("Cel mai mic numar este:" +d);
        }

    }
    //afisaerea numerelor pare si a numerelor impare
    public void sirParImpar(int n) {

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " este numar par");
            } else {
                System.out.println(i + " este num10ar impar");
            }
        }
    }
    // Afisarea unui sir de numere impar
    public void sirImpar(int m){
        System.out.println(" ");
        System.out.print("Sirul de numere impare este:");

        for (int index1 =0;index1<=m; index1++)
        {
                if(index1 % 2 !=0) {
                    System.out.print(index1);
                }

        }
    }
//afisarea unui sir de numere pare
    public void sirPar(){
        System.out.println(" ");
        System.out.print("Sirul de numere pare este:");

        for (int index2 =0;index2<=10; index2++)
        {
            if(index2 % 2 ==0) {
                System.out.print(index2);
            }

        }
    }

    //afisarea numerelor divizibile cu 5
    public void div5versiunea1(int n){
        System.out.println(" ");

        // Afișarea numerelor divizibile cu 5 în intervalul dat
        System.out.print("Numerele divizibile cu 5 între sunt:");
        for (int i = 0; i <= n; i++) {
            if (i % 5 == 0) {
                System.out.print(i +" ");
            }
        }
    }
    //afisarea primelor trei numere divizibile cu 5
     public void div5primele3numere()
    {
        System.out.println(" ");
        int count=0;
        int z=0;
        // Afișarea numerelor divizibile cu 5 în intervalul dat
        System.out.print("Primele trei numere divizibile cu 5 între sunt:");
         while (count<=3)
        {
            if(z %5==0)
            {
                System.out.print(z + " ");
                count++;
            }
            z++;
        }
    }

    //afisarea sumei a doua numere
    public void suma(){
        System.out.println(" ");

        int nr1=235;
        int nr2=10;
        int s=nr1+nr2;
        System.out.println("Suma numerelor este:"+s);
    }
    //afisare suma unui sir
    public void sumasir()
    {
        int suma=0;
        for(int pas=0;pas<=10;pas++) {
            suma = suma + pas;
        }
    System.out.println("Suma primelor 10 numere este: "+ suma);
    }
    //afisarea produsului a primelor 5 numere
    public void produssir()
    {
        int produs=1;
        for(int y=1;y<=5;y++)
        {produs=produs*y;}
      System.out.println("Produsul primelor 5 numere este: "+ produs);

    }
}




