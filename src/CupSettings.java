import java.util.ArrayList;
import java.util.Scanner;

public class CupSettings {
    private final ArrayList<Cup> drinkOrderArray;

    public CupSettings(){
        drinkOrderArray= new ArrayList<>();
    }

    public void mainManu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hey what do you want to do?");
        System.out.println("1. Order a drink");
        System.out.println("2. See all orders");
        System.out.println("3. Delete all orders");
        System.out.println("0. Close program");
        int optionMainMenu = scanner.nextInt();

        switch (optionMainMenu){
            case 1->orderADrink();
            case 2->seeAllOrders();
            case 3->deleteAllOrders();
            case 0->{
                System.out.println("Exting...");
                System.exit(0);
            }


        }


    }
    public void orderADrink(){
        Scanner scanner = new Scanner(System.in);
        boolean cupFøldeskum = false;
        String drinkSize = "standart";
        System.out.println("What would you like to order?");
        System.out.println("Options: Sort kaffe, Espresso, Dobbelt espresso, Triple espresso, Latte Machiatto, kakaomælk, Chokoladedrik ");
        String nameOfDrink = scanner.nextLine();
        if (nameOfDrink.contains("espresso")){
            drinkSize = "Standard";
        }else {
            System.out.println("What size would you like?");
            System.out.println("Options: Small, Medium, Large");
            drinkSize = scanner.nextLine();
            if (nameOfDrink.equalsIgnoreCase("kakaomælk")||nameOfDrink.equalsIgnoreCase("Chokoladedrik")){
                System.out.println("Would you like flødeskum? TYPE y/n");
                String flødeskumYesNo = scanner.nextLine();
                if (flødeskumYesNo.equalsIgnoreCase("y")){
                    System.out.println("Success");
                    cupFøldeskum = true;
                }
            }

        }
        Cup cup = new Cup(nameOfDrink,drinkSize,cupFøldeskum);
        drinkOrderArray.add(cup);
        mainManu();
    }
    public void seeAllOrders(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nThis is your orders!\n__________");
        for (Cup cup : drinkOrderArray) {
            System.out.println(cup);
        }
        System.out.println("\nBack To Main Menu. TYPE '1'");
        int i = scanner.nextInt();
        if (i == 1) {
            mainManu();
        }else mainManu();
    }
    public void deleteAllOrders(){
        drinkOrderArray.clear();
        System.out.println("Success");
        mainManu();
    }


}
