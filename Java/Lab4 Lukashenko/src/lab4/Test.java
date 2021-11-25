package lab4;
public class Test {
    public static void main(String[] args) {
        Priceable car = new Audi(500000);
        Beer bud = new Beer("Bud", 75);
        System.out.println(car);
        System.out.println(bud);
    }
}


