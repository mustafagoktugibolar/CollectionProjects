package patikaStore.Products;

public abstract class Product implements IProduct{
    protected Product() {
    }

    public abstract void display();
    public abstract void createDefaultProducts();

    private int id;
    private static int index = 1;
    private String name;
    private int brandID;
    private double price;
    private double discount;
    private int stock;
    private int memory;
    private int screenSize;
    private int ram;

    public Product(String name, int brandID, double price, double discount, int stock, int memory, int screenSize, int ram) {
        this.id = index;
        this.name = name;
        this.brandID = brandID;
        this.price = price;
        this.discount = discount;
        this.stock = stock;
        this.memory = memory;
        this.screenSize = screenSize;
        this.ram = ram;
        index++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBrandID() {
        return brandID;
    }

    public void setBrandID(int brandID) {
        this.brandID = brandID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}
