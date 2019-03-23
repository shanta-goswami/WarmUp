package CodingPractice.Tree;

// Recursive Java program to find the diameter of a
// Binary Tree


// A utility class to pass heigh object
class Height
{
    int h;
}

/* Class to print the Diameter */
class Diameter
{
    Node root;

    /* define height =0 globally and call diameterOpt(root,height)
    from main */
    int diameterOpt(Node root, Height height)
    {
		/* lh --> Height of left subtree
		rh --> Height of right subtree */
        Height lh = new Height(), rh = new Height();

        if (root == null)
        {
            height.h = 0;
            return 0; /* diameter is also 0 */
        }

		/* ldiameter --> diameter of left subtree
		rdiameter --> Diameter of right subtree */
		/* Get the heights of left and right subtrees in lh and rh
		And store the returned values in ldiameter and ldiameter */
        int ldiameter = diameterOpt(root.left, lh);
        int rdiameter = diameterOpt(root.right, rh);

		/* Height of current node is max of heights of left and
		right subtrees plus 1*/
        height.h = Math.max(lh.h, rh.h) + 1;

        return Math.max(lh.h + rh.h + 1, Math.max(ldiameter, rdiameter));
    }

    /* A wrapper over diameter(Node root) */
    int diameter()
    {
        Height height = new Height();
        return diameterOpt(root, height);
    }

    public static void main(String args[])
    {
        /* creating a binary tree and entering the nodes */
        Diameter tree = new Diameter();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("The diameter of given binary tree is : "
                + tree.diameter());
    }
}
