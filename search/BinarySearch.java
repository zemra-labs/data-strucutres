public class BinarySearch {
  private static int[] myArray = {0,3,4,22,23,33,41,56};

  public void bSearch(int value){
    int low = 0;
    int high = myArray.length - 1;
    // time complexity 0(n log n)
    // divide and conquer approach
    while(low <= high){

      int mid = (high + low)/2;
      System.out.println("Midpoint index: " + mid);
      if(myArray[mid] < value) {
        low = mid + 1;
      } else if(myArray[mid] > value) {
        high = mid - 1;
      } else {
        System.out.println("Value was found at index " + mid);
        low = high + 1;
      }
    }

  }

  public static void main(String []args){
      BinarySearch bs = new BinarySearch();
      // arrays have to be sorted
      bs.bSearch(22);
      bs.bSearch(3);

  }
}
