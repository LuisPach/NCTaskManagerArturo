package mx.edu.j2se.Pacheco.evaluation;

import java.lang.reflect.Array;

public class Evaluation1 {

    public static void main(String[] args) {
        try {
            //Circle circulo = new Circle(-1);
            Circle circulo = new Circle();
        } catch (IllegalArgumentException e) {
            System.out.println("The radius is not valid");
        }

        Circle[] Array = {new Circle(3), new Circle(4), new Circle(5)};
        System.out.println("The biggest circle hast a radius of: "+Array[biggestCircle(Array)].getRadius());
    }

    public static int biggestCircle(Circle[] Array) {
        int maxIndex = 0;
        for (int i = 0; i<Array.length; i++) {
            if (Array[i].getArea() > Array[maxIndex].getArea()) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    }
/*

        array[0] = new Circle(3);
        array[1] = new Circle(6);
        array[2] = new Circle(9);

        System.out.println("The biggest circle is: " + biggestCircle());

    }

    public biggestCircle() {
        for (int i = 0; i < 3; i++) {
            array[i]
        }

 */






