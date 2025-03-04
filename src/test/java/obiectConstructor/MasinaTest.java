package obiectConstructor;

import org.testng.annotations.Test;

public class MasinaTest {
    @Test
    public void testMethod(){
        Masina Toyota= new Masina("Corolla","1.6",2024,50000);
        Toyota.afisezDetalii();

        System.out.println();

        Masina Dacia= new Masina("Dacia","200",5500);
        Dacia.afisezDetalii();


    }
}
