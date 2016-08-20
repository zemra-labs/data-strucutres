public class LinearSearch{
  private static int[] myArray = {0,88,32,44,53,21,14,7,8,92};


  public void search(int value){
      boolean flag = false;
      int index = -1;
      for(int i=0;i<myArray.length;i++){
        if(myArray[i] == value) {
          flag = true;
          index = i;
        }
      }
      if (flag) {
        System.out.println("Value was found at position " + index);
      }
  }

  // time complexity: worst case = O(n)

  public static void main (String []args){
      LinearSearch ls = new LinearSearch();
      ls.search(14);
  }
}
