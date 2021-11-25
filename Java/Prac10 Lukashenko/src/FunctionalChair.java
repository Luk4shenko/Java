public class FunctionalChair extends ChairFactory implements Chair {
    FunctionalChair(){
        System.out.println("Создан Functional Chair");
    }
    public int sum( int a , int b ){
        return a+b;
    }
}
