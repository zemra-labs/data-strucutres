import java.util.Arrays;
public class BubbleSort {
  public static int temp;
  static int[] myArray = {10, 50, 40, 30, 20, 100, 80, 70, 90};

  public static void main (String []args) {
      BubbleSort s = new BubbleSort();
      s.sort(myArray);
      // time complexity best O(n), worst/average O(n^2)
  }

  public static void sort(int[] myArray){
    for(int i = myArray.length-1; i>1; i--){
      for (int j = 0; j < i; j++){
        if(myArray[j] > myArray[j+1]){
          temp = myArray[j];
          myArray[j] = myArray[j+1];
          myArray[j+1] = temp;
        }
      }
    }
    System.out.println(Arrays.toString(myArray));
  }
}
