import java.util.Scanner;

public class Main {
    private static Scanner scn = new Scanner(System.in);
    private static CheeseService cheeseService = new CheeseService();

    public static void main(String[] args) {
        while(true) {
            System.out.println("Press 1, to add an cheese");
            System.out.println("Press 2, to print all cheese");
            int action = scn.nextInt();
            //If the user chooses 1, then we call addItem();
            if (action == 1) {
                addCheese();
            } else if (action == 2) {
                printListOfCheese();
            } else{
                break;
            }
        }


        //If the user chooses 2, then we call printItems();

        //If the user chooses 3, then we call remove item
        //If the user chooses 4, then we call update item


        //Create a function that remove items
        //Create a function that update items

    }

    public static void addCheese(){
        System.out.println("Provide an cheese id");
        int id = scn.nextInt();
        System.out.println("Provide the cheese name");
        String name = scn.next();
        System.out.println("Provide the cheese cost");
        int cost = scn.nextInt();
        var cheese = new Cheese(id, name, cost);
        CheeseService.addCheese(cheese);
    }

    public static void printListOfCheese(){
        System.out.println("This is the list of cheese in the storage: ");
        var listOfCheese = CheeseService.getListOfCheese();
        for (var cheese : listOfCheese){
            System.out.println(cheese.getId() + cheese.getName() + cheese.getCost());
        }
    }
}