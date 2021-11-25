public class VictorianChair extends ChairFactory implements Chair {
    public int age;
    VictorianChair(int age){
        this.age = age;
        System.out.println("Создан Victorian Chair, его возраст: "+age);
    }


    public int getAge() {
        return age;
    }
}
