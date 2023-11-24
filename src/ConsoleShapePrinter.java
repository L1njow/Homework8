public class ConsoleShapePrinter implements ShapePrinter {
    @Override
    public void printInfo(Shape shape) {
        System.out.println("Name is " + shape.getName());
    }
}
