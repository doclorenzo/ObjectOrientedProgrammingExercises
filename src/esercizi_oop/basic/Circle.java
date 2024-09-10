package esercizi_oop.basic;

import java.awt.*;

public class Circle {

    private Point center;
    private int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }

    public double getPerimeter(){
        return 2*Math.PI*getRadius();
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }

    public boolean contains(Point point){
        if(point.getX()<=center.getX()+radius && point.getX()>=center.getX()-radius){
            if(point.getY()<=center.getY()+radius && point.getY()>=center.getY()-radius) return true;
            }
        return false;
    }

    public void translate(int dx, int dy){
        center.setLocation(center.getX()+dx, center.getY()+dy);
    }

}
