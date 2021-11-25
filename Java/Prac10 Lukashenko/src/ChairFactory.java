public class ChairFactory implements AbstractChairFactory{
    public VictorianChair createVictorianChair() {
        return new VictorianChair(6);
    }

    public MagicChair createMagicChair() {
        return new MagicChair();
    }

    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }
}
