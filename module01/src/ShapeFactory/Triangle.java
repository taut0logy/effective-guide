package ShapeFactory;

public class Triangle implements Shape{

    protected Triangle() {}
    @Override
    public void draw() {
        System.out.println("ShapeFactory.Triangle drawn");
    }
}
