import java.util.PriorityQueue;
class MinHeap{
public static void main(String[]args){
int[]arr={1,2,10,8,7,3,4,6,5,9};
PriorityQueue<Integer>minHeap=new PriorityQueue<>();
for(int i=0;i<arr.length;i++){
minHeap.add(arr[i]);
}
System.out.println("Dequeuedelements:");
while(!minHeap.isEmpty()){
System.out.println(minHeap.poll());
}
}
}