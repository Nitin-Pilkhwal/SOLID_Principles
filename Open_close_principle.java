// The Open-Closed Principle (OCP) is one of the SOLID principles in software development. It states that software entities (classes, modules, functions, etc.) should be open for extension but closed for modification. In other words, you should be able to add new functionality to a system without modifying its existing code.

// To demonstrate the Open-Closed Principle, let's consider an example. Suppose we have a system that calculates the total cost of different types of products. We have a base Product class and several subclasses representing different types of products, such as Book, Clothing, and Electronics. Each product has a price and a method to calculate its total cost.


abstract class Product {
    private double price;

    public Product(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public abstract double calculateTotalCost();
}

class Book extends Product {
    public Book(double price) {
        super(price);
    }

    @Override
    public double calculateTotalCost() {
        // Additional logic specific to books
        return getPrice() + (getPrice() * 0.05);
    }
}

class Clothing extends Product {
    public Clothing(double price) {
        super(price);
    }

    @Override
    public double calculateTotalCost() {
        // Additional logic specific to clothing
        return getPrice() + (getPrice() * 0.1);
    }
}

class Electronics extends Product {
    public Electronics(double price) {
        super(price);
    }

    @Override
    public double calculateTotalCost() {
        // Additional logic specific to electronics
        return getPrice() + (getPrice() * 0.15);
    }
}

class OpenClosePrinciple{
    public static void main(String[] args) {
        Product book = new Book(50.0);
        Product clothing = new Clothing(100.0);
        Product electronics = new Electronics(200.0);

        double bookTotalCost = book.calculateTotalCost();
        double clothingTotalCost = clothing.calculateTotalCost();
        double electronicsTotalCost = electronics.calculateTotalCost();

        System.out.println("Book total cost: " + bookTotalCost);
        System.out.println("Clothing total cost: " + clothingTotalCost);
        System.out.println("Electronics total cost: " + electronicsTotalCost);
    }
}
public class Open_close_principle {
    public static void main(String[] args) {
        
    }
}

// In this example, the Product class is the base class that defines the common behavior and properties of all products. It has a calculateTotalCost() method that is declared as abstract, meaning it must be implemented by its subclasses.

// The subclasses (Book, Clothing, and Electronics) extend the Product class and provide their own implementation of the calculateTotalCost() method. Each subclass can have its own specific logic for calculating the total cost, such as applying different tax rates or discounts.

// By following the Open-Closed Principle, we can easily add new types of products without modifying the existing code. For example, if we want to add a new Food class, we can simply create a new subclass of Product and implement the calculateTotalCost() method according to the specific logic for food products.

// This approach allows for easy extensibility and reduces the risk of introducing bugs or unintended side effects when modifying existing code. It promotes code reuse and maintainability by encapsulating behavior in separate classes and allowing them to be easily extended.