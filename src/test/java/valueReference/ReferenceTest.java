package valueReference;

import org.testng.annotations.Test;

public class ReferenceTest {
    @Test
    public void methodTest(){
        // Creăm un obiect al clasei Curs
        Curs curs= new Curs();//afiseaza 0
        curs.info(); //afiseaza null
        curs.id=10;
        curs.info();
        curs.id=5;
        curs.info();
    }
}
