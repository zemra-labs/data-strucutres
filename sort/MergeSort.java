import java.util.Arrays;

//divide and conquer approach


public class MergeSort{


  // time complexity: best/average O(n log(n)) worst: O(n)
  // divide the array into two halfs, then continue until every element is an array of 1

  public static void mergeSort(int[] myArray, int low, int high){
    if (low < high){

      int mid = (low + high)/2;
      mergeSort(myArray, low, mid);
      mergeSort(myArray, mid+1, high);
      // continue to divide then merge
      merge(myArray, low, mid, high);
    }

  }

  public static void printArray(int[] arr){
    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
  }

  public static void merge(int[] array, int low, int mid, int high) {

    int[] temp = new int[array.length];
    int left = low;
    int right = mid + 1;
    int k=0;
    // System.out.println("left " + left);
    // System.out.println("mid " + mid);
    // System.out.println("right " + right);

    while(left <= mid && right <= high){
      if(array[left] < array[right]){
        temp[k] = array[left];
        left = left + 1;
      } else {
        temp[k] = array[right];
        right = right + 1;
      }
      k = k + 1;
    }
    while(left <= mid) {
      temp[k] = array[left];
      left = left + 1;
      k = k + 1;
    }
    while(right <= high) {
      temp[k] = array[right];
      right = right + 1;
      k = k + 1;
    }


  }

  public static void main(String []args){
      MergeSort ms = new MergeSort();
      int[] myArray = {10, 70, 80, 50, 100, 40, 30, 90};
      ms.mergeSort(myArray, 0, myArray.length -1);
      // ms.printArray(temp);
  }

}
