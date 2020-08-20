public class Trees{

    static boolean identical(Node root1, Node root2){
        //Check if each root node is null, return true if both are, else false
        if(root1 == null){
          return (root2 == null);
        }
        //If root node is not null
        if(root1 != null){
            //Check if the root data is identical, and call the function recursively
            //on the left and right subtrees
            return ((root1.data == root2.data) &&
                    identical(root1.left, root2.left) &&
                    identical(root1.right, root2.right));
        }
        return false;
    }

    public static void main(String[]args){

    }
}
