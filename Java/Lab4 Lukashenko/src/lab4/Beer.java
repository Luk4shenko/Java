package lab4;

public class Beer implements Priceable {

    private String name;
    private int cost;

    public Beer(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public int getPrice() {
        return cost;
    }
    @Override
    public String toString() {
        return "Beer{" +
                "name = " + name  +
                ", cost = " + cost +
                '}';
    }
}
