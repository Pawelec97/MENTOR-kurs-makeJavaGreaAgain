public class Car {

    private String name;
    private int year;
    private int distance;

    Car(String name, int year, int distance) {
        this.name = name;
        this.year = year;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getDistance() {
        return distance;
    }

}
