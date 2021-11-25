package lab3;

public class DogTest {
    public static void main(String[] args){
        Shepherd doggy1 = new Shepherd("shepherd", "sharik","brown","cute",5,10,8,0.5);
        Pug doggy2 = new Pug("pug", "Gary ","gray","cute",2,3,5,0.2);
        System.out.println("Breed:" + doggy1.breed + " DogName:" + doggy1.name  + " Color:" + doggy1.color + " Beauty:" + doggy1.beauty + " Loudness:" + doggy1.loudness +
                " RunLimit:" + doggy1.run + "meters" + " Sweem:" + doggy1.sweem + " Jump:" +doggy1.jump+ "meters");
        System.out.println("Breed:" + doggy2.breed + " DogName:" + doggy2.name  + " Color:" + doggy2.color + " Beauty:" + doggy2.beauty + " Loudness:" + doggy2.loudness +
                " RunLimit:" + doggy2.run + "meters" + " Sweem:" + doggy2.sweem + " Jump: " +doggy2.jump+ "meters");
    }
}
