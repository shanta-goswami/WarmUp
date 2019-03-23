package DesignPatterns.AbstractFactory;

public class RoundedRectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape drawn: ROUNDED RECTANGLE");
    }
}
