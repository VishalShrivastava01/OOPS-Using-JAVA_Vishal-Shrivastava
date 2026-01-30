class AreaCalculator {

    void area(int side) {
        System.out.println("Area of Square = " + (side * side));
    }

    void area(int length, int breadth) {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }

    void area(double radius) {
        System.out.println("Area of Circle = " + (3.14 * radius * radius));
    }
}

public class Experiment2 {
    public static void main(String[] args) {

        AreaCalculator obj = new AreaCalculator();

        obj.area(5);          
        obj.area(10, 4);      
        obj.area(3.5);        
    }
}
