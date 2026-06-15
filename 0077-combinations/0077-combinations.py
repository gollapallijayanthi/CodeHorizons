class Solution:
    def combine(self, n: int, k: int) -> List[List[int]]:
        res = []

        def generate(start, curr):
            if len(curr) == k:
                res.append(curr[:])
                return

            for i in range(start, n + 1):
                curr.append(i)
                generate(i + 1, curr)
                curr.pop()

        generate(1, [])
        return res