# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def reverseOddLevels(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        if not root:
            return root
        q = deque([root])
        levelNo = 0

        while q:
            n = len(q)
            level = []

            for _ in range(n):
                node = q.popleft()
                level.append(node)

                if node.left:
                    q.append(node.left)
                if node.right:
                    q.append(node.right)

            if levelNo % 2 == 1:
                i, j = 0, len(level) - 1
                while i < j:
                    level[i].val, level[j].val = level[j].val, level[i].val
                    i += 1
                    j -= 1

            levelNo += 1
        return root
        