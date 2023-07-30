package patikaStore.Brands;

import patikaStore.Store.PatikaStore;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;


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

    //CREATE DEFAULT BRANDS
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    //ADD BRAND
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
    //REMOVE BRAND VIA ID
    public void removeBrand(){
        try {
            PatikaStore.sc.nextLine();
            System.out.print("Brand ID : ");
            int dID = PatikaStore.sc.nextInt();

            if (doesContains(dID)) {
                int index = findIndex(dID);
                System.out.println(dID + " - " + brandList.get(index).getName() + " Named Brand Removed!");
                brandList.remove(index);
                compareList();
            }
            else {
                System.out.println("Brand Doesn't Exists!");
            }
        }
        catch (InputMismatchException e){
            System.out.println(e.getMessage());
            PatikaStore.sc.nextLine();
        }
    }
    //EDIT BRAND VIA ID
    public void editBrand(){
        try {
            System.out.print("Brand ID : ");
            int eID = PatikaStore.sc.nextInt();
            PatikaStore.sc.nextLine();

            if (doesContains(eID)) {
                int index = findIndex(eID);
                System.out.print("New Name of " + brandList.get(index).getName() + " : ");
                String newName = PatikaStore.sc.nextLine();

                System.out.println(brandList.get(index).getId() + " - "
                        + brandList.get(index).getName() + " Changed to " + newName);
                brandList.get(index).setName(newName);
                compareList();
            }
            else {
                System.out.println("Brand Doesn't Exists!");
            }
        }
        catch (InputMismatchException e){
            System.out.println(e.getMessage());
            PatikaStore.sc.nextLine();
        }
    }

    //CHECK DOES THE LIST HAVE THE OBJECT FROM NAME
    private boolean doesContains(String input){
        for (Brand brand: brandList) {
            if(brand.getName().equals(input)){
                return true;
            }
        }
        return  false;
    }
    //CHECK DOES THE LIST HAVE THE OBJECT FROM ID
    private boolean doesContains(int input){
        for (Brand brand: brandList) {
            if(brand.getId() == input){
                return true;
            }
        }
        return  false;
    }
    //FIND THE INDEX OF A BRAND FROM IT'S ID
    private int findIndex(int input){
        for (int i = 0; i < brandList.size() ; i++) {
            if(brandList.get(i).getId() == input){
                return i;
            }
        }
        return  0;
    }

    //SORT BRAND LIST ASC
    public void compareList(){
        //Comparator<Brand> nameComparator = Comparator.comparing(Brand::getName);
        Comparator<Brand> nameComparator = (brand1, brand2) ->
                brand1.getName().compareToIgnoreCase(brand2.getName());
        brandList.sort(nameComparator);
    }

}
