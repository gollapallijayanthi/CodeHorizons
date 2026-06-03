class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        letter_map = {
            "2": "abc",
            "3": "def",
            "4": "ghi",
            "5": "jkl",
            "6": "mno",
            "7": "pqrs",
            "8": "tuv",
            "9": "wxyz",
        }
        ans,curr=[],[]

        def formCombi(ans,curr,ind,letter_map,digits):
            if ind==len(digits):
                ans.append("".join(curr))
                return
            
            for i in letter_map[digits[ind]]:
                
                curr.append(i)

                formCombi(ans,curr,ind+1,letter_map,digits)
                curr.pop()
        formCombi(ans,curr,0,letter_map,digits)
        
        return ans

    
        