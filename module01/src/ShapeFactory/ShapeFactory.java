package ShapeFactory;

import java.util.Objects;

public class ShapeFactory {
    private static ShapeFactory instance=null;
    private ShapeFactory(){}

    public static ShapeFactory getInstance() {
        if(instance==null) instance=new ShapeFactory();
        return instance;
    }
    public Shape getShape (String name) {
        if(Objects.equals(name, "ShapeFactory.Circle")) return new Circle();
        else if(Objects.equals(name, "ShapeFactory.Triangle")) return new Triangle();
        else return null;
    }
}
