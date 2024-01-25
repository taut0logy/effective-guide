package ShapeFactory;

public class Circle implements Shape{
    protected Circle() {}
    @Override
    public void draw() {
        System.out.println("ShapeFactory.Circle drawn");
    }
}
