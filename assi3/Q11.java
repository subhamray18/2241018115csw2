import java.util.HashMap;
class MissingNumber{
public static int findMissingNumber(int[]arr){
HashMap<Integer,Integer>numCount=new HashMap<>();
for(int i=0;i<arr.length;i++){
if(arr[i]>0&&arr[i]<=10){
if(numCount.containsKey(arr[i])){
numCount.put(arr[i],numCount.get(arr[i])+1);
}else{
numCount.put(arr[i],1);
}
}
}
int missingNumber=1;
for(int i=1;i<=10;i++){
if(!numCount.containsKey(i)){
missingNumber=i;
break;
}else if(numCount.get(i)==0){
missingNumber=i;
break;
}
}
return missingNumber;
}
public static void main(String[]args){
int[]arr={1,3,5,7,9,2,4,6};
System.out.println("Smallest positive number missing:"+findMissingNumber(arr));
}
}