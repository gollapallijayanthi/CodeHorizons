class Solution:
    def numPrimeArrangements(self, n: int) -> int:
        mod=10**9+7
        def isPrime(x):
            if x<2:
                return False
            for i in range(2,int(x**0.5)+1):
                if x%i==0:
                    return False
            return True
        
        primes=0
        for i in range(1,n+1):
            if isPrime(i):
                primes+=1
        
        def fact(x):
            ans=1
            for i in range(2,x+1):
                ans=(ans*i)%mod
            return ans

        return (fact(primes)*fact(n-primes)%mod)
