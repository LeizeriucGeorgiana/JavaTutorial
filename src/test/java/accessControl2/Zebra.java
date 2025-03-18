package accessControl2;

import accesControl1.Animal;
//daca aplicam un obiect care este in afara pachetului,metoda protected nu mai este vizibila

public class Zebra {

    public void proba(){
        Animal animal = new Animal();
        animal.metodaPublica();
    }
}
