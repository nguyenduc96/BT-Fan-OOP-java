import java.lang.String;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed = 1;
    private double radius = 5;
    private boolean on = false;
    private String color = "blue";

    public Fan() {
    }

    public Fan(int speed, boolean on, String color, double radius) {
        this.speed = speed;
        this.on = on;
        this.color = color;
        this.radius = radius;
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public boolean isOn() {
        return on;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    @Override
    public String toString(){
        if (this.isOn()){
            return "Fan {speed : " + this.speed + ", color : " + this.color + ", radius : " + this.radius + ", fan is on}";
        }
        return "Fan {color : " + this.color + ", radius : " + this.radius + ", fan is off}";
    }
}
