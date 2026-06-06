class Solution:
    def minEnergy(self, n: int, brightness: int, intervals: list[list[int]]) -> int:
        intervals.sort()
        ans=[intervals[0]]
        for s,e in intervals[1:]:
            if s<=ans[-1][1]:
                ans[-1][1]=max(ans[-1][1],e)
            else:
                ans.append([s,e])
        totalLumi = 0
        totalShifts=len(ans)
        for i in ans:
            totalLumi=totalLumi+(i[1]-i[0]+1)
        totalBulbsOn=(brightness//3) + (0 if brightness%3==0 else 1)
        return totalLumi*totalBulbsOn

        
        