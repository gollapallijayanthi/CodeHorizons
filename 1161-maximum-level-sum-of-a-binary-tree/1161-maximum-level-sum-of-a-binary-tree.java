/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxLevelSum(TreeNode root) {
        int ans = 1;
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode temp = root;
        q.add(root);

      int  maxSum = root.val;
        int levelCnt = 0;
        while (q.size() > 0) {
            int levelSum = 0;
            int levelSize = q.size();
           for(int i=0; i<levelSize; i++) {
                TreeNode curr = q.poll();
                levelSum += curr.val;
                if (curr.left != null)
                    q.add(curr.left);
                if (curr.right != null)
                    q.add(curr.right);
               
            }
            levelCnt += 1;
            if(maxSum < levelSum)
            {
                maxSum = levelSum;
                ans = levelCnt;
            }
        }
        return ans;

    }
}