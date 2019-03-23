package CodingPractice.Tree;

class Node
{
    int data;
    Node left, right;
    int hd;

    public Node(int item)
    {
        data = item;
        left = right = null;
        hd = Integer.MAX_VALUE;
    }
}
