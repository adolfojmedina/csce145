//Adolfo Medina
import java.util.Scanner;

public class Apple {
    // Instance variables
    private String type;
    private double weight;
    private double price;

    // Default Constructor
    public Apple() {
        type = "Gala";
        weight = 0.5;
        price = 0.88;
    }

    // Parameterized Constructor
    public Apple(String xType, double xWeight, double xPrice) {
        setType(xType);
        setWeight(xWeight);
        setPrice(xPrice);
    }

    // Accessors
    public String getType() 
    {
        return this.type;
    }

    public double getWeight() 
    {
        return this.weight;
    }

    public double getPrice() 
    {
        return this.price;
    }

    // Mutators with validation
    public void setType(String xType) {
        if (xType.equals("Red Delicious") || xType.equals("Golden Delicious") || xType.equals("Gala") || xType.equals("Granny Smith")) {
            this.type = xType;
        } else {
            System.out.println("Invalid value for type!");
        }
    }

    public void setWeight(double xWeight) {
        if (xWeight >= 0 && xWeight <= 2) {
            this.weight = xWeight;
        } else {
            System.out.println("Invalid value for weight!");
        }
    }

    public void setPrice(double xPrice) {
        if (xPrice >= 0) {
            this.price = xPrice;
        } else {
            System.out.println("Invalid value for price!");
        }
    }

    // Method to display the values
    public void writeOutput() {
        System.out.println("Type: " + type);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Price: $" +price +"");
    }


}
