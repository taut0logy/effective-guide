import ShapeFactory.Shape;
import ShapeFactory.ShapeFactory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory f= ShapeFactory.getInstance();
        Shape shape=f.getShape("ShapeFactory.Triangle");
        Shape shape2=f.getShape("ShapeFactory.Circle");
        shape.draw();
        shape2.draw();
    }
}