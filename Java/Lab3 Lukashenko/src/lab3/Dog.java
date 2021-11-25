package lab3;
public abstract class Dog {
    protected int loudness;
    protected String name;
    protected String beauty;
    protected String color;
    protected String breed;
    protected int run;
    protected int sweem;
    protected double jump;

    public int getLoudness() {
        return loudness;
    }
    public void setLoudness(int loudness) {
        this.loudness = loudness;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBeauty() {
        return beauty;
    }
    public void setBeauty(String beauty) {
        this.beauty = beauty;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getBreed(){
        return breed;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
    public int getRun(){
        return run;
    }
    public void setRun(int run){
        this.run = run;
    }
    public int getSweem(){
        return sweem;
    }
    public void setSweem(int sweem){
        this.sweem = sweem;
    }
    public double getJump() {
        return jump;
    }
    public void setJump(double jump) {
        this.jump = jump;
    }
}