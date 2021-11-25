public class test {
    public static void main(String[] args) {
        Client adolf = new Client();
        ChairFactory fact = new ChairFactory();
        adolf.setChair(fact.createMagicChair());
        adolf.setChair(fact.createVictorianChair());
        adolf.setChair(fact.createFunctionalChair());
        System.out.println(adolf.getChair());
    }
}
