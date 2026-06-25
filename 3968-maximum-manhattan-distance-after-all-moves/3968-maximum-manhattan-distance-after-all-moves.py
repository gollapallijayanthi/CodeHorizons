class Solution:
    def maxDistance(self, moves: str) -> int:
        x = 0
        y = 0
        rem = 0
        for ch in moves:
            if ch == "L":
                x -=1
            elif ch == "R":
                x += 1
            elif ch == "U":
                y += 1
            elif ch == "D":
                y -=1
            elif ch == "_":
                rem += 1
        ans = rem + abs(x) + abs(y)
        return ans


        