import java.util.List;

public class Solution559 {
    public static void main(String[] args) {

    }
}
class Solution {
    public int maxDepth(Node root) {
        if(root== null)
            return 0;
        int max=0;
        for(int i=0;i<root.children.size();i++)
        {
            int depth=maxDepth(root.children.get(i));
            if(max<depth)
            {
                max=depth;
            }
        }
        return max+1;
    }
}
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};