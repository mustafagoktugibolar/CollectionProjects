package patikaStore.Products;

public class NoteBook extends Product{
    public NoteBook() {
        createDefaultProducts();
    }

    @Override
    public void display() {
        System.out.println("display notebook!");
    }


    @Override
    public void createDefaultProducts() {

    }


}
