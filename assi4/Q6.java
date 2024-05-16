
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
class MemoryIntensiveProgram {
public static void main(String[] args) {
Runtime runtime = Runtime.getRuntime();
// Enable G1 garbage collector
System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "4");
System.setProperty("java.compiler", "");
System.setProperty("sun.misc.ContendedAnnotatedTypes.Enabled", "true");
System.setProperty("sun.rt.contended", "true");
System.setProperty("java.awt.headless", "true");
System.setProperty("sun.management.jmxremote", "true");
System.setProperty("sun.management.jmxremote.port", "9010");
System.setProperty("sun.management.jmxremote.authenticate", "false");
System.setProperty("sun.management.jmxremote.ssl", "false");
System.setProperty("java.security.egd", "file:/dev/./urandom");

System.out.println("Initial timestamp: " + new SimpleDateFormat("yyyy-MM-dd
HH:mm:ss.SSS").format(new Date()));
System.out.println("Initial total memory: " + runtime.totalMemory() + " bytes");
System.out.println("Initial free memory: " + runtime.freeMemory() + " bytes");

long totalObjects = 10000000;
Object[] objects = new Object[totalObjects];
Random random = new Random();
for (long i = 0; i < totalObjects; i++) {
objects[i] = new Object() {
private Random random;
int value = random.nextInt(100);
};
}

System.out.println("Final timestamp: " + new SimpleDateFormat("yyyy-MM-dd
HH:mm:ss.SSS").format(new Date()));
System.out.println("Final total memory: " + runtime.totalMemory() + " bytes");
System.out.println("Final free memory: " + runtime.freeMemory() + " bytes");
}
}
