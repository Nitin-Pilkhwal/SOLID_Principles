// The Liskov Substitution Principle (LSP) is one of the SOLID principles in object-oriented programming. It states that objects of a superclass should be replaceable with objects of its subclasses without affecting the correctness of the program. In other words, if a program is using a base class, it should be able to work correctly when an object of any derived class is substituted in.

// Here's an example to illustrate the Liskov Substitution Principle in Java:

class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

class Rectangle extends Shape {
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

class Circle extends Shape {
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Drawing {
    public void drawShape(Shape shape) {
        shape.draw();
    }
}

class LiskovSubstitutionPrinciple {
    public static void main(String[] args) {
        Drawing drawing = new Drawing();
        
        Shape shape1 = new Rectangle();
        Shape shape2 = new Circle();
        
        drawing.drawShape(shape1); // Drawing a rectangle
        drawing.drawShape(shape2); // Drawing a circle
    }
}
