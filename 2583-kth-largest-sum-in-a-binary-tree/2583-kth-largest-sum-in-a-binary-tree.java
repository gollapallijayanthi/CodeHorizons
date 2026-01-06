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
    public long kthLargestLevelSum(TreeNode root, int k) {
        Queue<TreeNode>q=new LinkedList<>();
        
        q.add(root);
        ArrayList<Long>levelSum = new ArrayList<>();
        while(q.size() > 0){
            int levelSize = q.size();
            long  currSum = 0;
            for( int i = 0; i < levelSize; i++){
                TreeNode curr = q.poll();
                currSum += curr.val;
                if( curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }
            levelSum.add(currSum);
        }
       
        Collections.sort(levelSum);
        if(levelSum.size()<k) return -1;
        return  levelSum.get(levelSum.size()-k);        
    }
}