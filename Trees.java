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

    static void insert(Node root, HashSet<Integer> s){
        insert(root.left, s); //Call on left-subtree
        s.add(root.data); //Insert data into set
        insert(root.right, s); //Call on right-subtree
    }

    //Assuming the trees consist of Integer
    static boolean equality(Node root1, Node root2){
        //Check if each root node is null, return true if both are, else false
        if(root1 == null){
          return (root2 == null);
        }

        // Instantiate sets, and convert trees
        Set<Integer> s1 = new HashSet<Integer>();
        Set<Integer> s2 = new HashSet<Integer>();
        insert(root1, s1);
        insert(root2, s2);

        // Return true if both sets are equal
        return s1.equals(s2);
    }

    static int countElements(Node root){
        if (root == null){
          return 0;  //base case if tree is empty
        }
        int count = 0; //initialise count variable for sub-tree
        //if node has children, increment
        if (root.left != null && root.right != null){
          count++;
        }
        //increment count by count of sub-trees recursively
        count += (countElements(root.left) + countElements(root.right));
        return res;
    }

    static int height(Node root){
        //base case if tree is empty
        if (root == null){
            return 0;
        }
        //recursively call function on each subtree
        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);

        if (leftHeight > rightHeight){
          return leftHeight + 1; //include root node
        }
        else{
          return rightDepth + 1;  //include root node
        }
    }

    public static void main(String[]args){

    }
}
