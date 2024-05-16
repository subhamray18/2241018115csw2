 class Point {
    private int x;
    private int y;
    public Point(int x, int y) {
   
    this.x = x;
    this.y = y;
}
    public Point(Point other) {
    this(other.x, other.y);
    }
    public int getX() {
    return x;
    }
    public void setX(int x) {
    this.x = x;
    }
    public int getY() {
    return y;
    }
    public void setY(int y) {
    this.y = y;
    }
    public static void main(String[] args) {
    Point p1 = new Point(3, 4);
    Point p2 = new Point(p1);
    System.out.println("Initial values of p1: (" + p1.getX() + ", " + p1.getY() + ")");
    System.out.println("Initial values of p2: (" + p2.getX() + ", " + p2.getY() + ")");
    p1.setX(5);
    p1.setY(6);
    System.out.println("Updated values of p1: (" + p1.getX() + ", " + p1.getY() + ")");
    System.out.println("Values of p2 unchanged: (" + p2.getX() + ", " + p2.getY() + ")");
    }
}