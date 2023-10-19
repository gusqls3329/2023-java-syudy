package extra.day2;

public class Car {
    private String Name;
    private int Door;
    private String Color;

    public Car(String name, int door, String color) {
        this.Name = name;
        this.Door = door;
        this.Color = color;
    }

    public void setName(String name) {
        this.Name = name;

    }

    public void setDoor(int door) {
        this.Door = door;
    }

    public void setColor(String color) {
        this.Color = color;
    }

    @Override
    public String toString() {
        return String.format("name: %s, door: %d, color : %s\n", Name, Door, Color);
    }

    public String getName() {
        return Name;
    }
    public int getDoor() {
        return Door;
    }
    public String getColor() {
        return Color;
    }
}


class CarTest {
    public static void main(String[] args) {
        Car c = new Car("소나타", 4, "White");
        c.setName("제네시스");
        c.setDoor(6);
        c.setColor("pink");
        System.out.println(c);

        String name = c.getName();
        System.out.println(name);
        int door = c.getDoor();
        System.out.println(door);
        String color = c.getColor();
        System.out.println(color);
    }

}
