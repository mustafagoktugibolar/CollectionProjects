package patikaStore;

import java.util.ArrayList;

public interface IStore {
    void displayBrands();
    <T> void displayProduct(ArrayList<T> products);
    void panel();
    void admin();

}
