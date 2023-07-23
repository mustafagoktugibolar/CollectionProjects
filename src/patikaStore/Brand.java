package patikaStore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Brand {
    private static ArrayList<Brand> brandList;
    private String name;
    private int id;
    private static int index = 1;

    public Brand(String name) {
        this.name = name;
        this.id = index;
        index++;
    }

    public static ArrayList<Brand> brands(){
        brandList = new ArrayList<>();
        brandList.add(new Brand("Samsung"));
        brandList.add(new Brand("Lenovo"));
        brandList.add(new Brand("Apple"));
        brandList.add(new Brand("Huawei"));
        brandList.add(new Brand("Casper"));
        brandList.add(new Brand("Asus"));
        brandList.add(new Brand("HP"));
        brandList.add(new Brand("Xiaomi"));
        brandList.add(new Brand("Monster"));
        compareList();
        return  brandList;
    }
    public static void compareList(){
        Comparator<Brand> nameComparator = Comparator.comparing(Brand::getName);
        Collections.sort(brandList, nameComparator);
    }
    public static void addBrand(String name){
        if(brandList.contains(name)) {
            brandList.add(new Brand(name));
        }
        else{
            System.out.println("Brand already exists!");
        }
        compareList();
    }
    public static void removeBrand(int id){
        brandList.remove(id);
        compareList();
    }
    public static void removeBrand(String name){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

}
