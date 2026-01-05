class Solution {
    int findDivisors(int num){
        int sum=0;
        int cnt=0;
        for(int i=1; i*i<=num; i++)
        {
            if(num%i==0) 
            {
               if(i*i==num)
               {
                sum+=i;
                cnt+=1;
               }
               else
               {
                 sum += i + (num / i);
                    cnt += 2;
               }

            }
            if(cnt>4) return 0;
        }
      if(cnt==4)  return sum;
      else return 0;
    }
    public int sumFourDivisors(int[] nums) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            int divsum=findDivisors(nums[i]);
            if(divsum>0)
            {
                mp.put(nums[i],mp.getOrDefault(nums[i],0)+divsum);
            }
        }
        int sum=0;
        for(Map.Entry<Integer,Integer>it:mp.entrySet()){
           
            int v=it.getValue();
            sum+=v;
        }
        return sum;
        
    }
}