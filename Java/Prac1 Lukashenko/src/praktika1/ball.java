package praktika1;
import java.lang.*;
public class ball {
        private String color;
        private int Radius;
        public ball(String c,int R){
            color = c;
            Radius = R;
        }

        public ball(String c){
            color = c;
            Radius = 0;
        }
        public ball(){
            color = "red";
            Radius = 0;
        }
        public void setRadius(int Radius){
            this.Radius = Radius;
        }
        public void setName(String color){
            this.color = color;
        }
        public String getName(String name){
            return name;
        }
        public int getRadius(){
            return Radius;
        }
        public String toString(){
            return this.color+",Radius"+this.Radius;
        }
        public void intoRadius(){
            System.out.println(color+"'Radius x7 = "+Radius*7+"m");
        }

}
