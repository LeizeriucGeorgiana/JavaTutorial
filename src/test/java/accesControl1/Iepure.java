package accesControl1;

public class Iepure extends Animal{
//metoda proba apeleaza alte trei metode, din cadrul aceluiasi pachet, cu diferite tipuri de accesibilitate, metoda protected nu este vizibila

    public void proba(){
        metodaDefault();
        metodaProtected();
        metodaPublica();
    }
}