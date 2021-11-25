package lab4;

public class Audi implements Priceable{

    private int cost;

    public Audi(int cost) {
        this.cost = cost;
    }

    @Override
    public int getPrice() {
        return cost;
    }

    @Override
    public String toString() {
        return "Audi{" +
                "cost = " + cost +
                '}';
    }
}