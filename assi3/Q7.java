
    
    import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
     class TreeMapExample {
    public static void main(String[] args) {
    TreeMap<String, Address> treeMap = new TreeMap<>();
    treeMap.put("John Doe", new Address(123, "Main Street", 12345));
    treeMap.put("Jane Doe", new Address(456, "Second Street", 67890));
    treeMap.put("Bob Smith", new Address(789, "Third Street", 23456));
    System.out.println("Initial TreeMap:");
    Iterator<Map.Entry<String, Address>> iterator = treeMap.entrySet().iterator();
    while (iterator.hasNext()) {
    Map.Entry<String, Address> entry = iterator.next();
    System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
    }
    }
    }
     class Address {
        private int plotNo;
        private String areaTown;
        private int postalCode;
        public Address(int plotNo, String areaTown, int postalCode) {
        this.plotNo = plotNo;
        this.areaTown = areaTown;
        this.postalCode = postalCode;
        }
        public int getPlotNo() {
        return plotNo;
        }
        public void setPlotNo(int plotNo) {
        this.plotNo = plotNo;
        }
        public String getAreaTown() {
        return areaTown;
        }
        public void setAreaTown(String areaTown) {
        this.areaTown = areaTown;
        }
        public int getPostalCode() {
       return postalCode;
        }
        public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
        }
        public String toString() {
        return "Address [plotNo=" + plotNo + ", areaTown=" + areaTown + ", postalCode=" + postalCode +"]";
        }
        }