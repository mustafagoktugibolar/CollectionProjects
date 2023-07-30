package patikaStore.Products;

import java.util.ArrayList;
import java.util.List;

public class CellPhone extends Product{

    private String color;
    private double battery;
    private int cam;

    private List<CellPhone> cellPhones;


    public CellPhone() {
        cellPhones = new ArrayList<>();
        createDefaultProducts();
    }

    public CellPhone(String name, int brandID, double price, double discount, int stock, int memory, int screenSize, int ram, String color, double battery, int cam) {
        super(name, brandID, price, discount, stock, memory, screenSize, ram);
        this.color = color;
        this.battery = battery;
        this.cam = cam;
    }

    @Override
    public void display() {
        for (CellPhone phone: cellPhones) {
            System.out.println(phone.getName());
        }
    }

    @Override
    public void createDefaultProducts() {
        cellPhones.add(new CellPhone("SAMSUNG GALAXY A51", 1,6199, 20,250, 128, 5, 4, "Blue", 4200, 3));
        cellPhones.add(new CellPhone("iPhone 11 64 GB", 3,17000, 15,450, 64, 6, 6, "White", 3400, 2));
        cellPhones.add(new CellPhone("Redmi Note 10 Pro 8GB", 8,9199, 25,500, 128, 5, 8, "Purple", 5250, 4));

    }



}
