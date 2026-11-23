class Box {
    int length, width, height;
    Box() { this(1, 1, 1); }
    Box(int side) { this(side, side, side); }
    Box(int l, int w, int h) { length=l; width=w; height=h; }
    int volume() { return length * width * height; }
}
public class ConstructorOverloading {
    public static void main(String[] args) {
        System.out.println("Default box volume: " + new Box().volume());
        System.out.println("Cube volume: " + new Box(3).volume());
        System.out.println("Cuboid volume: " + new Box(2,3,4).volume());
    }
}
