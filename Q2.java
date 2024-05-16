 class Rectangle{
    private double length;
    private double width;
    public Rectangle(double length, double width) {
   if (length <= 0 || width <= 0) {
    throw new IllegalArgumentException("Length and width must be positive numbers.");
    }
    this.length = length;
    this.width = width;
    }
    public double getLength() {
    return length;
    }
    public void setLength(double length) {
    if (length <= 0) {
    throw new IllegalArgumentException("Length must be a positive number.");
    }
    this.length = length;
    }
    public double getWidth() {
    return width;
    }
    public void setWidth(double width) {
    if (width <= 0) {
    throw new IllegalArgumentException("Width must be a positive number.");
    }
    this.width = width;
    }
    public double calculateArea() {
    return length * width;
    }
    public double calculatePerimeter() {
    return 2 * (length + width);
    }
    public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(5, 4);
    System.out.println("Area: " + rectangle.calculateArea());
    System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    rectangle.setLength(7);
    rectangle.setWidth(3);
    System.out.println("Updated area: " + rectangle.calculateArea());
    System.out.println("Updated perimeter: " + rectangle.calculatePerimeter());
    }
}