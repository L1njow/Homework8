public class Main {
    public static void main(String[] args) {
        Shape figure1 = new Circle("circle 1");
        Shape figure2 = new Circle("quad 1");
        Shape figure3 = new Circle("rectangle 1");
        Shape figure4 = new Circle("triangle 1");
        Shape figure5 = new Circle("trapezoid 1");
        Shape figure6 = new Circle("circle 2");

        ConsoleShapePrinter printer = new ConsoleShapePrinter();
        printer.printInfo(figure1);
    }
}