import java.util.Arrays;
public class QuickSort{
  private static int temp;
  private static int[] myArray = {10, 70, 80, 50, 100, 40, 30, 90};
  private static int pivot = 60;
  public void partition(){
    // start on the left side with the first index position
    int leftIndex = 0;
    // start with the end of the array as your rightmost index
    int rightIndex = myArray.length -1;
    System.out.println(rightIndex);
    while(leftIndex <= rightIndex){
      while(myArray[leftIndex] < pivot)
        leftIndex++;
        System.out.println(leftIndex + "left");
      while(myArray[rightIndex] > pivot)
        rightIndex--;
        System.out.println(rightIndex + "right");
      if(leftIndex <= rightIndex){
        System.out.println("Swap");
        temp = myArray[leftIndex];
        myArray[leftIndex] = myArray[rightIndex];
        myArray[rightIndex] = temp;
        leftIndex++;
        rightIndex--;
      }

    }
    System.out.println(Arrays.toString(myArray));
    
    if(leftIndex < rightIndex){
      partition();
    }

  }

  public void sort(){

  }

  public static void main(String[] args) {
    QuickSort qs = new QuickSort();
    qs.partition();
    // qs.sort();
  }
}
