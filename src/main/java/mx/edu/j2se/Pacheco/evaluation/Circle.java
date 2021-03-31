package mx.edu.j2se.Pacheco.evaluation;

public class Circle{

    float radius;


    public Circle(){
        this.radius=1;
    }
    public Circle(float radius) {
        if(radius<=0){
            throw new IllegalArgumentException("Should be greater than 0");
        }
        this.radius=radius;
    }

    protected float getRadius() {
        return radius;
    }

    protected double getArea(){
        return Math.PI*radius+radius;
    }

}
