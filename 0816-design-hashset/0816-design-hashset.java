class MyHashSet {
    public static int  isPresent( ArrayList<Integer>arr,int key)
    {
        int n=arr.size()-1;
        int low=0,high=n;
        while(low<=high)
        {
            if(arr.get(low)==key) return low;
            else if(arr.get(high)==key) return high;
            low++;
            high--;

        }
        return -1;
    }
    ArrayList<Integer>arr=new ArrayList<>();
    
    public MyHashSet() {
    
    }
    
    public void add(int key) {
      if(isPresent(arr,key)<0)  arr.add(key);
    }
    
    public void remove(int key) {
       int idx=isPresent(arr,key);
        if(idx>=0) arr.remove(idx);
    }
    
    public boolean contains(int key) {
       if(isPresent(arr,key)>=0) return true;
       else return false;
        
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */