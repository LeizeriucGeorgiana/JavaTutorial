package tema;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TemaLista {
    @Test

    public void carte(){
        retete();


    }
    public void retete(){

        Map<String, List<String>> retete=new HashMap<>();

        //creare si adaugare elemente intr-o lista
        List<String>retetaCheeseCake= Arrays.asList("Crema de branza", "Ciocolata alba", "Unt","Biscuiti","Zahar");
        List<String>retetaClatite= Arrays.asList("Apa minerala", "Oua", "Ulei","Faina","Zahar","Esenta de vanilie");
        List<String>retetaChec= Arrays.asList("Cacao", "Oua", "Ulei","Faina","Zahar","Esenta de vanilie");
        List<String>retetaPlacintaCuMere= Arrays.asList( "Oua", "Ulei","Unt","Mere","Faina","Scortisoara","Zahar","Esenta de vanilie");
        List<String>retetaBrioseCuCiocolata= Arrays.asList("Oua","Iaurt","Ulei","Cacao","Fulgi de ciocolata","Faina","Zahar","Esenta de vanilie");

        //creeaza legatura dintre numele cheiei si lista pe care dorim sa o atribuim acelei chei
        retete.put("CheeseCake", retetaCheeseCake);
        retete.put("Clatite", retetaClatite);
        retete.put("Chec", retetaChec);
        retete.put("Placinte cu mere", retetaPlacintaCuMere);
        retete.put("CheeseCake", retetaCheeseCake);
        retete.put("Briose cu ciocolata", retetaBrioseCuCiocolata);

        for(String key: retete.keySet()){//pentru fiecare cheie din setul de chei
            System.out.println("Reteta este : "+ key);// afisam care este cheia
            System.out.println("Ingredientele sunt: "+retete.get(key));//afisam lista pe baza cheiei

        }
    }





}
