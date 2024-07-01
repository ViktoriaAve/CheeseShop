import java.util.Scanner;

public class Main {
    private static Scanner scn = new Scanner(System.in);
    private static CheeseService cheeseService = new CheeseService();

    public static void main(String[] args) {
        while(true) {
            System.out.println("*********************************");
            System.out.println("Press 1, to print list of cheese");
            System.out.println("Press 2, to add cheese");
            System.out.println("Press 3, to remove cheese");

            int action = scn.nextInt();
            //If the user chooses 1, then we call addItem();
            if (action == 1) {
                printListOfCheese();
                continue;
            } else if (action == 2) {
                addCheese();
                continue;
            } else if (action == 3) {
                deleteCheese();
                continue;
            } else {
                break;
            }
        }

    }

    public static void addCheese() {
        System.out.println("Provide an cheese id");
        int id = scn.nextInt();
        System.out.println("Provide the cheese name");
        String name = scn.next();
        System.out.println("Provide the cheese cost");
        int cost = scn.nextInt();
        var cheese = new Cheese(id, name, cost);
        CheeseService.addCheese(cheese);
    }

    public static void deleteCheese() {
        System.out.println("Provide an cheese id");
        int id = scn.nextInt();
        var listOfCheese = CheeseService.getListOfCheese();
        for (var cheese : listOfCheese){
            if (id == cheese.getId()) {
                cheeseService.removeCheese(id);
                System.out.println(cheese.getId() + " " + cheese.getName() + " is removed.");
            }
        }
    }

    public static void printListOfCheese(){
        System.out.println("This is the list of cheese in the storage: ");
        var listOfCheese = CheeseService.getListOfCheese();
        for (var cheese : listOfCheese){
            System.out.println(cheese.getId() + cheese.getName() + cheese.getCost());
        }
    }
}