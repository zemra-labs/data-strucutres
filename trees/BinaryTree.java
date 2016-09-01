public class BinaryTree {
  Node root;

  public void addNode(int data){

    Node newNode = new Node(data);

    if (root == null) {
      root = newNode;
    } else {
      Node traverseNode = root;
      Node parent;

      while(true){
        parent = traverseNode;

        if(data < traverseNode.data) {
          traverseNode = traverseNode.leftChild;
          if (traverseNode == null) {
            parent.leftChild = newNode;
          }
        } else {
          traverseNode = traverseNode.rightChild;

          if (traverseNode == null) {
            parent.rigthChild = newNode;
          }
        }
      }

    }
  }

  // big O complexity: search, insert, delete O (log(n))

  // preOrder traversal, root, left subtree, right subtree
  public void preOrderTraverse(Node root){
    if(root != null) {
      System.out.println(root.value);
      preOrderTraverse(root.leftChild);
      preOrderTraverse(root.righChild);
    }
  }
  // postOrder traversal, left subtree, right subtree, root
  public void postOrderTraverse(Node root){
    if(root != null) {
      postOrderTraverse(root.leftChild);
      postOrderTraverse(root.rightChild);
      System.out.println(root.value);
    }
  }
  // inorder traversal, left subtree, root, right subtree
  public void inOrderTraversal(Node root){
    if (root != null) {
      inOrderTraversal(root.leftChild);
      System.out.println(root.value);
      inOrderTraversal(root.rightChild);
    }
  }


  public static void main(String []args){
    BinaryTree bt = new BinaryTree();

    bt.addNode(10);
    bt.addNode(11);
    bt.addNode(40);
    bt.addNode(88);
    bt.addNode(72);
    bt.addNode(50);
    bt.addNode(2);


  }
}

class Node{
  int data;

  Node leftChild;
  Node rightChild;

  Node(int data){
    this.data = data;
  }
}
