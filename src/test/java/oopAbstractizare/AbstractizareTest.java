package oopAbstractizare;

import org.testng.annotations.Test;

public class AbstractizareTest {

    @Test
    public void metodaTest(){
        ElevPersoana Obiect1=new ElevPersoana("Leizeriuc","Georgiana",33,"IEEI",1);
        Obiect1.infoElev();

        AngajatPersoana Obiect2=new AngajatPersoana("Leizeriuc","Georgiana",33,"Phinia","5 ani",5000);
        Obiect2.infoAngajat();

        ElevAngajat Obiect3= new ElevAngajat("Leizeriuc","Georgiana",33,"Eminescu",10,"Phinia","9 ani",5000);
        Obiect3.infoPersoana();
        System.out.println();

    }

}
