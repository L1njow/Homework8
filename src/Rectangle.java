public class Rectangle extends Shape {
    private String name;
    public Rectangle(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
