package patikaStore;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PatikaStore implements IStore{
    public static final Scanner sc = new Scanner(System.in);

    private Brand brand;
    private final String funcList = """
            -----------------------------------------------------------------
            Patika Store Product Management Panel\s
            1 - List Products
            2 - List Brands
            3 - Admin
            0 - Exit
            -----------------------------------------------------------------""";

    public PatikaStore() {
        brand = new Brand();
        panel();


    }

    @Override
    public void displayBrands() {
        System.out.println("Our Brands\n" +
                "-----------------------------------------------------------------");
        for (Brand br : brand.getBrandList()) {
            System.out.println(br.getId() + " - " + br.getName());
        }

    }

    @Override
    public <T> void displayProduct(ArrayList<T> products) {
        System.out.println("displayProduct func works");
    }

    @Override
    public void panel() {
        while (true) {
            try {
                System.out.println(funcList);
                System.out.print("Input : ");

                switch (sc.nextInt()) {
                    case 0 -> {
                        System.out.println("Leaving...");

                            Thread.sleep(3000);
                            sc.close();
                            System.exit(0);

                    }
                    case 1 -> System.out.println("case 1");
                    case 2 -> displayBrands();
                    case 3 -> admin();
                    default -> System.out.println("Invalid Input!!");
                }
            }catch (InputMismatchException e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }


    @Override
    public void admin() {
        boolean on = true;
        while (on) {
            try {
                String funcs = """
                        Functions
                         -----------------------------------------------------------------
                        1 - Add Brand
                        2 - Remove Brand
                        3 - Edit Brand
                        4 - Add Product
                        5 - Remove Product
                        6 - Edit Product
                        0 - Exit to Menu""";

                System.out.println(funcs);

                System.out.print("Input : ");


                switch (sc.nextInt()) {
                    case 0 ->{
                        System.out.println("Leaving...");
                        Thread.sleep(1500);
                        on = false;

                    }
                    case 1 -> brand.addBrand();
                    case 2 -> brand.removeBrand();
                    case 3 -> brand.editBrand();
                    default -> System.out.println("Invalid Input!!");
                }

            }catch (InputMismatchException e){
                System.out.println("input mismatch!, Try Again.");
                sc.nextLine();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }

        }
    }

}
