# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def invertTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        if not root:
            return 
        lst = []
        lst.append(root)
        while len(lst) >0:
            n = len(lst)
            for i in range(n):
                curr = lst[0]
                lst.pop(0)
                if curr.left and curr.right:
                    curr.left ,curr.right = curr.right,curr.left
                    lst.append(curr.left)
                    lst.append(curr.right)
                elif curr.left and not curr.right:
                    lst.append(curr.left)
                    curr.left ,curr.right = curr.right,curr.left
                elif curr.right and not curr.left:
                    lst.append(curr.right)
                    curr.left ,curr.right = curr.right,curr.left
        
        return root
        


                
        