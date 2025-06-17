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
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode>q=new LinkedList<>();
       
       
       int res=0;
        if (root == null) return 0;
        q.add(root);
        while(!q.isEmpty())
        {
            int len=q.size();
            int flag=1;
           
            for(int i=0; i<len; i++)
            {
                 TreeNode temp=q.poll();
               if (flag==1) 
               {
                res = temp.val; 
                flag=0;
               }
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
                
                
            }
           

        

        }
        return res;
        
    }
}
