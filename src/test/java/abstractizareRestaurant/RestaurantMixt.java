package abstractizareRestaurant;

public class RestaurantMixt extends Restaurant implements NonVegan,Vegan{
    
    public RestaurantMixt(String nume, String adresa, String brand) {
        super(nume, adresa, brand);
    }

    @Override
    public void ingredienteNonVegan() {

    }

    @Override
    public void tipCarne() {

    }

    @Override
    public void tipPeste() {

    }

    @Override
    public void ingredienteVegan() {

    }

    @Override
    public void chelnerVegan() {

    }

    @Override
    public void bucatarVegan() {

    }
}
