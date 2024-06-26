import java.util.ArrayList;

public class CheeseService {
    private static ArrayList<Cheese> listOfCheese = new ArrayList<Cheese>();

    public static ArrayList<Cheese> getListOfCheese() {
        return listOfCheese;
    }

    public static void addCheese(Cheese cheese) {
        listOfCheese.add(cheese);
    }

    public void removeCheese(int id) {
        for (var cheese : listOfCheese) {
            if (cheese.getId() == id) {
                listOfCheese.remove(cheese);
                return;
            }
        }
    }


    public void updateCheese(int id, String name, int cost) {
        for (var cheese : listOfCheese) {
            if (cheese.getId() == id) {
                cheese.setName(name);
                cheese.setCost(cost);
                return;
            }
        }
    }
}
