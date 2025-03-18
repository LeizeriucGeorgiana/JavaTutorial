package accessControl2;

import accesControl1.Animal;
//mostenire clasa dintr-un alt pachet
//defoult isi pierde vizibilitatea cand iese din pachetul initial

public class Pisica extends  Animal {

    public void proba(){
        metodaProtected();
        metodaPublica();
    }
}
