package DesignPatterns.Factory;

public class FactoryPatternDemo {

    public static void main(String args[]) {
        ShapeFactory factory = new ShapeFactory();
        factory.getShape("circle").draw();
        factory.getShape("RECTANGLE").draw();
    }
}

 /**
Concept:
1. Create an interface/ abstract class
2. Create concrete classes
3. Create factory
4. Main

  A Factory Pattern or Factory Method Pattern says that just define an interface or abstract class for creating an object
  but let the subclasses decide which class to instantiate.

  In other words, subclasses are responsible to create the instance of the class.

 The Factory Method Pattern is also known as Virtual Constructor.

 **/