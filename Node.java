public class Node{
  // create a node with some arbitrary data
  public String firstName;
  public String lastName;
  // create a next pointer
  Node next;

  // node constructor
  public Node(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public void display(){
      System.out.println("Firstname is : " + firstName + " and lastname is: " + lastName);
  }

  public static void main(String []args) {
    LinkList list = new LinkList();
    list.insertInList("Joey", "Tribbiani");
    list.insertInList("Andi", "Mitre");
    list.insertInList("Rachel", "Green");
    list.insertInList("Chandler", "Bing");

    list.display();
    list.removeHead();
    list.display();
    list.searchFirstName("Chandler");
    list.searchFirstName("Rachel");
    list.removeLastName("Mitre");
    list.display();

  }
}
// create a linked list class
class LinkList{
  // create a head node
  public Node head;
  // initialize it to null for starters
  public LinkList(){
    head=null;
  }


  // check if the list is empty
  public boolean isEmpty(){
    return(head==null);
  }

  // insert a node in the linked list
  public void insertInList(String firstName, String lastName){
    Node n1 = new Node(firstName, lastName);
    n1.next = head;
    head = n1;
  }

  // print entire linked list
  public void display(){
    Node temp = head;
    while(temp != null){
      temp.display();
      temp = temp.next;
    }
  }

  // remove froom linked list

  public Node removeHead(){
    Node temp = head;
    if(!isEmpty()){
      head = head.next;
    } else {
      System.out.println("Linked list is empty.");
    }
    return temp;
  }

  // search in linked list
  public Node searchFirstName(String value){
    Node temp = head;
    if(!isEmpty()){
      while(temp.firstName != value){
        if(temp.next == null){
          System.out.println("Node with value " + value + " not found.");
          return null;
        } else {
          temp = temp.next;
        }
      }
    } else {
      System.out.println("Empty list");
    }
    System.out.println("Node with value " + value + " found");
    return temp;
  }

  // remove a speific node
  public Node removeLastName(String value){
    Node temp = head;
    Node previous = null;
    while(temp.lastName != value){
      if(temp.next == null){
        System.out.println("Value wasn't found");
        return null;
      } else {
        previous = temp;
        temp = temp.next;
      }
    }
    if(temp == head) {
      head = head.next;
    } else {
      previous.next = temp.next;
    }
    return temp;
  }

}
