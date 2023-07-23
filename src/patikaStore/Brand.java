package patikaStore;

import java.util.ArrayList;
import java.util.Comparator;


public class Brand {
    private ArrayList<Brand> brandList;
    private String name;
    private int id;
    private static int index = 1;



    public Brand(String name) {
        this.name = name;
        this.id = index;
        index++;

    }
    public Brand(){
        brandList = new ArrayList<>();
        createDefaultBrands();
    }

    private void createDefaultBrands(){
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
    }


    public  ArrayList<Brand> getBrandList() {
        return brandList;
    }

    public void addBrand(){
        PatikaStore.sc.nextLine();
        System.out.print("New Brand : ");
        String newName = PatikaStore.sc.nextLine();
        if(!doesContains(newName)){
            brandList.add(new Brand(newName));
            System.out.println(newName + " Named Brand Added!");
            compareList();
        }
        else{
            System.out.println("Brand Already Exists");
        }

    }
    public void removeBrand(){
        System.out.println("deleted!");
        compareList();
    }
    public void editBrand(){
        System.out.println("edited!");
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

    private boolean doesContains(String input){
        for (Brand brand: brandList) {
            if(brand.getName().equals(input)){
                return true;
            }
        }
        return  false;
    }

    public void compareList(){
        //Comparator<Brand> nameComparator = Comparator.comparing(Brand::getName);
        Comparator<Brand> nameComparator = (brand1, brand2) ->
                brand1.getName().compareToIgnoreCase(brand2.getName());
        brandList.sort(nameComparator);
    }

}
