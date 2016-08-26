import java.util.Arrays;

public class HashMap {
  // fast insertion and searching
  // key values are assigned to a hash table using a hash function
  // a hash function helps calculate the best index an item should go in
  // instead of searching you use the calculation to figure out where the data is
  public static int arraySize;
  public static int[] arr;
  public static int[] myArray = {10, 5, 4,12, 13, 7, 0, 22, 29};


  HashMap(int size){
    arraySize = size;
    arr = new int[size];
    Arrays.fill(arr, 0);
  }

  public static void hashFunction(int[] myArray, int[] arr){
    // set each value in the array equal to its index
    for(int i=0;i<myArray.length;i++){
      int value = myArray[i];
      arr[value] = value;
    }
  }

  public static void main(String []args){
    HashMap hm = new HashMap(30);
    hm.hashFunction(myArray, arr);
    System.out.println(Arrays.toString(arr));
  }
}
