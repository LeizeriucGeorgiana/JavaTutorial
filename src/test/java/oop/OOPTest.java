package oop;

import org.testng.annotations.Test;

import java.util.Arrays;

public class OOPTest {
    @Test
    public void testMethod(){
        RangeRover aliceSport= new RangeRover("Range Rover","Sport","negru",
                2023, Arrays.asList("Aer conditionat","Geamuri electrice","Oglizi incalzite"));
        aliceSport.infoRangeRover();//
        aliceSport.pornesteMasina();
        aliceSport.promotii();

        System.out.println();

       RangeRover alexSport=new RangeRover("Range Rover","Sport","negru",2023,50000,
               Arrays.asList("Aer conditionat","Geamuri electrice","Oglizi incalzite"));
       alexSport.infoRangeRover();
        System.out.println();
        alexSport.setCuloare(" Verde");
        alexSport.infoRangeRover();
        System.out.println(alexSport.getPret());
        alexSport.pornesteMasina();
        alexSport.promotii(5);


        System.out.println();

        Audi aliceA3= new Audi("Audi","A3","gri",2024,
                Arrays.asList("Oglinzi incalzite"), Arrays.asList("Dezumidificator", "improspatare aer"));
        aliceA3.infoAudi();
        aliceA3.pornesteMasina();

        System.out.println();

        Audi aliceA5=new Audi("Audi","A5","GRI",2024, 45000.60,Arrays.asList("Oglinzi incalzite"),
                Arrays.asList("Dezumidificator", "improspatare aer"));
        aliceA5.infoAudi();
        aliceA5.pornesteMasina();




    }
}
