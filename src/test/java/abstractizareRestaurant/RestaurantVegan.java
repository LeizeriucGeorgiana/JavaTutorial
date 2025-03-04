package abstractizareRestaurant;

public class RestaurantVegan extends Restaurant implements Vegan{


    public RestaurantVegan(String nume, String adresa, String brand) {
        super(nume, adresa, brand);
    }

    @Override
    public void ingredienteVegan() {
        System.out.println("Toate ingredientele sunt vegane");
    }

    @Override
    public void chelnerVegan() {
        System.out.println("Chelnerul are experienta pentru restaurantele vegane");

    }

    @Override
    public void bucatarVegan() {
        System.out.println("Bucatarul are experienta pentru restaurantele vegane");

    }
}
