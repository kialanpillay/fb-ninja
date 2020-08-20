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

    public static void main(String[]args){

    }
}
