package patikaStore;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PatikaStore implements IStore{
    private final Scanner sc = new Scanner(System.in);
    private ArrayList<Brand> notebooks;
    private ArrayList<Brand> phones;
    private final String fuctionList = """
            -------------------------------------------------
            Patika Store Product Management Panel\s
            1 - List Products
            2 - List Brands
            3 - Admin
            0 - exit
            -------------------------------------------------""";

    public PatikaStore() {
        panel();
    }

    @Override
    public void displayBrands() {
        System.out.println("Brands func works");

    }

    @Override
    public <T> void displayProduct(ArrayList<T> products) {
        System.out.println("displayProduct func works");
    }

    @Override
    public void panel() {
        while (true) {
            try {
                System.out.println(fuctionList);
                System.out.print("Input : ");

                switch (sc.nextInt()) {
                    case 0 -> {
                        System.out.println("Leaving...");
                        try {
                            Thread.sleep(3000);
                            sc.close();
                            System.exit(0);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    case 1 -> System.out.println("case 1");
                    case 2 -> displayBrands();
                    case 3 -> admin();
                    default -> System.out.println("Invalid Input!!");
                }
            }catch (InputMismatchException e){
                System.out.println("Input Mismatch!!!");
                sc.nextLine();
            }
        }
    }


    @Override
    public void admin() {
        System.out.println("admin func works");
    }

}
