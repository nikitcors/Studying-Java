package lvl21.hw.N1;

public class Horse {
    String name;
    double speed;
    double distance;

    public Horse() {
        this.name = "";
        this.speed = 0.0;
        this.distance = 0.0;
    }

    public Horse(String name, double speed, double distance) {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public double getSpeed() {
        return speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void move() {
        distance += (speed * Math.random());

    }
    public void print() {
        System.out.print(this.name);
        for (int i = 0; i < Math. round (distance); i++){
            System.out.print(".");
        }
        System.out.println();
    }
}
