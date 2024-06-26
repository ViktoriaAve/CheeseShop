import java.util.ArrayList;

public class CheeseShop {
    private ArrayList<Cheese> cart = new ArrayList<Cheese>();

    public void addCheeseToCart(Cheese cheese) {
        cart.add(cheese);
    }

    public int checkout() {
        int sum = 0;
        for (var cheese : cart) {
            sum +=cheese.getCost();
        }
        return sum;

    }
}

