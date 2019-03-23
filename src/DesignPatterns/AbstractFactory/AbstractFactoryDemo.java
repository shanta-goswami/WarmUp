package DesignPatterns.AbstractFactory;

public class AbstractFactoryDemo {

    public static void main(String args[]) {
        boolean isRounded = false;
        AbstractFactory shapeFactory = FactoryProducer.getFactory(isRounded);
        shapeFactory.getShape("SQUARE").draw();
        shapeFactory.getShape("RECTANGLE").draw();

        isRounded = true;
        AbstractFactory roundedShapeFactory = FactoryProducer.getFactory(isRounded);
        roundedShapeFactory.getShape("SQUARE").draw();
        roundedShapeFactory.getShape("RECTANGLE").draw();

    }
}
