package staticKeyword;

import org.testng.annotations.Test;

public class StaticTest {
    @Test
    public void testMethod(){
        Elev Georgiana= new Elev("Leizeriuc","Georgiana",33);
        Georgiana.infoElev();
        System.out.println();

        Elev Alina= new Elev("Leizeriuc","Alina",26);
        Alina.infoElev();
        System.out.println();
    }
}
