public class Traversal {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(10, null, null);

    root.left = new TreeNode(9, null, null);
    root.left.left = new TreeNode(5, null, null);
    root.left.right = new TreeNode(2, null, null);

    root.right = new TreeNode(15, null, null);
    root.right.left = new TreeNode(-3, null, null);
    root.right.right = new TreeNode(5, null, null);
    root.right.right.right = new TreeNode(22, null, null);

    //System.out.println(root.left.right.value); 
    preOrder(root);
    System.out.println();
    postOrder(root);
    System.out.println();
    inOrder(root);
  }

  public static void preOrder(TreeNode node) {
      if(node == null) return;
      System.out.print(node.value + " ");
      preOrder(node.left);
      preOrder(node.right);
  }
  public static void postOrder(TreeNode node) {
      if(node == null) return;
      postOrder(node.left);
      postOrder(node.right);
      System.out.print(node.value + " ");
  }
  public static void inOrder(TreeNode node) {
      if(node == null) return;
      inOrder(node.left);
      System.out.print(node.value + " ");
      inOrder(node.right);
  }

  //These are all how I initially built the methods ahead of you:

  // public static void preOrder(TreeNode node){
  //   System.out.print(node.value + " ");
  //   if(node.left != null){
  //     preOrder(node.left);
  //   }
  //   if(node.right != null){
  //     preOrder(node.right);
  //   }
  // }
  // public static void postOrder(TreeNode node){
    
  //   if(node.left != null){
  //     postOrder(node.left);
  //   }
  //   if(node.right != null){
  //     postOrder(node.right);
  //   }
  //   System.out.print(node.value + " ");
  // }
  // public static void inOrder(TreeNode node){
    
  //   if(node.left != null){
  //     inOrder(node.left);
  //   }
  //   System.out.print(node.value + " ");
  //   if(node.right != null){
  //     inOrder(node.right);
  //   }
    
  // }
}
