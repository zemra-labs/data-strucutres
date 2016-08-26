import java.util.Arrays;
public class QuickSort{
  private static int temp;
  private static int[] myArray = {10, 70, 80, 50, 100, 40, 30, 90};
  private static int pivot = 60;
  public void sort(int[] myArray, int left, int right){
    // start on the left side with the lower bound of the array
    int leftIndex = left;
    // start with the end of the array as your rightmost index
    int rightIndex = right;
    int temp;

    // for selecting the middle point as the pivot
    int pivot = myArray[(leftIndex+rightIndex)/2];
    System.out.println("Pivot value is:" + pivot);
    // right as pivot
    // int pivot = myArray[rightIndex];
    // left as pivot
    // int pivot = myArray[leftIndex];


    // time complexity
    // best/average O(n log(n)), worst O(n^2)


    while(leftIndex <= rightIndex){
      while(myArray[leftIndex] < pivot)
        leftIndex++;
        System.out.println("left:  " + leftIndex);
      while(myArray[rightIndex] > pivot)
        rightIndex--;
        System.out.println("right: " + rightIndex);
      if(leftIndex <= rightIndex){
        System.out.println("Swapping values: " + myArray[leftIndex] + " with: " + myArray[rightIndex]);
        temp = myArray[leftIndex];
        myArray[leftIndex] = myArray[rightIndex];
        myArray[rightIndex] = temp;
        leftIndex++;
        rightIndex--;
      }
      System.out.println(Arrays.toString(myArray));
    }

    if (left < rightIndex){
      sort(myArray, left, rightIndex);
    }

    if (leftIndex < right){
      sort(myArray, leftIndex, right);
    }
  }


  public static void main(String[] args) {
    QuickSort qs = new QuickSort();
    qs.sort(myArray, 0, myArray.length -1);
  }
}
