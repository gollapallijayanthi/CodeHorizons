class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0; i<bulbs.size(); i++){
            mp.put(bulbs.get(i),mp.getOrDefault(bulbs.get(i),0)+1);
        }
        ArrayList<Integer>res=new ArrayList<>();
        for(Map.Entry<Integer,Integer>it: mp.entrySet()){
            int val=it.getValue();
            if(val%2!=0){
                res.add(it.getKey());
            }
        }
        Collections.sort(res);
        return res;
    }
}