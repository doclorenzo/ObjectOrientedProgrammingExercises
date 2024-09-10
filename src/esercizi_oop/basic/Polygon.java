package esercizi_oop.basic;

import java.awt.geom.Point2D;

import static java.lang.Math.abs;

public class Polygon {

    final Point2D.Double[] vertices;

    public Polygon(Point2D.Double[] vertices) {
        if (vertices.length < 3) {
            throw new IllegalArgumentException("Al least three vertices are required");
        }
        this.vertices = vertices;
    }

    public int getVerticesCount(){
        return vertices.length;
    }

    public double getPerimeter(){
        double ret=0;
        for(int i=0; i<getVerticesCount()-1; i++){
            ret+=(vertices[i].distance(vertices[i+1]));
        }
        ret+=(vertices[getVerticesCount()-1].distance(vertices[0]));
        return ret;
    }

    public double getArea(){
        if(getVerticesCount()%2==0){
            double apotema=vertices[0].distance(vertices[(getVerticesCount()/2)-1])/2;
            return (getPerimeter()/2)*apotema;
        }
        Point2D.Double middle = new Point2D.Double();
        int indexA=getVerticesCount()/2;
        int indexB = indexA+1;

        middle.setLocation((vertices[indexA].getX() + vertices[indexB].getX())/2, (vertices[indexA].getY() + vertices[indexB].getY())/2);

        double apotema=vertices[0].distance(middle)/2;
        return (getPerimeter()/2)*apotema;

    }

}
