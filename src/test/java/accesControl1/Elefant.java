package accesControl1;

public class Elefant {
    public void proba(){

        Animal animal = new Animal();
        animal.metodaDefault();
        animal.metodaProtected();
        animal.metodaPublica();
    }

    //cand se fac actiuni, in acelasi pachet, intre metodele public,default si public nu este nici o diferenta, insa metoda private nu iese din clasa respectiva indiferent ca vb de mostenire sau obiect
}
