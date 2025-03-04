package practiceOOP;

import org.testng.annotations.Test;

public class PracticeOOP {

    @Test
    public void metodaTest(){
        Tenis SimonaHalep= new Tenis("Halep","Simona",30,"Tenis",2,10);
        SimonaHalep.infoSportiv();
        System.out.println();

        Fotbalist Dragusin=new Fotbalist("Dragusin","Alex",27,"Fotbal","Romania","Aparator");
        Dragusin.infoSportiv();
    }

}
