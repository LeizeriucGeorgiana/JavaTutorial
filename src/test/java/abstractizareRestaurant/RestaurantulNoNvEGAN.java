package abstractizareRestaurant;

public class RestaurantulNoNvEGAN extends Restaurant implements NonVegan{
    public RestaurantulNoNvEGAN(String nume, String adresa, String brand) {
        super(nume, adresa, brand);
    }

    @Override
    public void ingredienteNonVegan() {
        System.out.println("Toate ingredientele sunt nonvegane");
    }

    @Override
    public void tipCarne() {
        System.out.println("Avem o gama variata de carne");

    }

    @Override
    public void tipPeste() {
        System.out.println("Avem o gama variata de peste");

    }
}
