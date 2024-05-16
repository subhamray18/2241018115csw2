 class Laptop {
    private String model;
    private double price;
    public String getModel() {
    return model;
    }
    public void setModel(String model) {
    this.model = model;
    }
    public double getPrice() {
    return price;
    }
    public void setPrice(double price) {
    this.price = price;
    }
    public String toString() {
    return "Laptop [model=" + model + ", price=" + price + "]";
   }
    }
    public class Q4 {
    public static void main(String[] args) {
    Laptop laptop = new Laptop();
    laptop.setModel("Dell XPS 15");
    laptop.setPrice(1500);
    System.out.println("Laptop: " + laptop);
    }
    }
    
