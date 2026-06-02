class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        lst=[]
        for word in strs:
            w=list(word)
            list.sort(w)
            lst.append(list(w))
        ans=[]
        vis=[0]*len(strs)
        for i in range(len(strs)):
            if vis[i]!=1:
                curr=[]
                curr.append(strs[i])
                vis[i]=1
                for j in range(i+1,len(strs)):
                    if lst[i]==lst[j]:
                        vis[j]=1
                        curr.append(strs[j])
                ans.append(curr)
        return ans
                

        




        