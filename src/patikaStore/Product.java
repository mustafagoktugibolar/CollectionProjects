package patikaStore;

public class Product {
    private int id;
    private String name;
    private Brand brand;
    private int storage;
    private double screen;

    public Product(int id, String name, Brand brand, int storage, double screen) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.storage = storage;
        this.screen = screen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public double getScreen() {
        return screen;
    }

    public void setScreen(double screen) {
        this.screen = screen;
    }
}
