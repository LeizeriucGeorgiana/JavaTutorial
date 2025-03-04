package obiectConstructor;

import org.testng.annotations.Test;

public class StudentTest {
    @Test

    public void testmethod(){
        Student Leizeriuc= new Student(33,"Leizeriuc","Georgiana","IEEI Iasi", 4);
        Leizeriuc.prezentareStudent();
        System.out.println();

        Student Razvan= new Student (39,"Jude","Razvan","Chimie",3);
        Razvan.prezentareStudent();
        System.out.println();

        Student Alex= new Student ("Dorha","Alex",34);
        Alex.prezentareStudent();
        System.out.println();

        //Adaugam valori la variabilele ce lipseau
        Alex.varsta=31;
        Alex.facultate="IT";
        Alex.an=1;
        Alex.prezentareStudent();
    }
}
