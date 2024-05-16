
 class Car implements Comparable<Car> {
private int modelNo;
private String name;
private int stock;
public Car(int modelNo, String name, int stock) {
this.modelNo = modelNo;
this.name = name;
this.stock = stock;
}
public int getModelNo() {
return modelNo;
}
public void setModelNo(int modelNo) {
this.modelNo = modelNo;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public int getStock() {
return stock;
}
public void setStock(int stock) {
this.stock = stock;
}
public int compareTo(Car car) {
return Integer.compare(this.stock, car.stock);
}
public String toString() {
return String.format("%d %s %d", modelNo, name, stock);
}
}