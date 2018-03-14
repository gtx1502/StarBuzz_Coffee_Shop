import java.util.Scanner;

/**
 * Created by gtx on 2017/7/11.
 */
public class Main {
    public static void main(String args[]) {
        Beverage drink = null;
        System.out.println("Please enter the args");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");
        if (inputArray.length < 2) {
            System.out.println("Too few args");
            System.exit(0);
        }
        String type = inputArray[0];
        String size = inputArray[1];
        CoffeeBased coffeeBased;
        TeaBased teaBased;
        switch (type) {
            case "Espresso":
                drink = new Espresso();
                coffeeBased = new CoffeeBased(size);
                drink.setSizeFactor(coffeeBased);
                break;
            case "Decaf":
                drink = new Decaf();
                coffeeBased = new CoffeeBased(size);
                drink.setSizeFactor(coffeeBased);
                break;
            case "HouseBlend":
                drink = new HouseBlend();
                coffeeBased = new CoffeeBased(size);
                drink.setSizeFactor(coffeeBased);
                break;
            case "Mocha":
                drink = new Espresso();
                coffeeBased = new CoffeeBased(size);
                drink.setSizeFactor(coffeeBased);
                drink = new Chocolate(drink);
                break;
            case "Latte":
                drink = new Espresso();
                coffeeBased = new CoffeeBased(size);
                drink.setSizeFactor(coffeeBased);
                drink = new Milk(drink);
                break;
            case "Cappuccino":
                drink = new Espresso();
                coffeeBased = new CoffeeBased(size);
                drink.setSizeFactor(coffeeBased);
                drink = new WhipCream(drink);
                break;
            case "DecafMocha":
                drink = new Decaf();
                coffeeBased = new CoffeeBased(size);
                drink.setSizeFactor(coffeeBased);
                drink = new Chocolate(drink);
                break;
            case "DecafLatte":
                drink = new Decaf();
                coffeeBased = new CoffeeBased(size);
                drink.setSizeFactor(coffeeBased);
                drink = new Milk(drink);
                break;
            case "DecafCappuccino":
                drink = new Decaf();
                coffeeBased = new CoffeeBased(size);
                drink.setSizeFactor(coffeeBased);
                drink = new WhipCream(drink);
                break;
            case "GreenTea":
                drink = new GreenTea();
                teaBased = new TeaBased(size);
                drink.setSizeFactor(teaBased);
                break;
            case "RedTea":
                drink = new RedTea();
                teaBased = new TeaBased(size);
                drink.setSizeFactor(teaBased);
                break;
            case "WhiteTea":
                drink = new WhiteTea();
                teaBased = new TeaBased(size);
                drink.setSizeFactor(teaBased);
                break;
            case "FlowerTea":
                drink = new GreenTea();
                teaBased = new TeaBased(size);
                drink.setSizeFactor(teaBased);
                drink = new Jasmine(drink);
                break;
            case "GingerTea":
                drink = new GreenTea();
                teaBased = new TeaBased(size);
                drink.setSizeFactor(teaBased);
                drink = new Ginger(drink);
                break;
            case "TeaLatte":
                drink = new RedTea();
                teaBased = new TeaBased(size);
                drink.setSizeFactor(teaBased);
                drink = new Milk(drink);
                break;
            default:
                System.out.println("Wrong type of drink");
                System.exit(0);
        }
        if (inputArray.length >= 3) {
            String ingredient;
            for (int i = 2; i < inputArray.length; i++) {
                ingredient = inputArray[i];
                switch (ingredient) {
                    case "Ginger":
                        drink = new Ginger(drink);
                        break;
                    case "Milk":
                        drink = new Milk(drink);
                        break;
                    case "Jasmine":
                        drink = new Jasmine(drink);
                        break;
                    case "WhipCream":
                        drink = new WhipCream(drink);
                        break;
                    case "Chocolate":
                        drink = new Chocolate(drink);
                        break;
                    default:
                        System.out.println("Wrong ingredient");
                        System.exit(0);
                }
            }
        }
        System.out.println("The total cost of your order is: "+ drink.cost());
    }
}
