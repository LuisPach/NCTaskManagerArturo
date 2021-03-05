package mx.edu.j2se.Pacheco.evaluation;

public class Circle {

    float radius;


    protected float defaultConstructor(){
        return radius=1;
    }
    protected void setRadius(float radius){

        if(radius>0){
            throw new IllegalArgumentException("Should be greater than 0");
        }
        this.radius=radius;

    }

    protected Float getRadius() {
        return radius;
    }

    protected double getArea(){
        return Math.PI*radius+radius;
    }

}
