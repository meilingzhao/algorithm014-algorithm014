/*
 * @lc app=leetcode.cn id=429 lang=java
 *
 * [429] N叉树的层序遍历
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        r(root, 0, result);
        return result;
    }

    private void r(Node root, int depth, List<List<Integer>> result) {
        if (root == null) {
            return;
        }
        if (depth + 1 > result.size()) {
            result.add(new ArrayList<Integer>());
        }
        result.get(depth).add(root.val);

        for (Node child : root.children) {
            if (child == null) {
                continue;
            }
            r(child, depth + 1, result);
        }
    }
}
// @lc code=end

