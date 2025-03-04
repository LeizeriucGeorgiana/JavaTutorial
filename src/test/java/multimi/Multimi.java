package multimi;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.*;

public class Multimi {

    //multimi= array, list,set, map
 @Test

    public void metodateste(){

    // numeCursantiArray();
     //numeCursantiLista();
     exemplu1Map();
     exemplu2Map();

    }
    //afisam numele cursantilor de la curs
    public void numeCursantiArray()
    {
    String[] cursanti =new String[4]; //definire o multime goala
        cursanti[0]="Georgiana";
        cursanti[1]="ANA";
        cursanti[2]="Alex";
        cursanti[3]="Bianca";

        int index=0;
        while(index<cursanti.length)
        {
            if(index<5){
                System.out.println("Numele cursantului este: "+ cursanti[index]);
            }
            index++;}
    }
    public void numeCursantiLista(){
     List<String> cursanti=new ArrayList<>();//crearea unei liste goale
     cursanti.add("Georgiana");//functie de adaugare sir
     cursanti.add("Andrei");
     cursanti.add("Adriana");
     cursanti.add("Eveline");
     cursanti.add("Cristi");

     int index=0;
     while(index<cursanti.size()){//
         System.out.println("Numele cursantului este: "+ cursanti.get(index));
         index++;
     }
    }
    //definim niste categorii de valori
    public void exemplu1Map(){
        Map<String,String> obiecte=new HashMap<>();//declaram un Map gol
        obiecte.put("Telefon","iPhone"); //adaugam key si valori
        obiecte.put("Masina","Toyota");
        obiecte.put("Fruct","Mar");

        for(String key: obiecte.keySet()){//pentru fiecare cheie din setul de chei
            System.out.println("Cheia este : "+ key);// afisam care este cheia
            System.out.println("Valoarea cheiei este: "+obiecte.get(key));//afisam valoarea pe baza cheiei
        }
    }
    //afisam orasele cu tara din care provin
    public void exemplu2Map(){
     Map<String,List<String>> tariOrase=new HashMap<>();

     //creare si adaugare elemente intr-o lista
        List<String>oraseRomania= Arrays.asList("Cluj", "Iasi", "Bacau","Timisoara");
        List<String>oraseItalia=Arrays.asList("Bologna","Milano","Torino","Roma");
        List<String>oraseSpania= Arrays.asList("Valencia","Barcelona","Madrid");

        tariOrase.put("Romania", oraseRomania);//creeaza legatura dintre numele cheiei si lista pe care dorim sa o atribuim acelei chei
        tariOrase.put("Italia", oraseItalia);
        tariOrase.put("Spania", oraseSpania);

        for(String key: tariOrase.keySet()){//pentru fiecare cheie din setul de chei
            System.out.println("Tara este : "+ key);// afisam care este cheia
            System.out.println("Orasele sunt: "+tariOrase.get(key));//afisam lista pe baza cheiei
        }

    }
}
