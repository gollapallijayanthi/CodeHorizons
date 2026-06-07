class Solution:
    def scoreBalance(self, s: str) -> bool:
        alphabets = "abcdefghijklmnopqrstuvwxyz"
        prefix = [0]*len(s)
        prefix[0] = alphabets.find(s[0]) + 1
        
        for i in range( 1, len(s) ):
            prefix [i] = prefix[i-1] + alphabets.find(s[i])+1
        n = len(prefix)
        for i in range(len(prefix)):
            if i > 0 and i < len(prefix)-1:
                if prefix[i] == prefix[ n-1] - prefix[i]:
                    return True
            else:
                if i == 0:
                    if prefix[i] == prefix[n-1]-prefix[i]:
                        return True
                else:
                    if prefix[n-1] == prefix[n-1]-prefix[i-1]:
                        return True

        
        return False





        