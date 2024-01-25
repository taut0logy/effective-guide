public class Main {
    public static void main(String[] args) {
        ShapeFactory f=ShapeFactory.getInstance();
        Shape shape=f.getShape("Triangle");
        Shape shape2=f.getShape("Circle");
        shape.draw();
        shape2.draw();
    }
}