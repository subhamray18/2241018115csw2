class NullifiedReference {
    String name;
    public NullifiedReference(String name) {
    this.name = name;
    }
    protected void finalize() throws Throwable {
    System.out.println("Garbage collecting object: " + name);
    }
    }
     class GarbageCollectionNullification {
    public static void main(String[] args) {
    NullifiedReference n = new NullifiedReference("Object 1");
    n =null;
    System.gc();
    }
    }
