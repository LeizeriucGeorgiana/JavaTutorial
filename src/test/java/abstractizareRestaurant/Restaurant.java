package abstractizareRestaurant;

public class Restaurant {

    private String nume;
    private String adresa;
    private String program;

    public Restaurant(String nume, String adresa, String brand) {
        this.nume = nume;
        this.adresa = adresa;
        this.program = program;
    }

    public void infoRestaurant(){
        System.out.println("Numele Restaurantului este: " + nume);
        System.out.println("Adresa restaurantului este: " + adresa);
        System.out.println("Programul restaurantului" + program);
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getBrand() {
        return program;
    }

    public void setBrand(String brand) {
        this.program = brand;
    }
}
